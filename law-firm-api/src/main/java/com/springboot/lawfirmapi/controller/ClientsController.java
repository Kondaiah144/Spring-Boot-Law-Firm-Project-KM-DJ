package com.springboot.lawfirmapi.controller;


import com.springboot.lawfirmapi.entity.Clients;
import com.springboot.lawfirmapi.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class ClientsController {

    @Autowired
    private ClientsRepository repository;


    @GetMapping("/")
    public String login(Model model){
        Clients clients = new Clients();
        model.addAttribute("clients", clients);

        return "login";
    }

    @PostMapping("/clientsLogin")
    public String loginClients(@ModelAttribute ("clients") Clients clients) {

        String clientsId=clients.getClientId();
        Optional<Clients> clientsdata = repository.findById(clientsId);

        if(clients.getPassword().equals(clientsdata.get().getPassword())){
           return "home";
        }
        else{
            return "error";
        }
    }
}
