package com.example.ecommerce.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.ecommerce.model.Cart;
import com.example.ecommerce.repository.CartRepository;

@Service
public class CartService {

    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart addToCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public List<Cart> getCartItems() {
        return cartRepository.findAll();
    }

    public void removeFromCart(Long id) {
        cartRepository.deleteById(id);
    }
}
