package com.springboot.lawfirmapi.dao;

import com.springboot.lawfirmapi.entity.Client;
import com.springboot.lawfirmapi.entity.LawFirm;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Repository
public class ClientIMPL implements ClientDAO{
    //Define field for entity manager
    /*The EntityManager API is used to create
    and remove persistent entity instances to find entities by primary key, and to query over entities. */

    private final EntityManager entityManager;

    //Set up Constructor Injection
    @Autowired
    public ClientIMPL(EntityManager entityManager){
        this.entityManager = entityManager;
    }


    @Override
    @Transactional//Defines the scope of the single database transaction

    public List<Client> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query myQuery = currentSession.createQuery("from Client"); //Based on employee program, it is supposed to be - Query<LawFirm> myQuery = currentSession.createQuery("from LawFirm");
        return myQuery.getResultList();
    }


    @Override
    @Transactional //Defines the scope of the single database transaction
    public Object findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Client.class, theId);
    }


    @Override
    @Transactional //Defines the scope of the single database transaction
    public void saveOrUpdate(Client theClient) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theClient);
    }

    @Override
    @Transactional //Defines the scope of the single database transaction
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Client myClient = currentSession.get(Client.class, theId);
        currentSession.delete(myClient);
    }
}

