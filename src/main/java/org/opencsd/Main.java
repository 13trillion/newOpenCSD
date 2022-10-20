package org.opencsd;

import org.opencsd.OpenCSD.OpenCsdApplication;
import org.opencsd.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Main {

    @Autowired
    UserRepository userRepo;

    public static void main(String[] args){
        SpringApplication.run(OpenCsdApplication.class, args);
    }
}
