package cm.cti.cinema.serviceutilisateur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import cm.cti.cinema.serviceutilisateur.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
