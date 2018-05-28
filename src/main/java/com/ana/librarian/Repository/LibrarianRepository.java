package com.ana.librarian.Repository;

import com.ana.librarian.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepository extends JpaRepository<User, Long>{

}
