package org.example.jpa;

import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServiceJpa {


    @Autowired
    SaveUser saveUser;

    @Autowired
    DeleteAddress deleteAddress;


    public void saveUser(User user) {
        saveUser.save(user);
    }


    public void deleteAddressById(Long id) {
        deleteAddress.deleteAddressById(id);
    }

}
