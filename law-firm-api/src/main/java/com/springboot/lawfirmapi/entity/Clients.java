package com.springboot.lawfirmapi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="clients")
public class Clients {

    @Id
    private String clientId;
    private String password;

}
