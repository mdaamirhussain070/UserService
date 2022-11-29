package com.userservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TBL_ROLE")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private int id;

    @Column(name="ROLE_NAME")
    private String roleName;

    @Column(name="ROLE_CODE")
    private String roleCode;

    @Column(name="IS_ACTIVE")
    private int isActive;
    @OneToOne(mappedBy = "role")
    private User user;

}
