package vtb.geekbrains.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vtb.geekbrains.models.User;
import vtb.geekbrains.repositories.UserRepo;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getAll() {
        return this.userRepo.findAll();
    }
}