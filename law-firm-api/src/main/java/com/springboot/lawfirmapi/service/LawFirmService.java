package com.springboot.lawfirmapi.service;

import com.springboot.lawfirmapi.entity.LawFirm;

import java.util.List;

public interface LawFirmService {
    List<LawFirm> findAll();
    Object findByFirmId(int lawFirmFirmId);
    void saveOrUpdate (LawFirm theLawFirm);
    void deleteByFirmId(int lawFirmFirmId);
}
