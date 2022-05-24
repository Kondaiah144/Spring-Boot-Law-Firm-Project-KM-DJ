package com.springboot.lawfirmapi.dao;

import com.springboot.lawfirmapi.entity.LawFirm;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;
import java.util.List;


@Repository
public class LawFirmIMPL implements LawFirmDAO {

    //Define field for entity manager
    /*The EntityManager API is used to create
    and remove persistent entity instances to find entities by primary key, and to query over entities. */

    private final EntityManager entityManager;

    //Set up Constructor Injection
    @Autowired
    public LawFirmIMPL(EntityManager entityManager){
    this.entityManager = entityManager;
    }


    @Override
    @Transactional//Defines the scope of the single database transaction

    public List<LawFirm> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query myQuery = currentSession.createQuery("from LawFirm"); //Based on employee program, it is supposed to be - Query<LawFirm> myQuery = currentSession.createQuery("from LawFirm");
        return myQuery.getResultList();
    }


    @Override
    @Transactional //Defines the scope of the single database transaction
    public Object finByFirmId(int theFirmId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(LawFirm.class, theFirmId);
    }


    @Override
    @Transactional //Defines the scope of the single database transaction
    public void saveOrUpdate(LawFirm theLawFirm) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theLawFirm);
    }

    @Override
    @Transactional //Defines the scope of the single database transaction
    public void deleteByFirmId(int theFirmId) {
        Session currentSession = entityManager.unwrap(Session.class);
        LawFirm myLawFirm = currentSession.get(LawFirm.class, theFirmId);
        currentSession.delete(myLawFirm);
    }
}

