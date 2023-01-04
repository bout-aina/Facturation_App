package ma.emsi.clientservice;

import ma.emsi.clientservice.entities.Client;
import ma.emsi.clientservice.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientServiceApplication implements CommandLineRunner {
    @Autowired
    ClientRepo clientRepo;
    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        clientRepo.save(new Client(null, "Client_1", "c1@client.ma"));
        clientRepo.save(new Client(null, "Client_2", "c2@client.ma"));
        clientRepo.save(new Client(null, "Client_3", "c3@client.ma"));
    }
}
