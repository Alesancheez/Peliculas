package com.ale.Peliculas.Config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer{

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("*") //cualquier sitio web pueda hacer solicitudes
                    .allowedMethods("GET", "POST", "PUT", "DELETE","OPTIONS")
                    .allowCredentials(false) //Permite el envío de cookies junto con las solicitudes.
                    .allowedHeaders("*");
        }
}

