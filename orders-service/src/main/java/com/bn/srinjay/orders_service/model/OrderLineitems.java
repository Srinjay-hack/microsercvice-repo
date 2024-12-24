package com.bn.srinjay.orders_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="t_orders_lineitems")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineitems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private Integer quantity;

}
