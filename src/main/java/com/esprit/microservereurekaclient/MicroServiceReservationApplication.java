package com.esprit.microservereurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MicroServiceReservationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceReservationApplication.class, args);
    }
    @Autowired
    private ReservationRepository repository;

    @Bean
    ApplicationRunner init(){
        return (args)-> {
            //Save
            repository.save(new Reservation(14405812,"2023","test"));
            repository.save(new Reservation(14405812,"2023","test"));
            //fetch
            repository.findAll().forEach(System.out::println);
        };
    }
}
