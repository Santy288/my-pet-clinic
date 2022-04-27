package guru.springframework.mypetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.mypetclinic.model.Owner;
import guru.springframework.mypetclinic.model.Pet;
import guru.springframework.mypetclinic.model.PetType;
import guru.springframework.mypetclinic.model.Vet;
import guru.springframework.mypetclinic.services.OwnerService;
import guru.springframework.mypetclinic.services.PetService;
import guru.springframework.mypetclinic.services.PetTypeService;
import guru.springframework.mypetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	
	
	
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}



	@Override
	public void run(String... args) throws Exception {
		
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		System.out.println("Pet Type loaded..");
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Mario");
		owner1.setLastName("Rossi");
		owner1.setAddress("Via Leopardi");
		owner1.setCity("Milano");
		owner1.setTelephone("2394798198");
		ownerService.save(owner1);
		
		Pet mikePet = new Pet();
		mikePet.setPetType(savedDogPetType);
		mikePet.setOwner(owner1);
		mikePet.setBirthDate(LocalDate.now());
		mikePet.setName("Mike");
		owner1.getPets().add(mikePet);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Luca");
		owner2.setLastName("Bianchi");
		owner1.setAddress("Via Leopardi");
		owner1.setCity("Milano");
		owner1.setTelephone("2394798198");
		ownerService.save(owner2);
		
		Pet billPet = new Pet();
		billPet.setPetType(savedCatPetType);
		billPet.setOwner(owner2);
		billPet.setBirthDate(LocalDate.now());
		billPet.setName("Bill");
		owner2.getPets().add(billPet);
		
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
