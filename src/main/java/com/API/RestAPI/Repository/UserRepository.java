package com.API.RestAPI.Repository;

import com.API.RestAPI.Model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    public List<User> getUsers();
    public User getId(String id);

}
