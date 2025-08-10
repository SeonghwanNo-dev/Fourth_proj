package com.github.SeonghwanNo_dev.fourth_proj.Model.Entity;

import jakarta.persistence.*;
import org.hibernate.query.Order;

import java.util.ArrayList;
import java.util.List;


@Entity
public class MemberEntity {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;
    private String city;
    private String street;
    private String zipcode;

    @OneToMany(mappedBy = "member")
    private List<OrderEntity> orders = new ArrayList<OrderEntity>();

    // 생성자
    public MemberEntity(String name, String city, String street, String zipcode, List<OrderEntity> orders) {
        this.name = name;
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
        this.orders = orders;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setOrders(List<OrderEntity> orders) {
        this.orders = orders;
    }

    // Getter
    public List<OrderEntity> getOrders() {
        return orders;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
