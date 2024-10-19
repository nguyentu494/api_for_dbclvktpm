package edu.iuh.fit.zy2.services;

import edu.iuh.fit.zy2.entities.User;
import edu.iuh.fit.zy2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean checkLogin(String username, String password) {
        return userRepository.existsById(username) && userRepository.getById(username).getPassword().equals(password);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
