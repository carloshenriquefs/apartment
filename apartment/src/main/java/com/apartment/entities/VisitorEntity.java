package com.apartment.entities;

import jakarta.persistence.OneToOne;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

public class VisitorEntity extends PersonEntity {

    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToOne
    private ApartmentEntity apartmentEntity;

}
