package com.example.demo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Order {
    private String id;
    private String content;
}
