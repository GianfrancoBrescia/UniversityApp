package it.linksmt.academy.universityapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class Aula {

    private long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String edificio;

    private int numeroPosti = 0;
}
