package guru.springframework.mypetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.mypetclinic.model.Vet;
import guru.springframework.mypetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return super.save(object);
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
