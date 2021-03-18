package com.projetofinal.projeto.converter;

import com.projetofinal.projeto.dto.EstadoDTO;
import org.springframework.stereotype.Component;

@Component
public class MunicipioConverter {

    public Municipio convertToEntity(CreateMunicipioDTO dto) {
        Municipio municipios = new Municipio();
        municipios.setNome(dto.getMunicipio());
        return municipios;
    }

    public MunicipioDTO convertToDTO(Municipio municipios) {
        MunicipioDTO dto = new MunicipioDTO();
        dto.setId(municipios.getId());
        dto.setNome(municipios.getNome());
        dto.setEstado(municipios.getEstado());
    }
}
