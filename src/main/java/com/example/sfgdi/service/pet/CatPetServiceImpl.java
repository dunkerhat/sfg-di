package com.example.sfgdi.service.pet;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"cat"})
public class CatPetServiceImpl implements PetService{
    @Override
    public String getPetType() {
        return "Cat is best";
    }
}
