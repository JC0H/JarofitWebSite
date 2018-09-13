package com.jarofit.springsecurityapp.service;

import com.jarofit.springsecurityapp.model.User;

/**
 * Service class for {@link com.jarofit.springsecurityapp.model.User}
 *
 * @author Andrii Androsiuk
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
