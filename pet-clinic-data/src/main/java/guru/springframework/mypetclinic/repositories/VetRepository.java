package guru.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import guru.springframework.mypetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
