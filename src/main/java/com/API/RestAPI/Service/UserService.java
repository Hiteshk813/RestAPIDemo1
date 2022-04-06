package com.API.RestAPI.Service;

import com.API.RestAPI.Model.User;
import com.API.RestAPI.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserRepository {

//    @Autowired
//     UserRepository userRepository;


    List<User> user;

    public UserService() {
        user = new ArrayList<>();
        user.add(new User("101001", "Hitesh", 24, 0.8f));
        user.add(new User("101002", "Riya", 23, 0.2f));

    }

    @Override
    public List<User> getUsers() {
        return user;
    }

    @Override
    public User getId(String id) {

        User u = null;
        for (User user1 : user) {
            if (user1.getId() == id) {
                u = user1;
                break;
            }
        }
        return u;
    }

}
