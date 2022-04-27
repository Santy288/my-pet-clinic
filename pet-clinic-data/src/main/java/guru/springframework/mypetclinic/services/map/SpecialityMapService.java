package guru.springframework.mypetclinic.services.map;

import org.springframework.stereotype.Service;

import guru.springframework.mypetclinic.model.Speciality;
import guru.springframework.mypetclinic.services.SpecialityService;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

}
