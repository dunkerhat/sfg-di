package cappe.springframework.pets;

//@Service
//@Profile({"cat"})
public class CatPetServiceImpl implements PetService {
    @Override
    public String getPetType() {
        return "Cat is best";
    }
}
