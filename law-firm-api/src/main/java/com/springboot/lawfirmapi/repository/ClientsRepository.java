package com.springboot.lawfirmapi.repository;

import com.springboot.lawfirmapi.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientsRepository extends JpaRepository<Clients,String> {


    Optional<Clients> findByClientId(String clientsId);
}
