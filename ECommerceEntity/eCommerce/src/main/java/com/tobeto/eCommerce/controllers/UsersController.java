package com.tobeto.eCommerce.controllers;

import com.tobeto.eCommerce.entities.User;
import com.tobeto.eCommerce.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private UserRepository userRepository;

    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @PostMapping
    public String add(@RequestBody User degisken){
        userRepository.save(degisken);
        return "Başarıyla eklendi";
    }

    @PutMapping
    public  String update(@RequestBody User user){
        userRepository.save(user);
        return "Başarıyla Güncellendi";
    }
    @DeleteMapping
    public String delete(@RequestParam int id){

        User user = userRepository.findById(id).orElseThrow();

        userRepository.delete(user);
        return "Başarıyla Silindi";
    }

}
