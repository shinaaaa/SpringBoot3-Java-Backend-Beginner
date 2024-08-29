package com.example.firstproject.service;

import com.example.firstproject.dto.PizzaDto;
import com.example.firstproject.entity.Pizza;
import com.example.firstproject.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public List<PizzaDto> index() {
        return pizzaRepository.findAll()
                .stream()
                .map(PizzaDto::createPizzaDto)
                .collect(Collectors.toList());
    }

    public PizzaDto show(Long pizzaId) {
        Pizza pizza = pizzaRepository.findById(pizzaId)
                .orElseThrow(() -> new IllegalArgumentException("피자가 없습니다."));

        return PizzaDto.createPizzaDto(pizza);
    }

    @Transactional
    public PizzaDto create(PizzaDto dto) {
        Pizza pizza = dto.toEntity();
        Pizza save = pizzaRepository.save(pizza);

        return PizzaDto.createPizzaDto(save);
    }

    @Transactional
    public PizzaDto update(Long pizzaId, PizzaDto dto) {
        Pizza target = pizzaRepository.findById(pizzaId)
                .orElseThrow(() -> new IllegalArgumentException("피자가 없습니다."));

        target.patch(dto);
        pizzaRepository.save(target);
        return PizzaDto.createPizzaDto(target);
    }

    @Transactional
    public PizzaDto delete(Long pizzaId) {
        Pizza target = pizzaRepository.findById(pizzaId)
                .orElseThrow(() -> new IllegalArgumentException("피자가 없습니다."));

        pizzaRepository.delete(target);
        return PizzaDto.createPizzaDto(target);
    }
}
