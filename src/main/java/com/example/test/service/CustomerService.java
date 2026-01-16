package com.example.test.service;

import com.example.test.dto.ResponseGetCustomer;
import com.example.test.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    // Get Customers list
    public List<ResponseGetCustomer> getCustomers(){
        return customerRepository.findAll()
                .stream()
                .map(ResponseGetCustomer::new)
                .toList();
    }
}
