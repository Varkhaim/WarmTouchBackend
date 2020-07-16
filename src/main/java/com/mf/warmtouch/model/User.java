package com.mf.warmtouch.model;

import com.mf.warmtouch.authentication.WTUserDetails;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.security.Principal;

@Data
@Entity
@Table(name = "Users")
@SQLDelete(sql = "UPDATE user SET deleted=true WHERE id=?")
@Where(clause = "deleted = false")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "displayname")
    private String displayName;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "active")
    private boolean isActive;
    @Column(name = "roles")
    private String roles;
    @Column(name = "deleted")
    private boolean deleted;
}
