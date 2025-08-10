package com.github.SeonghwanNo_dev.fourth_proj.Model.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class OrderEntity {
    @Id @GeneratedValue
    @Column(name = "Order_ID")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private MemberEntity member;

    @OneToMany(mappedBy = "order")
    private List<OrderItemEntity> OrderItems = new ArrayList<OrderItemEntity>();

    // 생성자
    public OrderEntity(Date orderDate, OrderStatus status, MemberEntity member, List<OrderItemEntity> orderItems) {
        this.orderDate = orderDate;
        this.status = status;
        this.member = member;
        OrderItems = orderItems;
    }

    // 연관 관계 메소드
    public void setMember(MemberEntity member) {
        if (this.member != null) this.member.getOrders().remove(this);
        this.member = member;
        member.getOrders().add(this);
    }

    // Setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setOrderItems(List<OrderItemEntity> orderItems) {
        OrderItems = orderItems;
    }

    // Getter
    public Long getId() {
        return id;
    }

    public List<OrderItemEntity> getOrderItems() {
        return OrderItems;
    }

    public MemberEntity getMember() {
        return member;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Date getOrderDate() {
        return orderDate;
    }
}



