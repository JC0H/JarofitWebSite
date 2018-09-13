package com.jarofit.springsecurityapp.service;

/**
 * Service for Security.
 *
 * @author Andrii Androsiuk
 * @version 1.0
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
