package org.softserve.javaclub.team3.library.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table
public class BookRequest implements Serializable {

    @Id
    private String id = UUID.randomUUID().toString();

    @OneToOne
    private Book book;
    @OneToOne
    @JsonIgnore
    private Customer customer;

    private boolean active;
    private Date creationDate;
    private Date modificationDate;

}