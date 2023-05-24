package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("about.html")
	public String about() {
		return "about";
	}
	@GetMapping("blog.html")
	public String blog() {
		return "blog";
	}
	@GetMapping("blogSingle.html")
	public String blogSingle() {
		return "blogSingle";
	}
	@GetMapping("contact.html")
	public String contact() {
		return "contact";
	}
	@GetMapping("index.html")
	public String index() {
		return "index";
	}
	@GetMapping("menu.html")
	public String menu() {
		return "menu";
	}
	@GetMapping("productDetails.html")
	public String productDetails() {
		return "productDetails";
	}
	@GetMapping("reservation.html")
	public String reservation() {
		return "reservation";
	}
	@GetMapping("service.html")
	public String service() {
		return "service";
	}
	@GetMapping("shoppingCart.html")
	public String shoppingCart() {
		return "shoppingCart";
	}
	@GetMapping("AccountManagement")
	public String AccountManagement() {
		return "admin/AccountManagement";
	}
	@GetMapping("AddAccount")
	public String AddAccount() {
		return "admin/AddAccount";
	}
	@GetMapping("EditAccount")
	public String EditAccount() {
		return "admin/AddProduct";
	}
	@GetMapping("ProductManagement")
	public String ProductManagement() {
		return "admin/ProductManagement";
	}
	@GetMapping("AddProduct")
	public String AddProduct() {
		return "admin/AddProduct";
	}
	@GetMapping("Edit")
	public String Edit() {
		return "admin/AddProduct";
	}
	@GetMapping("ServiceManagement")
	public String ServiceManagement() {
		return "admin/ServiceManagement";
	}
	@GetMapping("AddService")
	public String AddService() {
		return "admin/AddService";
	}
	@GetMapping("EditService")
	public String EditService() {
		return "admin/AddService";
	}
	
	
}
