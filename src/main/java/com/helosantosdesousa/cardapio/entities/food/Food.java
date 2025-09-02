package com.helosantosdesousa.cardapio.entities.food;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.helosantosdesousa.cardapio.controller.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Table(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title= data.tittle();
    }
}
