package com.example.test.controller;

import com.example.test.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/customers")
    public String customers(Model model){
        model.addAttribute("customers", customerService.getCustomers());
        return "customers";
    }

    @GetMapping("/check")
    @ResponseBody
    public ResponseEntity<Void> check(){
        return ResponseEntity.ok().build();
    }
}
