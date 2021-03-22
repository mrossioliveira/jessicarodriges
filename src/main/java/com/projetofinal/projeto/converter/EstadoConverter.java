package com.projetofinal.projeto.converter;

import com.projetofinal.projeto.dto.EstadoDTO;
import com.projetofinal.projeto.model.Estado;
import org.springframework.stereotype.Component;

@Component
public class EstadoConverter {
    // TODO: Usar nome singular para variáveis que não sejam listas

    // TODO: Criar classe CreateEstadoDTO
    public Estado convertToEntity(CreateEstadoDTO dto) {
        Estado estados = new Estado();
        // TODO: setNome não deveria receber um nome?
        estados.setNome(dto.getEstado());
        return estados;
    }

    public EstadoDTO convertToDTO(Estado estados) {
        EstadoDTO dto = new EstadoDTO();
        dto.setId(estados.getId());
        dto.setNome(estados.getNome());
        dto.setUf(estados.getUf());

        // TODO: Esse método retorna um EstadoDTO. Faltou a instrução de retorno.
    }
}
