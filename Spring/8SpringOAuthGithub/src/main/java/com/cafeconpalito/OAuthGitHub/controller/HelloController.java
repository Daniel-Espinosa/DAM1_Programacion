/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafeconpalito.OAuthGitHub.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




/**
 *
 * @author produccion
 */
@Controller
public class HelloController {
    
    @GetMapping("/")
    public String index(){
        return "index";
    }
    
    @GetMapping("/page1")
    public String page1(Model model){
        model.addAttribute("message", "Hola mundo desde Spring MVC!!");
        return "page1";
    }
    
    @GetMapping("/page2")
    public String page2(Model model, @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient client, @AuthenticationPrincipal OAuth2User user){
        model.addAttribute("clientName", client.getClientRegistration().getClientName());
        model.addAttribute("userName", user.getName());
        model.addAttribute("userAttributes", user.getAttributes());
        return "page2";
    }
    
}
