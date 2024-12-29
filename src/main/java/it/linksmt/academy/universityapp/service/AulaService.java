package it.linksmt.academy.universityapp.service;

import it.linksmt.academy.universityapp.model.Aula;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AulaService {

    void salvaAula(Aula aulaModel);

    it.linksmt.academy.universityapp.entity.Aula recuperaAula(long id);

    List<it.linksmt.academy.universityapp.entity.Aula> recuperaTutto();
}
