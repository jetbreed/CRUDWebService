package com.jetbreed.CRUDWebService.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String middlename;
    private String lastname;
    private String email;

}
