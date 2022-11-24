package com.example.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "User")
@Getter
@Builder
@AllArgsConstructor
@ToString
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_code;

    @Column(nullable = false, unique = true)
    private String id;

    @Column
    private String password;

    @Column(nullable = false)
    private String email;

    @Column
    private String certification_number;

    @Builder
    public UserEntity() {
        this.id = getId();
        this.password = getPassword();
        this.email = getEmail();
        this.certification_number = getCertification_number();
    }

}
