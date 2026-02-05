package com.example.finalapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
@CrossOrigin
public class ItemController {

    @GetMapping
    public String testGet() {
        return "GET API working fine";
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Item addItem(@RequestBody Item item) {
        return item;
    }
}
