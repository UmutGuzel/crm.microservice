package com.turkcell.cartservice.controller;

import com.turkcell.cartservice.dto.CreateCartDto;
import com.turkcell.cartservice.service.CartService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/carts")
public class CartController {
   private final CartService cartService;

    @PostMapping
    public void create(@RequestBody CreateCartDto cart) {
        cartService.create(cart);
    }

}
