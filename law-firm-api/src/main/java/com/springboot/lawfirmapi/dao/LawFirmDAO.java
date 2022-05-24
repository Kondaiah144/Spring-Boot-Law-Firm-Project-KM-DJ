package com.springboot.lawfirmapi.dao;

import com.springboot.lawfirmapi.entity.LawFirm;

import java.util.List;

public interface LawFirmDAO {
    List<LawFirm> findAll();
    Object finByFirmId(int theFirmId);
    void saveOrUpdate (LawFirm theLawFirm);
    void deleteByFirmId(int theFirmId);
}
