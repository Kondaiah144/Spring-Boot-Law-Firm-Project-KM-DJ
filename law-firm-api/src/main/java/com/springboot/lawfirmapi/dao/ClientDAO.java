package com.springboot.lawfirmapi.dao;

import com.springboot.lawfirmapi.entity.Client;
import com.springboot.lawfirmapi.entity.LawFirm;

import java.util.List;

public interface ClientDAO {
    List<Client> findAll();
    Object findById(int theId);
    void saveOrUpdate (Client theClient);
    void deleteById(int theId);
}
