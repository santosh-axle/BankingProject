package com.Banking.Accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acc/")
public class AccountController {

	
	@GetMapping("allaccounts")
	public String getAllAccounts() {
		return "Account Service Working for all accounts";
	}
}
