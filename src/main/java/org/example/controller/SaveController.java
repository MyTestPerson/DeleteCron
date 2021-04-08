
package org.example.controller;

import org.example.jpa.ServiceJpa;
import org.example.model.Address;
import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaveController {

    @Autowired
    ServiceJpa serviceJpa;

    @GetMapping(value = "/saveUser")
    public String save () {

        User user = new User();
        user.setName("Michael Joseph Jackson");

        Address address = new Address();
        address.setId(user.getId());
        address.setCity("Los Angeles");

        user.setAddress(address);
        address.setUser(user);

        serviceJpa.saveUser(user);

        return "/saveUser";
    }


    @PostMapping(value = "/deleteAddressById")
    public String deleteAddressById (@RequestParam("deleteAddressById") Long id) {
        serviceJpa.deleteAddressById(id);
        return "redirect:/saveUser";
    }




}
