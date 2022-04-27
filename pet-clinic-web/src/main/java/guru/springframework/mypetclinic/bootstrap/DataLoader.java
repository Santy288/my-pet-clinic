package guru.springframework.mypetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.mypetclinic.model.Owner;
import guru.springframework.mypetclinic.model.Pet;
import guru.springframework.mypetclinic.model.PetType;
import guru.springframework.mypetclinic.model.Speciality;
import guru.springframework.mypetclinic.model.Vet;
import guru.springframework.mypetclinic.services.OwnerService;
import guru.springframework.mypetclinic.services.PetService;
import guru.springframework.mypetclinic.services.PetTypeService;
import guru.springframework.mypetclinic.services.SpecialityService;
import guru.springframework.mypetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialityService specialityService;
	
	
	
	public DataLoader(
			OwnerService ownerService,
			VetService vetService,
			PetTypeService petTypeService,
			SpecialityService specialityService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialityService = specialityService;
	}



	@Override
	public void run(String... args) throws Exception {
		int count = petTypeService.findAll().size();
		
		if(count == 0) {
			loadData();
		}
		
	}
	
	private void loadData() {
		
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		System.out.println("Pet Type loaded..");
		
		Speciality radiology = new Speciality();
		radiology.setDescription("Radiology");
		Speciality savedRadiology = specialityService.save(radiology);
		
		Speciality surgery = new Speciality();
		surgery.setDescription("Surgery");
		Speciality savedSurgery = specialityService.save(surgery);
		
		Speciality dentistry = new Speciality();
		dentistry.setDescription("Dentistry");
		Speciality savedDentistry = specialityService.save(dentistry);
		
		System.out.println("Specialities loaded..");
		
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
		vet1.getSpecialities().add(savedDentistry);
		vet1.getSpecialities().add(savedSurgery);
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Giancarlo");
		vet2.setLastName("Neri");
		vet2.getSpecialities().add(savedRadiology);
		vetService.save(vet2);
		
		System.out.println("Vets loaded..");
		
		
	}

}
