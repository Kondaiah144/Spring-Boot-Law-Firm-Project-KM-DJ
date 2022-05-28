package com.springboot.lawfirmapi.service;

import com.springboot.lawfirmapi.entity.Client;
import com.springboot.lawfirmapi.entity.LawFirm;

import java.util.List;

public interface ClientService {
    List<Client> findAll();
    Object findById(int clientId);
    void saveOrUpdate (Client theClient);
    void deleteById(int clientId);
}
