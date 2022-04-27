package guru.springframework.mypetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.mypetclinic.model.Owner;
import guru.springframework.mypetclinic.model.Vet;
import guru.springframework.mypetclinic.services.OwnerService;
import guru.springframework.mypetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	
	
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}



	@Override
	public void run(String... args) throws Exception {
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Mario");
		owner1.setLastName("Rossi");
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Luca");
		owner2.setLastName("Bianchi");
		ownerService.save(owner2);
		
		System.out.println("Owners loaded..");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Luigi");
		vet1.setLastName("Verdi");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Giancarlo");
		vet2.setLastName("Neri");
		vetService.save(vet2);
		
		System.out.println("Vets loaded..");
		
		
		
		
	}

}
