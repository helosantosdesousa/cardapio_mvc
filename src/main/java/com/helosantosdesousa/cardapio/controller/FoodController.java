package com.helosantosdesousa.cardapio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("food")
//toda vez que o endpoint for 'food' ele manda pra cá
public class FoodController {

    @GetMapping
    public void getAll(){

    }
}
