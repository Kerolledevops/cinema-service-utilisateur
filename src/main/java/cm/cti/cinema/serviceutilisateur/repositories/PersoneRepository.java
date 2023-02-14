package cm.cti.cinema.serviceutilisateur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import cm.cti.cinema.serviceutilisateur.models.Personne;

@Repository
public interface PersoneRepository extends JpaRepository<Personne, Long>{

}
