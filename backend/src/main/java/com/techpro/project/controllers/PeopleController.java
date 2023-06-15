package com.techpro.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techpro.project.entity.People;
import com.techpro.project.service.Servicepeople;


@RestController
public class PeopleController {


    @Autowired private Servicepeople servicepeople;

    @GetMapping(value = "/test_controller1/{id}", produces = "application/json")

    public People test_controller(@PathVariable(value="id") int id)
    {
        return servicepeople.readPeople(id);
    }

    @PutMapping(value = "/test_controller2/", produces = "application/json")
    public People test_controller2(@RequestParam(required = false, value = "id", defaultValue = "") int id)
    {
        return servicepeople.readPeople(id);
    }

    @PostMapping(value = "/test_controller3/", produces = "application/json")
    public void test_controller3(@RequestParam(required = false, value = "id", defaultValue = "") int id)
    {
        People save_people = new People();
        save_people.setPersonID(1);
        save_people.setFirstName("id");
        save_people.setLastName("id");
        save_people.setEmail("id");
        servicepeople.savePeople(save_people);
    }

    @PostMapping(value = "/test_controller4/", produces = "application/json")
    public void test_controller4(@RequestParam(required = false, value = "id", defaultValue = "") int id)
    {
        People save_people = new People(id,"techpro","academy","@ymca");
        servicepeople.savePeople(save_people);
        //return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

}
