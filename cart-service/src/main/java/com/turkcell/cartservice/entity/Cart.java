package com.turkcell.cartservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("carts")
public class Cart {
    @Id
    private String id;
    private BigDecimal totalPrice;
    private LocalDateTime cratedAt;
    private LocalDateTime updatedAt;
    private List<CartItem> cartItem;

}
