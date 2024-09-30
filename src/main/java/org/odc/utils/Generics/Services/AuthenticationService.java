package org.odc.utils.Generics.Services;

import org.odc.utils.Dtos.LoginUserDto;

public interface AuthenticationService<Entity> {
    public Entity authenticate(LoginUserDto loginUserDto);
}
