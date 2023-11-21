package com.apartment.entities;

import jakarta.persistence.OneToOne;

public class OwnerEntity extends PersonEntity {

    @OneToOne
    private ApartmentEntity apartmentEntity;

}
