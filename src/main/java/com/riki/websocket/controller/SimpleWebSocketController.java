package com.riki.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleWebSocketController {

    @GetMapping("/")
    public String index() {
        return "index"; // Akan mencari file index.html di folder templates
    }
}

