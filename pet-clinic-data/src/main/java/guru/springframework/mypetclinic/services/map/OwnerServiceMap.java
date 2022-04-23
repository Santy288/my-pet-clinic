package guru.springframework.mypetclinic.services.map;

import java.util.Set;

import guru.springframework.mypetclinic.model.Owner;
import guru.springframework.mypetclinic.services.CrudService;


public abstract class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Owner save(Long id, Owner object) 
	{ 
		return super.save(id, object);
		}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
		
	}
	
	@Override
	public Set<Owner> findAll(){
		return super.findAll();
	}
	
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}





}
