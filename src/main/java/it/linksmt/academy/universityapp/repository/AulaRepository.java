package it.linksmt.academy.universityapp.repository;

import it.linksmt.academy.universityapp.entity.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Long> {
}
