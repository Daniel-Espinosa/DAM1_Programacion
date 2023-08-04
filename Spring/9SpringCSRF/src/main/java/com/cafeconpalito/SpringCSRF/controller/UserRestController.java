/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafeconpalito.SpringCSRF.controller;

import com.cafeconpalito.SpringCSRF.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author produccion
 */
@RestController
public class UserRestController {
    
    @GetMapping("/api/hola")
    public String hola(){
        return "hola mundo";
    }
    
    @PostMapping ("/api/users")
    public String save(@RequestBody UserDTO user){
        System.out.println(user);
        return "OK";
    }
    
    @GetMapping ("/api/adios")
    public String adios(){
        return "adios mundo";
    }
    
}
