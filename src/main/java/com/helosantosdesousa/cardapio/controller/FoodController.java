package com.helosantosdesousa.cardapio.controller;

import com.helosantosdesousa.cardapio.entities.food.Food;
import com.helosantosdesousa.cardapio.entities.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("food")
//toda vez que o endpoint for 'food' ele manda pra cá
public class FoodController {
   @Autowired //usa ao inves de instanciar um objeto foodRepository
    private FoodRepository repository;

    @GetMapping
    public List<Food> getAll(){
        List<Food>foodList = repository.findAll();
        return foodList;
    }

}
