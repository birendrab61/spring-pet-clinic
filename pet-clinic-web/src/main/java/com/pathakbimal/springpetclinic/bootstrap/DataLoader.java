package com.pathakbimal.springpetclinic.bootstrap;

import com.pathakbimal.springpetclinic.model.Owner;
import com.pathakbimal.springpetclinic.model.Vet;
import com.pathakbimal.springpetclinic.services.OwnerService;
import com.pathakbimal.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1= new Owner();

        owner1.setFirstName("Bimal");
        owner1.setLastName("Pathak");
        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setFirstName("John");
        owner2.setLastName("Adams");
        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1= new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setFirstName("Brian");
        vet2.setLastName("Adams");
        vetService.save(vet2);

        System.out.println("Loaded vets....");

    }
}
