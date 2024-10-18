package com.jetbreed.CRUDWebService.entity;

import lombok.Data;
//import net.bytebuddy.utility.nullability.AlwaysNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Data
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Nullable
    private String firstname;
    private String middlename;
    private String lastname;
    private String email;

}
