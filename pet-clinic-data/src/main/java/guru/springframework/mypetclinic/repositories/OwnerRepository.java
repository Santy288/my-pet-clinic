package guru.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import guru.springframework.mypetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

	Owner findByLastName(String lastName);
	
}
