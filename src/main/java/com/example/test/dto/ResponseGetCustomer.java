package com.example.test.dto;

import com.example.test.entity.Customer;
import lombok.Data;

@Data
public class ResponseGetCustomer {
    private Long id;
    private String name;
    private String phone;
    private String memo;
    private String createdAt;

    public ResponseGetCustomer(Customer customer){
        this.id = customer.getId();
        this.name = customer.getName();
        this.phone = customer.getPhone();
        this.memo = customer.getMemo();
        this.createdAt = customer.getCreatedAt().toString();
    }
}
