package com.bn.srinjay.orders_service.controller;


import com.bn.srinjay.orders_service.dto.OrderRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    public String placeOrder(@RequestBody OrderRequest orderRequest){
        return  "Order Placed Successfully";
    }
}
