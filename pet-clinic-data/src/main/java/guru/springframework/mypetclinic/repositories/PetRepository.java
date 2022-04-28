package guru.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import guru.springframework.mypetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
