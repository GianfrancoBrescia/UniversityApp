package it.linksmt.academy.universityapp.service;

import it.linksmt.academy.universityapp.entity.Aula;
import it.linksmt.academy.universityapp.entity.Utente;
import it.linksmt.academy.universityapp.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void salvaStudente(User studente, Aula aula);

    List<Utente> recuperaTutto();
}
