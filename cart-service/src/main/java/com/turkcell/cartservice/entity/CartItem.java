package com.turkcell.cartservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {
    private String productId;
    private int quantity;
    private LocalDateTime cratedAt;
    private LocalDateTime updatedAt;
}
