package com.tibebsolutions.langaugeapp.domains;

import lombok.Data;

import javax.persistence.*; // .Entity

/**
 * Author Mulatu Sisay
 */
@Data
@Entity
public class Account
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private Long id;

    @Column(nullable=false)
    private String firstName;

    @Column(nullable = false)
    private String fatherName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private Integer pin;

    private Double level=0.0;
    private Boolean isVerified =true;


    public Account(Long id, String firstName, String fatherName, String email, String phoneNumber, Integer pin) {
        this.id = id;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
    }
}
