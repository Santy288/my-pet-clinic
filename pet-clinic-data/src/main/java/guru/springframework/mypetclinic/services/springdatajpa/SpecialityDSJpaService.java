package guru.springframework.mypetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.mypetclinic.model.Speciality;
import guru.springframework.mypetclinic.repositories.SpecialityRepository;
import guru.springframework.mypetclinic.services.SpecialityService;

@Service
@Profile("springdatajpa")
public class SpecialityDSJpaService implements SpecialityService {
	
	private final SpecialityRepository specialityRepository;
	
	

	public SpecialityDSJpaService(SpecialityRepository specialityRepository) {
		super();
		this.specialityRepository = specialityRepository;
	}

	@Override
	public Set<Speciality> findAll() {
		// TODO Auto-generated method stub
		Set<Speciality> specialities = new HashSet<>();
		specialityRepository.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public Speciality findById(Long id) {
		// TODO Auto-generated method stub
		return specialityRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality object) {
		// TODO Auto-generated method stub
		return specialityRepository.save(object);
	}

	@Override
	public void delete(Speciality object) {
		// TODO Auto-generated method stub
		specialityRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		specialityRepository.deleteById(id);
	}

}
