package com.springboot.lawfirmapi.controller;

import com.springboot.lawfirmapi.entity.LawFirm;
import com.springboot.lawfirmapi.service.LawFirmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This is to allow calls from React

@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class LawFirmController {

    private final LawFirmService lawFirmService;

    //Constructor Injection: this is telling the spring framework to wire up your
    //dependencies for the lawFirmService.

    @Autowired
    public LawFirmController(@Qualifier("lawFirmServiceIMPL")LawFirmService lawFirmService){
        this.lawFirmService = lawFirmService;
    }

    //This is a GET request that will read a list of all the law-firm.
    //http://localhost:8081/retrieveAllLawFirm
    @GetMapping("/retrieveAllLawFirm")
    public List<LawFirm> findAll() {
        return lawFirmService.findAll();
    }

    //This is a POST request to add a new law-firm
    //http://localhost:8081/addLawFirm
    @PostMapping("/addLawFirm")
    public LawFirm addLawFirm(@RequestBody LawFirm theLawFirm) {
        //also, just in case they pass an id in JSON .... set id to 0
        //this is to force a save of new item .... instead of update
        theLawFirm.setFirmId(0);

        //This will call the employeeDqoImpl.save method to save a new law-firm
        //through the employeeService
        lawFirmService.saveOrUpdate(theLawFirm);
        return theLawFirm;
    }

    //This is a PUT request to update an existing law-firm.
    //http://localhost:8081/updateLawFirm
    @PutMapping("/updateLawFirm")
    public LawFirm updateLawFirm(@RequestBody LawFirm updateLawFirm) {
        //Notice theLawFirm.setId(0); this will execute an update instead of a create
        lawFirmService.saveOrUpdate(updateLawFirm);
        return updateLawFirm;
    }

    //This is a DELETE request to delete an existing law-firm.
    //http://localhost:8081/deleteLawFirm/1
    @DeleteMapping("/deleteLawFirm/{lawFirmId}")
    public String deleteLawFirm(@PathVariable int lawFirmId) {
        //This will execute the deleteByID.
        lawFirmService.deleteByFirmId(lawFirmId);
        return "Deleted employee id : " + lawFirmId;
    }
}

