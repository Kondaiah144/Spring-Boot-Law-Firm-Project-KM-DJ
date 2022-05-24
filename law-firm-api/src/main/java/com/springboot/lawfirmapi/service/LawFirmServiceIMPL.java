package com.springboot.lawfirmapi.service;

import com.springboot.lawfirmapi.dao.LawFirmDAO;
import com.springboot.lawfirmapi.entity.LawFirm;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LawFirmServiceIMPL implements LawFirmService{

    //Injecting the LawFirm dao layer
    private final LawFirmDAO lawFirmDAO;

    @Autowired
    public LawFirmServiceIMPL(LawFirmDAO lawFirmDAO) {
        this.lawFirmDAO = lawFirmDAO;
    }

    @Override
    public List<LawFirm> findAll() {
        return lawFirmDAO.findAll();
    }

    @Override
    public Object findByFirmId(int lawFirmFirmId) {
        return lawFirmDAO.finByFirmId(lawFirmFirmId);
    }

    @Override
    public void saveOrUpdate(LawFirm theLawFirm) {
        lawFirmDAO.saveOrUpdate(theLawFirm);

    }

    @Override
    public void deleteByFirmId(int lawFirmFirmId) {
    lawFirmDAO.deleteByFirmId(lawFirmFirmId);
    }
}
