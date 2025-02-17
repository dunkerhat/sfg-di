package com.example.sfgdi.config;

import cappe.springframework.pets.PetService;
import cappe.springframework.pets.PetServiceFactory;
import com.example.sfgdi.repositories.EnglishGreetingsRepository;
import com.example.sfgdi.repositories.EnglishGreetingsServiceImpl;
import com.example.sfgdi.service.I18nEnglishServiceImpl;
import com.example.sfgdi.service.I18nSpanishServiceImpl;
import com.example.sfgdi.service.greetings.ConstructorGreetingServiceImpl;
import com.example.sfgdi.service.greetings.PrimaryGreetingService;
import com.example.sfgdi.service.greetings.PropertyGreetingServicImpl;
import com.example.sfgdi.service.greetings.SetterGreetingServiceImpl;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource("classpath:di-config.xml")
public class GreetingServiceConfig {

    @Bean
    public PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Bean
    @Profile({"dog", "default"})
    public PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Bean
    @Profile({"cat"})
    public PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Bean("i18nService")
    @Profile({"ES", "default"})
    public I18nSpanishServiceImpl I18nSpanishServiceImpl(){
        return new I18nSpanishServiceImpl();

    }

    @Bean
    public EnglishGreetingsRepository englishGreetingsRepository() {
        return new EnglishGreetingsServiceImpl();
    }

    @Bean
    @Profile("EN")
    public I18nEnglishServiceImpl i18nService(EnglishGreetingsRepository englishGreetingsRepository){
        return new I18nEnglishServiceImpl(englishGreetingsRepository);
    }

    @Bean
    @Primary
    public PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

//    @Bean
    public ConstructorGreetingServiceImpl constructorGreetingServiceImpl(){
        return new ConstructorGreetingServiceImpl();
    }

    @Bean
    public PropertyGreetingServicImpl propertyGreetingServiceImpl(){
        return new PropertyGreetingServicImpl();
    }

    @Bean
    public SetterGreetingServiceImpl setterGreetingServiceImpl(){
        return new SetterGreetingServiceImpl();
    }
}
