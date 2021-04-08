package org.example.jpa;

import org.example.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeleteAddress extends JpaRepository<Address, Long> {

}
