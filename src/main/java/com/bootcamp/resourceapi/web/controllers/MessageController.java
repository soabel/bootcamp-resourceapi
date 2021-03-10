package com.bootcamp.resourceapi.web.controllers;

import com.bootcamp.resourceapi.domain.dto.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MessageController {

    @GetMapping("/public")
    public Message publicEndpoint(){
        return new Message("OK. No necesitas autenticarte para utilizar este endpoint");
    }

    @GetMapping("/private")
    public  Message privateEndpoint(){
        return new Message("OK. Te has autenticado");
    }

    @PostMapping("/private-save")
    public Message privateExecEndpoint() {
        return new Message("OK. Te has autenticado con un token para operaciones SAVE");
    }
}
