/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.melayer.nileshsir.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aniruddha
 */

@RestController
public class MeController {
    
    public static Integer number = 2;
    
    @RequestMapping(value = "/number", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getNumber(){
        
        ResponseEntity<String> entity = new ResponseEntity<>(""+number, HttpStatus.OK);
        
        return entity;
    }
    
    @RequestMapping(value = "/assign/{num}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> setNumber(@PathVariable Integer num){
        
        
        number = num;
        
        ResponseEntity<String> entity = new ResponseEntity<>("Changed Number is "+number, HttpStatus.OK);
        
        return entity;
    }
}
