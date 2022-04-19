package metalogy.springframework.sfgdi.controllers;

import com.metalogy.pets.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest() {
        return petService.getPetType();
    }
}