package com.ana.librarian.Controller;

import com.ana.librarian.Models.*;
import com.ana.librarian.Repository.*;
import com.ana.librarian.Exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
   LibrarianRepository librarianRepository;

    // Create a new Note
    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        return librarianRepository.save(user);
    }
}
