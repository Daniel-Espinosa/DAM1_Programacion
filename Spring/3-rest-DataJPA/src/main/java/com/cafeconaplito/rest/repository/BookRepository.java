/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cafeconaplito.rest.repository;

import com.cafeconaplito.rest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author produccion
 *
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    
}
