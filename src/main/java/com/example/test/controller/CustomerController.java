package com.example.test.controller;

import com.example.test.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/customers")
    public String customers(Model model){
        model.addAttribute("customers", customerService.getCustomers());
        return "customers";
    }
}
