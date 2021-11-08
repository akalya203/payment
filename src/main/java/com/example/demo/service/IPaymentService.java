package com.example.demo.service;

import com.example.demo.entity.Payment;

import java.util.List;

public interface IPaymentService {

    public Payment makePayment(Payment payment);
    public List<Payment> getAllPayments();
}
