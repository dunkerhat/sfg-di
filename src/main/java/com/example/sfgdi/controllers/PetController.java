package com.example.sfgdi.controllers;

import cappe.springframework.pets.PetService;
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
