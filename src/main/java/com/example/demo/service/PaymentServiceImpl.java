package com.example.demo.service;

import com.example.demo.entity.Payment;
import com.example.demo.repo.PaymentRepository;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PaymentServiceImpl implements  IPaymentService{

    @Autowired
    private PaymentRepository paymentRepository;

    //@Override
    //public Payment makePayment(Payment payment) {
        //payment.setTransactionId(UUID.randomUUID().toString());
        //payment.setTransactionStatus(getStatus());
        //return paymentRepository.save(payment);
    //}
    @Override
    public Payment makePayment(Payment payment) {
     payment.setTransactionStatus(new Random().nextBoolean()?"Transaction Success":"Transaction Failure");
     payment.setTransactionId(UUID.randomUUID().toString());
     Payment savedPayment=paymentRepository.save(payment);
        return savedPayment;
    }
    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

   // public String getStatus()
   // {
       // return new Random().nextBoolean()?" Transaction Success":" Transaction Failure";
    //}

}
