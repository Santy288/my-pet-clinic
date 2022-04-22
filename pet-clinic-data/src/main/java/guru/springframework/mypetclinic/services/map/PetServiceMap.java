package guru.springframework.mypetclinic.services.map;

import java.util.Set;

import guru.springframework.mypetclinic.model.Owner;
import guru.springframework.mypetclinic.model.Pet;
import guru.springframework.mypetclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Pet save(Long id, Pet object) {
		// TODO Auto-generated method stub
		return super.save(id, object);
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
