package it.linksmt.academy.universityapp.service.impl;

import it.linksmt.academy.universityapp.model.Aula;
import it.linksmt.academy.universityapp.repository.AulaRepository;
import it.linksmt.academy.universityapp.service.AulaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AulaServiceImpl implements AulaService {

    private final AulaRepository aulaRepository;

    @Override
    public void salvaAula(Aula aulaModel) {
        it.linksmt.academy.universityapp.entity.Aula aula = new it.linksmt.academy.universityapp.entity.Aula();
        aula.setNome(aulaModel.getNome());
        aula.setEdificio(aulaModel.getEdificio());
        aula.setNumeroPosti(aulaModel.getNumeroPosti());
        aulaRepository.save(aula);
    }

    @Override
    public it.linksmt.academy.universityapp.entity.Aula recuperaAula(long id) {
        return aulaRepository.findById(id).orElse(null);
    }

    @Override
    public List<it.linksmt.academy.universityapp.entity.Aula> recuperaTutto() {
        return aulaRepository.findAll();
    }
}
