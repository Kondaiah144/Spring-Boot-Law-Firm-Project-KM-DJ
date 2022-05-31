package com.springboot.lawfirmapi.controller;

import com.springboot.lawfirmapi.entity.Clients;
import com.springboot.lawfirmapi.entity.LawFirmsManagement;
import com.springboot.lawfirmapi.repository.ClientsRepository;
import com.springboot.lawfirmapi.repository.LawFirmsManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class LawFirmsManagementController {


        @Autowired
        private LawFirmsManagementRepository repo;


        @GetMapping("/lawFirmsManagement")
        public String lawFirmLogin(Model model){
            LawFirmsManagement lawFirmsManagement = new LawFirmsManagement();
            model.addAttribute("lawFirmsManagement", lawFirmsManagement);

            return "lawFirmLogin";
        }

        @PostMapping("/lawFirmsManagementLogin")
        public String loginClients(@ModelAttribute("lawFirmsManagement") LawFirmsManagement lawFirmsManagement) {

            String firmRegNumber=lawFirmsManagement.getFirmRegNumber();
            Optional<LawFirmsManagement> lawFirmsManagementdata = repo.findByFirmRegNumber(firmRegNumber);

            if(lawFirmsManagement.getPassword().equals(lawFirmsManagementdata.get().getPassword())){
                return "lawfirmhome";
            }
            else{
                return "lawfirmerror";
            }
        }


}
