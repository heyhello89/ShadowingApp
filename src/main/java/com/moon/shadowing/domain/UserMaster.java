package com.moon.shadowing.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Accessors(chain = true)
@Entity
@Table(name = "user_master")
public class UserMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oid", insertable = false, updatable = false)
    protected Long oid = 0L;

    @Column(name = "id")
    private String id;

    @Column(name = "passwd")
    private String passwd;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "birthday")
    private String birthday;
}
