package com.example.springbootapi2.entity;
import javax.persistence.*;
@Entity
@Table(name = "studentjpa")
public class Students {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    public Students(Long id,String name,String phone,String email)
    {
        this.id=id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public Students() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
