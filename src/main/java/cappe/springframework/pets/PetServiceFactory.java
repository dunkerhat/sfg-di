package cappe.springframework.pets;

public class PetServiceFactory {

    public PetService getPetService(String petType) {
        switch(petType){
            case "cat":
                return new CatPetServiceImpl();
            case "dog":
                return new DogPetServiceImpl();
            default:
                return new DogPetServiceImpl();
        }

    }
}
