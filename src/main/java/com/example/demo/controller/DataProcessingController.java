package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DataProcessingService;

import java.util.concurrent.CompletableFuture;

@RestController
public class DataProcessingController {

    @Autowired
    private DataProcessingService dataProcessingService;

    @GetMapping("/start-process")
    public String startProcess() {
        CompletableFuture<String> future = dataProcessingService.processDataAsync();
        return "Proses dimulai. Anda dapat melanjutkan pekerjaan Anda.";
    }
}
