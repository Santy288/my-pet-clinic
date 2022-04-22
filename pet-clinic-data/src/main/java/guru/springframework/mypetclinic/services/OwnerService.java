package guru.springframework.mypetclinic.services;

import java.util.Set;

import guru.springframework.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);

}
