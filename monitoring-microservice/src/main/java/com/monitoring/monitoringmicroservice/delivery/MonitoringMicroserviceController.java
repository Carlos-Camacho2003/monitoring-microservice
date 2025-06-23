package com.monitoring.monitoringmicroservice.delivery;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MonitoringMicroserviceController {
    @GetMapping("/health")
    public String healthCheck() {
        return "Monitoring Microservice is running!";
    }

    @GetMapping("/status")
    public String statusCheck() {
        return "Monitoring Microservice is operational.";
    }
}
