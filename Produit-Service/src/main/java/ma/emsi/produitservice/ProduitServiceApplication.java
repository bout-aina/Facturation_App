package ma.emsi.produitservice;

import ma.emsi.produitservice.entities.Produit;
import ma.emsi.produitservice.repos.ProduitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProduitServiceApplication implements CommandLineRunner {
    @Autowired
    ProduitRepo produitRepo;
    public static void main(String[] args) {
        SpringApplication.run(ProduitServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        produitRepo.save(new Produit(null, "Samsung watch 5", "SMGW5", 4500.0F));
        produitRepo.save(new Produit(null, "Samsung galaxy S20", "SMGG20", 9500.0F));
        produitRepo.save(new Produit(null, "Macbook Pro M1", "MCBPM1", 18300.0F));
        produitRepo.save(new Produit(null, "Ipad Pro 13", "IPP13", 7500.0F));
    }
}
