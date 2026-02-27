package com.Banking.Transaction.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trans/")
public class TransactionController {
	
	List<String> transList = new ArrayList<>(List.of("PhonePe Payment of ruppes 30"
								,"Gpay payment of 2000"
								,"Account Payment of 5000"
								,"Fund transfer of Salary of 3 Lacs rupees")
								);
	@GetMapping("AllTrans/")
	public List<String> getAllTransactions() {
		return transList;
	}

}
