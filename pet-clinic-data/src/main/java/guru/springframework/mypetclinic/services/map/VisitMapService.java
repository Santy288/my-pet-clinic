package guru.springframework.mypetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.mypetclinic.model.Visit;
import guru.springframework.mypetclinic.services.VisitService;

@Service
@Profile({"default","map"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {
	
	@Override
	public Visit save(Visit visit) {
		if(visit.getPet() == null  || visit.getPet().getOwner() == null || visit.getPet().getId() == null
				|| visit.getPet().getOwner().getId() == null) {
			throw new RuntimeException("Invalid");
		}
		
		return super.save(visit);
	}

}
