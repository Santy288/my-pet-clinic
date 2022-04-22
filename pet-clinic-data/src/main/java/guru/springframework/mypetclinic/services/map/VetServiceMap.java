package guru.springframework.mypetclinic.services.map;

import java.util.Set;

import guru.springframework.mypetclinic.model.Vet;
import guru.springframework.mypetclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	@Override
	public Vet save(Long id, Vet object) {
		// TODO Auto-generated method stub
		return super.save(id, object);
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
		
	}
	
	@Override
	public Set<Vet> findAll(){
		return super.findAll();
	}
	
	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
}
