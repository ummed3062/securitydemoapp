package com.mru.securitydemoapp.entity;

import org.hibernate.annotations.SecondaryRow;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    

    @Id
    @GeneratedValue
    Integer id;

    String name;
    String email;
    String password;
}
