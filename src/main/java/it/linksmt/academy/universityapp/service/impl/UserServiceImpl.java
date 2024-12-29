package it.linksmt.academy.universityapp.service.impl;

import it.linksmt.academy.universityapp.entity.Aula;
import it.linksmt.academy.universityapp.entity.Utente;
import it.linksmt.academy.universityapp.model.User;
import it.linksmt.academy.universityapp.repository.UtenteRepository;
import it.linksmt.academy.universityapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UtenteRepository utenteRepository;

    @Override
    public void salvaStudente(User studente, Aula aula) {
        Utente utente = new Utente();
        utente.setAula(aula);
        utente.setUsername(studente.getUsername());
        utente.setPassword(studente.getPassword());
        utente.setNome(studente.getNome());
        utente.setCognome(studente.getCognome());
        utente.setEta(studente.getEta());
        utente.setDataDiNascita(studente.getDataDiNascita());
        utenteRepository.save(utente);
    }

    @Override
    public List<Utente> recuperaTutto() {
        return utenteRepository.findAll();
    }
}
