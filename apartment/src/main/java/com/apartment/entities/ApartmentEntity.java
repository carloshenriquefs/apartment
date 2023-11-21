package com.apartment.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity(name = "apartment")
public class ApartmentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String number;
    private String floor;

    @OneToOne
    private VisitorEntity visitorEntity;

    @OneToOne
    private OwnerEntity ownerEntity;

}
