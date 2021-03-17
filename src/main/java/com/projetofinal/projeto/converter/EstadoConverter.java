package com.projetofinal.projeto.converter;

import com.projetofinal.projeto.dto.EstadoDTO;
import org.springframework.stereotype.Component;

@Component
public class EstadoConverter {

    public Estado convertToEntity(CreateEstadoDTO dto) {
        Estado estados = new Estado();
        estados.setNome(dto.getEstado());
        return estados;
    }

    public EstadoDTO convertToDTO(Estado estados) {
        EstadoDTO dto = new EstadoDTO();
        dto.setId(estados.getId());
        dto.setNome(estados.getNome());
        dto.setUf(estados.getUf());
    }
}
