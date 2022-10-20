package org.opencsd.repo;

import org.opencsd.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    @Query("{email: '?0'}")
    User lookupUser(long id);

    @Query(value="{preference:'?0'}", fields="{'user' : 1, 'quantity' : 1}")
    List<User> findAllUsers(String preference);


}
