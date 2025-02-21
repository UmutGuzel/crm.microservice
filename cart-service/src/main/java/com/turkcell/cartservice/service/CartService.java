package com.turkcell.cartservice.service;

import com.turkcell.cartservice.dto.CreateCartDto;

public interface CartService {
    void create(CreateCartDto cart);
}
