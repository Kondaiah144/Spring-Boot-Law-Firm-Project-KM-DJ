package com.springboot.lawfirmapi.controller;

import com.springboot.lawfirmapi.entity.Client;
import com.springboot.lawfirmapi.entity.LawFirm;
import com.springboot.lawfirmapi.service.ClientService;
import com.springboot.lawfirmapi.service.LawFirmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    //This is to allow calls from React

    @CrossOrigin(origins = { "http://localhost:3000"})
    @RestController
    public class ClientController {

        private final ClientService clientService;

        //Constructor Injection: this is telling the spring framework to wire up your
        //dependencies for the lawFirmService.

        @Autowired
        public ClientController(@Qualifier("clientServiceIMPL")ClientService clientService){
            this.clientService = clientService;
        }

        //This is a GET request that will read a list of all the law-firm.
        //http://localhost:8081/retrieveAllClient
        @GetMapping("/retrieveAllClient")
        public List<Client> findAll() {
            return clientService.findAll();
        }

        //This is a POST request to add a new law-firm
        //http://localhost:8081/addClient
        @PostMapping("/addClient")
        public Client addClient(@RequestBody Client theClient) {
            //also, just in case they pass an id in JSON .... set id to 0
            //this is to force a save of new item .... instead of update
            theClient.setId(0);

            //This will call the employeeDqoImpl.save method to save a new law-firm
            //through the employeeService
            clientService.saveOrUpdate(theClient);
            return theClient;
        }

        //This is a PUT request to update an existing law-firm.
        //http://localhost:8081/updateClient
        @PutMapping("/updateClient")
        public Client updateClient(@RequestBody Client updateClient) {
            //Notice theClient.setId(0); this will execute an update instead of a create
            clientService.saveOrUpdate(updateClient);
            return updateClient;
        }

        //This is a DELETE request to delete an existing law-firm.
        //http://localhost:8081/deleteClient/1
        @DeleteMapping("/deleteClient/{id}")
        public String deleteClient(@PathVariable int id) {
            //This will execute the deleteByID.
            clientService.deleteById(id);
            return "Deleted client id : " + id;
        }
}
