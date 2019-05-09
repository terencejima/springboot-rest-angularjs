package com.pancompany.users;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Terence on 12/02/2018.
 */
@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
    private double salary;
}
