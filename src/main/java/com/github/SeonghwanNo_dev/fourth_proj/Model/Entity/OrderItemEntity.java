package com.github.SeonghwanNo_dev.fourth_proj.Model.Entity;

import jakarta.persistence.*;

@Entity
public class OrderItemEntity {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    private int orderPrice;
    private int count;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private ItemEntity item;
    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private OrderEntity order;

    // 연관 관계 메서드
    public void setItem(ItemEntity item) {
        if (this.item != null) this.item.getOrderItems().remove(this);
        this.item = item;
        item.getOrderItems().add(this);
    }

    public void setOrder(OrderEntity order) {
        if (this.order != null) this.order.getOrderItems().remove(this);
        this.order = order;
        order.getOrderItems().add(this);
    }

    // Setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setCount(int count) {
        this.count = count;
    }


    // Getter
    public Long getId() {
        return id;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public int getCount() {
        return count;
    }

    public ItemEntity getItem() {
        return item;
    }

    public OrderEntity getOrder() {
        return order;
    }
}
