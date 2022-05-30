package com.springboot.lawfirmapi.repository;

import com.springboot.lawfirmapi.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends JpaRepository<Clients,String> {

Clients findbyClientsId(String clientsId);

   // Clients findbyClientId(String clientsId);
}
