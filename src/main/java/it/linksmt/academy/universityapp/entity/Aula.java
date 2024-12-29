package it.linksmt.academy.universityapp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "aula")
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Nome", nullable = false)
    private String nome;

    @Column(name = "Edificio", nullable = false)
    private String edificio;

    @Column(name = "NumeroPosti", nullable = false)
    private int numeroPosti;
}
