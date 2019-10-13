package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stocks")
public class StocksController {

	@GetMapping(produces = "application/json")
	public String getStockPrice() {
		double num = Math.random();
		return "{\"stockPrice\":" + num + "}";
	}

}
