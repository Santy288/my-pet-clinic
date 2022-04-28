package guru.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import guru.springframework.mypetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
