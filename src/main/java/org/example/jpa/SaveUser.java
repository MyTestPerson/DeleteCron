package org.example.jpa;

import org.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveUser extends JpaRepository<User, Long> {

}
