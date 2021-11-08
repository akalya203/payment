package com.example.demo.controller;

import com.example.demo.entity.Payment;
import com.example.demo.service.IPaymentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
    @Autowired
    private IPaymentService paymentService;
    
    @GetMapping(value = "/testPayment")
    public String paymentTestPage()
    {
        String msg="<h2 style='color:green'>Payment Service Is Working!</h2>";
        return msg;
    }

    @PostMapping(value = "/makePayment")
    public ResponseEntity<Payment> makePayment(@RequestBody  Payment payment)
    {
        return new ResponseEntity<Payment>(paymentService.makePayment(payment), HttpStatus.CREATED);
    }
    @GetMapping(value = "/allPayments")
    public ResponseEntity<List<Payment>> getAllPayments()
    {
        return new ResponseEntity<List<Payment>>(paymentService.getAllPayments(),HttpStatus.OK);
    }

}