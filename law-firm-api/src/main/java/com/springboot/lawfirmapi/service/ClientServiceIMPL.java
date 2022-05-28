package com.springboot.lawfirmapi.service;

import com.springboot.lawfirmapi.dao.ClientDAO;
import com.springboot.lawfirmapi.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class ClientServiceIMPL implements ClientService{
    //Injecting the client dao layer
    private final ClientDAO clientDAO;

    @Autowired
    public ClientServiceIMPL(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    @Override
    public List<Client> findAll() {
        return clientDAO.findAll();
    }

    @Override
    public Object findById(int clientId) {
        return clientDAO.findById(clientId);
    }

    @Override
    public void saveOrUpdate(Client theClient) {
        clientDAO.saveOrUpdate(theClient);

    }

    @Override
    public void deleteById(int clientId) {
        clientDAO.deleteById(clientId);
    }
}
