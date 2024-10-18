package com.jetbreed.CRUDWebService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
    public class Student {
        @Column(name = "id")
        private long id;
        private String firstname;
        private String middlename;
        private String lastname;
        private String email;
    }
