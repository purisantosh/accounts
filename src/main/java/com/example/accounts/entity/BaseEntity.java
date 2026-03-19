package com.example.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.time.LocalDateTime;
@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEntity {

    @Column(name = "CREATED_AT",updatable = false)
    private LocalDateTime createAt;

    @Column(name = "CREATED_BY",updatable = false)
    private String createdBy;

    @Column(insertable = false)
    private LocalDateTime updatedAt;

    @Column(insertable = false)
    private String updatedBy;
}
