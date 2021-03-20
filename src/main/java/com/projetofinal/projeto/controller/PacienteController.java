package com.projetofinal.projeto.controller;

import com.projetofinal.projeto.converter.PacienteConverter;
import com.projetofinal.projeto.dto.PacienteDTO;
import com.projetofinal.projeto.model.Paciente;
import com.projetofinal.projeto.service.PacienteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/pacientes")
public class PacienteController {
    private final PacienteService pacienteService;
    private final PacienteConverter pacienteConverter;

    public PacienteController(PacienteConverter pacienteConverter) {
        this.pacienteConverter = pacienteConverter;
        this.pacienteService = pacienteService;
    }

    @PostMapping("")
    public PacienteDTO create(RequestBody CreatePacienteDTO pacientes) {
        Paciente mappedPaciente = this.pacienteConverter.convertToEntity(pacientes);
        return this.pacienteConverter.convertToDTO(this.pacienteService.create(mappePaciente));
    }

    @GetMapping
    public List<Paciente> findAll() {
        return this.pacienteService.findAll();
    }

    @GetMapping("/{id}")
    public Paciente findById(@PathVariable Long id) {
        return this.pacienteService.findById(id);
    }

    @PutMapping("/{id}")
    public Paciente update(@PathVariable Long id, @RequestBody Estado pacientes) {
        return this.pacienteService.update(id, pacientes);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.pacienteService.delete(id);
    }
}
