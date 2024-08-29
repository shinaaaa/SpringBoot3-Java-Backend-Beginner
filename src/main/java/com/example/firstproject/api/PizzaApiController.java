package com.example.firstproject.api;

import com.example.firstproject.dto.PizzaDto;
import com.example.firstproject.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PizzaApiController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/api/pizzas")
    public ResponseEntity<List<PizzaDto>> index() {
        List<PizzaDto> dtos = pizzaService.index();
        return ResponseEntity.status(HttpStatus.OK).body(dtos);
    }

    @GetMapping("/api/pizzas/{pizzaId}")
    public ResponseEntity<PizzaDto> show(@PathVariable Long pizzaId) {
        PizzaDto dto = pizzaService.show(pizzaId);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    @PostMapping("/api/pizzas")
    public ResponseEntity<PizzaDto> create(@RequestBody PizzaDto dto) {
        PizzaDto createdDto = pizzaService.create(dto);
        return ResponseEntity.status(HttpStatus.OK).body(createdDto);
    }

    @PatchMapping("/api/pizzas/{pizzaId}")
    public ResponseEntity<PizzaDto> update(@PathVariable Long pizzaId, @RequestBody PizzaDto dto) {
        PizzaDto updatedDto = pizzaService.update(pizzaId, dto);
        return ResponseEntity.status(HttpStatus.OK).body(updatedDto);
    }

    @DeleteMapping("/api/pizzas/{pizzaId}")
    public ResponseEntity<PizzaDto> delete(@PathVariable Long pizzaId) {
        PizzaDto deletedDto = pizzaService.delete(pizzaId);
        return ResponseEntity.status(HttpStatus.OK).body(deletedDto);
    }
}
