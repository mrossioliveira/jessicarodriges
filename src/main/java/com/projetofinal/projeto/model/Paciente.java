package com.projetofinal.projeto.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name="data")
    private Date data;

    @ManyToOne
    @JoinColumn(name="vacina")
    private Vacina vacina;

    @ManyToOne
    @JoinColumn(name = "municipio")
    private Municipio municipio;


}
