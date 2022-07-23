package com.bsoft.springbootbookseller.service;

import com.bsoft.springbootbookseller.model.User;

import javax.transaction.Transactional;
import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    @Transactional
    void makeAdmin(String username);

//    @Transactional
//    void saveAdmin(String username);

    Optional<User> findByUsername(String username);


}
