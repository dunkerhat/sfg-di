package com.example.sfgdi.controller.pet;

import com.example.sfgdi.service.pet.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsBest() {
        return petService.getPetType();
    }
}
