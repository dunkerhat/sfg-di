package cappe.springframework.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dog", "default"})
public class DogPetServiceImpl implements PetService {
    @Override
    public String getPetType() {
        return "Dog is best";
    }
}
