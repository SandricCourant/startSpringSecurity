package com.example.demo.controllers;

import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class AuthentificationController {
    @Autowired
    private UserService userService;
    @Value("${authentification.clientId}")
    private String clientId;

    private String redirectUri = "http://localhost:8080/redirecturl";

    @GetMapping("/authentification/connexionurl")
    public String generatedUri(){
        return "https://api.asgardeo.io/t/imeshaorg/oauth2/authorize?scope=openid email profile&redirect_uri=" + redirectUri + "&client_id=" + clientId;
    }
    @GetMapping("/redirecturl")
    public void redirectURL(@RequestParam String code, @RequestParam String sessions_state){
        /*http://localhost:8080/redirecturl
        ?code=66debf10-0463-388b-9645-762a551d1d2b
        &session_state=acbe09284a8bd1b3e35b7e1b31a1b589668f739f7716ed5ee907d847cd5d5307.V7FrGjEkIM4YioYbY14F6w*/
    }
}
