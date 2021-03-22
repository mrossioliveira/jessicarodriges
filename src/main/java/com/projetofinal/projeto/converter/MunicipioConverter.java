package com.projetofinal.projeto.converter;

import com.projetofinal.projeto.dto.MunicipioDTO;
import com.projetofinal.projeto.model.Municipio;
import org.springframework.stereotype.Component;

// TODO: Importar outras classes utilizadas por esse converter

@Component
public class MunicipioConverter {
    // TODO: Usar nome singular para variáveis que não sejam listas

    // TODO: Criar classe CreateMunicipioDTO
    public Municipio convertToEntity(CreateMunicipioDTO dto) {
        Municipio municipios = new Municipio();
        // TODO: setNome não deveria receber um nome?
        municipios.setNome(dto.getMunicipio());
        return municipios;
    }

    public MunicipioDTO convertToDTO(Municipio municipios) {
        MunicipioDTO dto = new MunicipioDTO();
        dto.setId(municipios.getId());
        dto.setNome(municipios.getNome());

        // TODO: O tipo do estado no dto é String, mas no município é Estado. Precisam ser do mesmo tipo.
        dto.setEstado(municipios.getEstado());

        // TODO: Falta operação de retorno
    }
}
