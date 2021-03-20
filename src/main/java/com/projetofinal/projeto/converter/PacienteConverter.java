package com.projetofinal.projeto.converter;

import com.projetofinal.projeto.dto.EstadoDTO;
import com.projetofinal.projeto.dto.PacienteDTO;
import com.projetofinal.projeto.model.Paciente;
import org.springframework.stereotype.Component;

@Component
public class PacienteConverter {
    public Paciente convertToEntity(CreatePacienteDTO dto) {
        Paciente pacientes = new Paciente();
        pacientes.setNome(dto.getPaciente());
        return estados;
    }

    public PacienteDTO convertToDTO(Paciente pacientes) {
        PacienteDTO dto = new EstadoDTO();
        dto.setId(pacientes.getId());
        dto.setNome(pacientes.getNome());
        dto.setMunicipio(pacientes.getMunicipio());
        dto.setVacina(pacientes.getVacina());
    }
}
