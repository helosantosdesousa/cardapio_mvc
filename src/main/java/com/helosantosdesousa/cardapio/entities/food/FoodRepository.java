package com.helosantosdesousa.cardapio.entities.food;

import org.springframework.data.jpa.repository.JpaRepository;

//é um repositório do Spring Data JPA. Ele serve como a ponte entre a aplicação e o banco de dados, permitindo salvar, buscar, atualizar e excluir objetos (Food) sem você precisar escrever SQL manualmente.
public interface FoodRepository extends JpaRepository<Food, Long> {
}
