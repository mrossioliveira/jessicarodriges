package com.projetofinal.projeto.controller;

import com.projetofinal.projeto.converter.VacinaConverter;
import com.projetofinal.projeto.dto.VacinaDTO;
import com.projetofinal.projeto.service.VacinaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/vacinas")
public class VacinaController {
    private final VacinaService vacinaService;
    private final vacinaConverter vacinaConverter;

    public VacinaController(VacinaConverter vacinaConverter) {
        this.vacinaConverter = vacinaConverter;
        this.vacinaService = vacinaService;
    }

    @PostMapping("")
    public VacinaDTO create(RequestBody CreateVacinaDTO vacina) {
        Vacina mappedVacina = this.vacinaConverter.convertToEntity(vacinas);
        return this.vacinaConverter.convertToDTO(this.vacinaService.create(mappedVacina));
    }

    @GetMapping
    public List<Vacina> findAll() {
        return this.vacinaService.findAll();
    }

    @GetMapping("/{id}")
    public Vacina findById(@PathVariable Long id) {
        return this.vacinaService.findById(id);
    }

    @PutMapping("/{id}")
    public Vacina update(@PathVariable Long id, @RequestBody Vacina vacinas) {
        return this.vacinaService.update(id, vacinas);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.vacinaService.delete(id);
    }
}
