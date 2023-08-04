/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafeconaplito.rest.controller;

import com.cafeconaplito.rest.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author produccion
 */
@RestController
public class PruebasWeb {

@GetMapping("/hola")
    public String holaMundo (){
        return "Hola Mundo blabasdasdla";
    }
    
    @GetMapping("/bots")
    public String bots(){
        return """
               <!doctype html>
               <html lang="en">
                 <head>
                   <meta charset="utf-8">
                   <meta name="viewport" content="width=device-width, initial-scale=1">
                   <title>Bootstrap demo</title>
                   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
                 </head>
                 <body>
                   <h1>Hello, world!</h1>
                   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
                 </body>
               </html>
               
               """;
        
    }
    
    
    public double calculatePrice(Book book){
        double price = book.getPrice();

        if(book.getPages() > 300){
            price += 5;
        }
        // envio
        price += 2.99;
        return price;
    }
    
    
}
