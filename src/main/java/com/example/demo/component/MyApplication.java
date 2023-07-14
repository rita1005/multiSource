package com.example.demo.component;

import com.example.demo.MultiSourceApplication;
import com.example.demo.service.CopyDataService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component
public class MyApplication implements CommandLineRunner {

    private final CopyDataService copyDataService;

    public MyApplication(CopyDataService copyDataService) {
        this.copyDataService = copyDataService;
    }

    @Override
    public void run(String... args) throws Exception {
        copyDataService.copyData();
        SpringApplication.exit(SpringApplication.run(MultiSourceApplication.class, args));
    }
}
