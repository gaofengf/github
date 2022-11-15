package com.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "t_user")
public class UserBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cardid;
    private String cardname;
    private String idnumber;
    private String password;
    private Double balance;
    private String img;
    private List<Deposit> dlist;
}
