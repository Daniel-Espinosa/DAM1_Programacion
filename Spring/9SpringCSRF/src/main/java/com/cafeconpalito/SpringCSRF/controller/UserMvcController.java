/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafeconpalito.SpringCSRF.controller;


import com.cafeconpalito.SpringCSRF.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author produccion
 */
@Controller
public class UserMvcController {
    
     // 1ER PASO: OBTENER EL FORMULARIO EN EL FRONTEND (HTML)
    @GetMapping("/")
    public String getForm(Model model){
        model.addAttribute("user", new UserDTO());
        return "user-form";
    }

    // 2º PASO: RECIBIR EL FORMULARIO CON LOS DATOS RELLENOS
    @PostMapping("/users")
    public String save(@ModelAttribute("user") UserDTO user){
        System.out.println(user);
        return "congratulations";
    }
    
}
