package com.helosantosdesousa.cardapio.controller;

import com.helosantosdesousa.cardapio.entities.food.Food;

public record FoodResponseDTO(Long id, String tittle, String image, Integer price) {
    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
