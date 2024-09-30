package org.odc.utils.Services;


import org.odc.utils.Generics.Entities.AbstractUserEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

//@Service
public abstract class AuthenticationService {


    public abstract AbstractUserEntity signup();

    public abstract UserDetails authenticate() ;
}
