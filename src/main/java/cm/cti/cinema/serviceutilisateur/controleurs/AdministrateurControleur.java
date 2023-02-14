package cm.cti.cinema.serviceutilisateur.controleurs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cm.cti.cinema.serviceutilisateur.models.Administrateur;
import cm.cti.cinema.serviceutilisateur.repositories.AdministrateurRepository;

@RestController
@RequestMapping(value = "api/administrateur")
public class AdministrateurControleur {
	
	@Autowired
	private AdministrateurRepository administrateurRepository;
	
	@GetMapping
	public List<Administrateur> findAllAdmin() {
		return administrateurRepository.findAll();
	}
	
	@GetMapping("/all")
	public List<Administrateur> findAllAdmin2() {
		return administrateurRepository.findAll();
	}
	
	@PostMapping
	public Administrateur create(
			@RequestBody Administrateur administrateur
			){
		administrateur.setId(null);
		
		if(administrateur.getPersonne().getNom().length() < 4) return null;
		
		administrateurRepository.save(administrateur);
		return administrateur;
	}
	
	@GetMapping("/{id}")
	public Administrateur findById(
			@PathVariable("id") Long id
			) {
		return administrateurRepository.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	public String delete(
			@PathVariable("id") Long id
			) {
		Administrateur administrateur = administrateurRepository.findById(id).get();
		administrateurRepository.delete(administrateur);
		return "OK";
	}
		
	}

