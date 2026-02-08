package com.example.ecommerce.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.ecommerce.model.Cart;
import com.example.ecommerce.service.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    // Add product to cart
    @PostMapping
    public Cart addToCart(@RequestBody Cart cart) {
        return cartService.addToCart(cart);
    }

    // View cart
    @GetMapping
    public List<Cart> getCartItems() {
        return cartService.getCartItems();
    }

    // Remove item from cart
    @DeleteMapping("/{id}")
    public String removeFromCart(@PathVariable Long id) {
        cartService.removeFromCart(id);
        return "Item removed from cart";
    }
}
