package com.example.firstproject.service;

import com.example.firstproject.dto.CoffeeForm;
import com.example.firstproject.entity.Coffee;
import com.example.firstproject.repository.CoffeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CoffeeService {

    @Autowired
    private CoffeeRepository coffeeRepository;

    public List<Coffee> index() {
        return coffeeRepository.findAll();
    }

    public Coffee show(Long id) {
        return coffeeRepository.findById(id).orElse(null);
    }

    public Coffee create(CoffeeForm dto) {
        Coffee coffee = dto.toEntity();
        if (coffee.getId() != null) {
            return null;
        }
        return coffeeRepository.save(coffee);
    }

    public Coffee update(Long id, CoffeeForm dto) {
        Coffee coffee = dto.toEntity();

        Coffee target = coffeeRepository.findById(id).orElse(null);
        if (target == null || id != coffee.getId()) {
            return null;
        }

        target.patch(coffee);
        coffeeRepository.save(target);
        return target;
    }

    public Coffee delete(Long id) {
        Coffee coffee = coffeeRepository.findById(id).orElse(null);
        if (coffee == null) {
            return null;
        }
        coffeeRepository.delete(coffee);
        return coffee;
    }
}
