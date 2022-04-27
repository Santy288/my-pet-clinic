package guru.springframework.mypetclinic.services.map;

import org.springframework.stereotype.Service;

import guru.springframework.mypetclinic.model.PetType;
import guru.springframework.mypetclinic.services.PetTypeService;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

}
