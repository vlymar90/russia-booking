package com.gb.booking.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

import static javax.persistence.FetchType.EAGER;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users", schema = "booking")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    UUID id;

    String name;

    String password;

    @ManyToMany(fetch = EAGER)
    @JoinTable(name = "user_role", schema = "booking",
            joinColumns={@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")})
    List<Role> roles;

}
