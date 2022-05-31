package com.springboot.lawfirmapi.repository;

import com.springboot.lawfirmapi.entity.Clients;
import com.springboot.lawfirmapi.entity.LawFirmsManagement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LawFirmsManagementRepository extends JpaRepository<LawFirmsManagement,String> {

    Optional<LawFirmsManagement> findByFirmRegNumber(String firmRegNumber);
}
