package com.example.demo.service;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class DataProcessingService {

    @Async
    public CompletableFuture<String> processDataAsync() {
        try {
            // Simulasi proses yang lama
            Thread.sleep(300000); // 5 menit
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return CompletableFuture.completedFuture("Proses selesai");
    }
}