package com.cafeconpalito.DataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
                ApplicationContext context= SpringApplication.run(Application.class, args);
                
                CocheRepository repository = context.getBean(CocheRepository.class);
                
                System.out.println(repository.count());
                
                //Crear y almacenar un coche
                
                Coche c1 =new Coche(null,"Dacia","Sandero");
                
                repository.save(c1);
                
                //Recuperar todos los coches
                System.out.println(repository.findAll());
	}

}
