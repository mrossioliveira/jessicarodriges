package com.projetofinal.projeto.converter;

import com.projetofinal.projeto.dto.EstadoDTO;
import org.springframework.stereotype.Component;

@Component
public class VacinaConverter {

    public Vacina convertToEntity(CreateVacinaDTO dto) {
        Vacina estados = new Vacina();
        Vacinas.setNome(dto.getVacina());
        return vacinas;
    }

    public VacinaDTO convertToDTO(Vacina vacinas) {
        VacinaDTO dto = new VacinaDTO();
        dto.setId(vacinas.getId());
        dto.setNome(vacinas.getNome());
        dto.setOrigem(vacinas.getOrigem());
    }
}
