package org.odc.utils.Services;

import org.odc.utils.Generics.Repositories.UserRepository;
import org.odc.utils.Generics.Entities.AbstractUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


public abstract class UserDetailServiceImpl implements UserDetailsService {

    @Override
    public abstract UserDetails loadUserByUsername(String email);

    // Abstract method to create UserDetailImpl
    protected abstract UserDetailImpl createUserDetail(AbstractUserEntity user);
}
