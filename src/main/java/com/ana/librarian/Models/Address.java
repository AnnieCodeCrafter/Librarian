package com.ana.librarian.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class Address {

    @Id @GeneratedValue
    private Long Id;

    @NotBlank
    private String StreetName;

    @NotBlank
    private String TownName;

    @NotBlank
    private String HouseNumber;

    @OneToOne(mappedBy = "address")
    private User user;


}
