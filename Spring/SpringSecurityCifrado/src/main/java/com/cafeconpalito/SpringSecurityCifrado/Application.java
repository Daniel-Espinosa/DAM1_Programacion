package com.cafeconpalito.SpringSecurityCifrado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.config.authentication.PasswordEncoderParser;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
                
                UsuarioRepository repository = context.getBean(UsuarioRepository.class);
                
                
                BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

                Usuario user1 = new Usuario(null, "Daniel", passwordEncoder.encode("12345"));
                
                repository.save(user1);
                
                
                
        }

}
