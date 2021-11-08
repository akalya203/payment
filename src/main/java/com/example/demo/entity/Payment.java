package com.example.demo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentId;
    @Column
    private Double  paidAmount;
    @Column
    private String transactionId;
    @Column
    private String transactionStatus;
    @Column
   private Integer productId;
   @Column
    private Integer quantity;
}