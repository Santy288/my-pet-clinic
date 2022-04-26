package guru.springframework.mypetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.mypetclinic.model.Pet;
import guru.springframework.mypetclinic.services.CrudService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
		
	}
	
	@Override
	public Set<Pet> findAll(){
		return super.findAll();
	}
	
	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
