package com.projetofinal.projeto.controller;

import com.projetofinal.projeto.converter.EstadoConverter;
import com.projetofinal.projeto.dto.EstadoDTO;
import com.projetofinal.projeto.model.Estado;
import com.projetofinal.projeto.service.EstadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/estados")
public class EstadoController {
    private final EstadoService estadoService;
    private final EstadoConverter estadoConverter;

    public EstadoController(EstadoService estadoService, EstadoConverter estadoConverter) {
        this.estadoService = estadoService;
        this.estadoConverter = estadoConverter;
    }

    @PostMapping
    public EstadoDTO create(@RequestBody CreateEstadoDTO estado) {
        // TODO: Criar DTO CreateEstadoDTO com os campos que serão usados para criar um novo Estado

        Estado mappedEstado = this.estadoConverter.convertToEntity(estado);
        // TODO: Implementar método create na classe EstadoService
        return this.estadoConverter.convertToDTO(this.estadoService.create(mappedEstado));
    }

    @GetMapping
    public List<Estado> findAll() {
        // TODO: Criar método findAll na classe EstadoService
        return this.estadoService.findAll();
    }

    @GetMapping("/{id}")
    public Estado findById(@PathVariable Long id) {
        // TODO: Criar método findById na classe EstadoService
        return this.estadoService.findById(id);
    }

    @PutMapping("/{id}")
    public Estado update(@PathVariable Long id, @RequestBody Estado estado) {
        // TODO: Criar método update na classe EstadoService
        return this.estadoService.update(id, estado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        // TODO: Criar método delete na classe EstadoService
        this.estadoService.delete(id);
    }
}
