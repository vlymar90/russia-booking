package com.gb.booking.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "roles", schema = "booking")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    UUID id;

    String type;

    String description;
}
