package guru.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.mypetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
