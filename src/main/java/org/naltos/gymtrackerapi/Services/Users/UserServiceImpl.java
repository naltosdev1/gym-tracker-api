package org.naltos.gymtrackerapi.Services.Users;

import org.naltos.gymtrackerapi.DTO.UserDto.UserDto;
import org.naltos.gymtrackerapi.Entity.User;
import org.naltos.gymtrackerapi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired private UserRepository userRepository;

    @Override
    public User saveUser(UserDto userDto) {
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setPseudo(userDto.getPseudo());

        return userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User updateUser(UserDto userDto, Long userId) {

        User user = new User();

        User userToUpdate = userRepository.findById(userId).get();

        if(Objects.nonNull(userDto.getPseudo()) && !"".equalsIgnoreCase(userDto.getPseudo())) {
            userToUpdate.setPseudo(userDto.getPseudo());
        }

        if(Objects.nonNull(userDto.getEmail()) && !"".equalsIgnoreCase(userDto.getEmail())) {
            userToUpdate.setEmail(userDto.getEmail());
        }

        return userRepository.save(userToUpdate);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
