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
@Table(name="law_firms_management")
public class LawFirmsManagement {
    @Id
        private String firmRegNumber;
        private String password;

    }
