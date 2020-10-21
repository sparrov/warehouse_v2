package com.szymonwrobel.module.home;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public GreetingsDto getGreetings(){
        return new GreetingsDto("Witaj w programie Magazyn 1.0");
    }
}
