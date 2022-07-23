package com.bsoft.springbootbookseller.service;

import com.bsoft.springbootbookseller.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
