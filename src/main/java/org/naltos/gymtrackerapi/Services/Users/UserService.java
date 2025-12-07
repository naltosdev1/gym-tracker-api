package org.naltos.gymtrackerapi.Services.Users;

import org.naltos.gymtrackerapi.DTO.UserDto.UserDto;
import org.naltos.gymtrackerapi.Entity.User;

import java.util.List;

public interface UserService {

    // Save operation
    User saveUser(UserDto user);

    // Read operation
    List<User> getUsers();

    User getUser(Long userId);

    // Update operation
    User updateUser(UserDto user, Long userId);

    // Delete operation
    void deleteUser(Long userId);
}
