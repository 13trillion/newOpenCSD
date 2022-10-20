package org.opencsd.repo;

import org.opencsd.model.User;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class UserStorage extends SimpleMongoRepository{


    public UserStorage(MongoEntityInformation metadata, MongoOperations mongoOperations) {
        super(metadata, mongoOperations);
    }

    // TODO
    public List<User> findAllUsers(String preference){
        return null;
    }

    // TODO
    public User lookupUser(long id){
        return null;
    }

    private UserRepository userRepresentation;

    public void createUser(String name, String email, String password, String username){
        System.out.println("Tables being created.");

        userRepresentation.save(new User(1, "John", "johnny101", "john@mail.com", "hashed"));

    }


}
