package guru.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import guru.springframework.mypetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {

}
