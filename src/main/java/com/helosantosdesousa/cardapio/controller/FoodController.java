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

    // Usamos um DTO (Data Transfer Object) em vez de retornar a entidade diretamente para separar as camadas da aplicação, proteger dados sensíveis, controlar exatamente quais campos serão expostos na API, formatar ou processar informações antes de enviá-las, e evitar problemas com relacionamentos `lazy` do Hibernate ao serializar para JSON.
    @GetMapping
    public List<FoodResponseDTO> getAll(){
        List<FoodResponseDTO>foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }

}
