package cappe.springframework.pets;

//@Service
//@Profile({"dog", "default"})
public class DogPetServiceImpl implements PetService {
    @Override
    public String getPetType() {
        return "Dog is best";
    }
}
