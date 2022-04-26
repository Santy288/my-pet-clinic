package guru.springframework.mypetclinic.services;

import java.util.Set;

import guru.springframework.mypetclinic.model.Vet;


public interface CrudService<T, ID> {
	
	Set<T> findAll();
	T findById(ID id);
	T save(T object);
	void delete(T object);
	void deleteById(ID id);

}
