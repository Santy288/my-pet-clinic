package guru.springframework.mypetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.mypetclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {
	
	private final OwnerService ownerService;

	
	
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}



	@RequestMapping({"","/index","/index.html"})
	public String listOfOwners(Model m) {
		
		m.addAttribute("owners",ownerService.findAll());
		
		return "owners/index";
	}

}
