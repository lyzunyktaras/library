package org.softserve.javaclub.team3.library.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "role")
public class UserRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String role;
}