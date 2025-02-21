package com.turkcell.cartservice.service;

import com.turkcell.cartservice.dto.CreateCartDto;
import com.turkcell.cartservice.entity.Cart;
import com.turkcell.cartservice.entity.CartItem;
import com.turkcell.cartservice.repository.CartRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Data
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;

    @Override
    public void create(CreateCartDto createCart) {
        Cart cart = new Cart();
        if(createCart.getCartItems() != null) {
            List<CartItem> cartItems = createCart.getCartItems().stream().map(cartItemDto -> {
                CartItem cartItem = new CartItem();
                cartItem.setProductId(cartItemDto.getProductId());
                cartItem.setQuantity(cartItemDto.getQuantity());
                cartItem.setCratedAt(LocalDateTime.now());
                cartItem.setUpdatedAt(LocalDateTime.now());
                return cartItem;
            }).toList();
            cart.setCartItem(cartItems);
        }
        cart.setCratedAt(LocalDateTime.now());
        cart.setUpdatedAt(LocalDateTime.now());
        cartRepository.save(cart);
    }
}
