package guru.springframework.mypetclinic.services;

import java.util.Set;

import guru.springframework.mypetclinic.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();

}
