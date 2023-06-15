package com.techpro.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Table(name = "people")
public class People {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "PersonID")
    private int PersonID;

    @Column(name = "FirstName")
    private String FirstName;

    @Column(name = "LastName" )
    private String LastName;

    @Column(name = "Email" )
    private String Email;

    public People(String name) {
        this.FirstName = name;
    }
    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

}
