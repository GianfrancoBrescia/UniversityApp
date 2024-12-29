package it.linksmt.academy.universityapp.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "utente")
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

	@ManyToOne
	@JoinColumn(name = "IdAula", referencedColumnName = "Id")
	private Aula aula;

    @Column(name = "Username", nullable = false)
    private String username;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "Nome", nullable = false)
    private String nome;

    @Column(name = "Cognome", nullable = false)
    private String cognome;

    @Column(name = "Eta", nullable = false)
    private int eta;

    @Column(name = "DataDiNascita")
    private LocalDate dataDiNascita;
}
