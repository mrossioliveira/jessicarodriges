package com.projetofinal.projeto.controller;

import com.projetofinal.projeto.converter.MunicipioConverter;
import com.projetofinal.projeto.dto.EstadoDTO;
import com.projetofinal.projeto.dto.MunicipioDTO;
import com.projetofinal.projeto.model.Estado;
import com.projetofinal.projeto.service.MunicipioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/municipios")
public class MunicipioController {
    private final MunicipioService municipioService;
    private final MunicipioConverter municipioConverter;

    // TODO: Passar o MunicipioService como parametro para o construtor
    // Note que você está passando apenas o MuniciopioConverter e o compilador não
    // sabe onde encontrar o municiopio service na linha 20.
    public MunicipioController(MunicipioConverter municipioConverter) {
        this.municipioConverter = municipioConverter;
        this.municipioService = municipioService;
    }

    // TODO: Criar CreateMunicipioDTO
    // TODO: Alterar retorno para MunicipioDTO e não EstadoDTO
    @PostMapping("")
    public EstadoDTO create(@RequestBody CreateMunicipioDTO municipio) {
        // TODO: Alterar tipo da variável para MunicipioDTO
        Estado mappedMunicipio = this.municipioConverter.convertToEntity(municipio);
        // TODO: Criar método create na classe MunicipioService
        return this.municipioConverter.convertToDTO(this.municipioService.create(mappedMunicipio));
    }

    @GetMapping
    public List<MunicipioDTO> findAll() {
        // TODO: Criar método findAll na classe MunicipioService
        // TODO: Usar converter para converter para DTO. Veja que o método retorna DTOs.
        return this.municipioService.findAll();
    }

    @GetMapping("/{id}")
    public MunicipioDTO findById(@PathVariable Long id) {
        // TODO: Criar método findById na classe MunicipioService
        return this.municipioService.findById(id);
    }

    @PutMapping("/{id}")
    public MunicipioDTO update(@PathVariable Long id, @RequestBody MunicipioDTO municipio) {
        // TODO: Criar método update na classe MunicipioService
        return this.municipioService.update(id, municipio);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        // TODO: Criar método delete na classe MunicipioService
        this.municipioService.delete(id);
    }
}
