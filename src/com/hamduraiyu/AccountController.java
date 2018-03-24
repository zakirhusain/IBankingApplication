package com.hamduraiyu;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hamduraiyu.model.Account;

@Controller
public class AccountController {
	
	@RequestMapping("/")
	public String showHomePage() {
		return "index";
	}
	
	@RequestMapping("/new")
	public String newAccount(Model model) {
		model.addAttribute("account", new Account());
		return "newAccount";
	}
	
	@RequestMapping("/accountForm")
	public String showAccount() {
		return "showAccount";
	}
	
	/*@RequestMapping(value="/saveAccount", method=RequestMethod.POST)
	public String saveAccount(HttpServletRequest request, Model model) {
		String accountNo = request.getParameter("accountNo");
		String customerName = request.getParameter("accountHolderName");
		String balance = request.getParameter("balance");
		
		model.addAttribute("accountNumber", accountNo);
		model.addAttribute("accountHolderName", customerName);
		model.addAttribute("balance", balance);
		
		Account account = new Account();
		account.setAccountNo(Integer.parseInt(accountNo));
		account.setAccountHolderName(customerName);
		account.setBalance(Integer.parseInt(balance));
		
		model.addAttribute("account", account);
		
		
		return "showAccount";
	}*/
	
	/*
	 *  saveAccount using @RequestParam
	 * 
	 * */
	
	/*@RequestMapping(value="/saveAccount", method=RequestMethod.POST)
	public String saveAccount(Model model, @RequestParam("accountNo") String accountNo,
			@RequestParam("accountHolderName") String customerName,
			@RequestParam("balance") String balance) {
		String accountNo = request.getParameter("accountNo");
		String customerName = request.getParameter("accountHolderName");
		String balance = request.getParameter("balance");
		
		model.addAttribute("accountNumber", accountNo);
		model.addAttribute("accountHolderName", customerName);
		model.addAttribute("balance", balance);
		
		Account account = new Account();
		account.setAccountNo(Integer.parseInt(accountNo));
		account.setAccountHolderName(customerName);
		account.setBalance(Integer.parseInt(balance));
		
		model.addAttribute("account", account);
		
		
		return "showAccount";
	}*/
	
	/*
	 * Using 
	 *  
	 * 
	 */
	/*@RequestMapping(value="/saveAccount", method=RequestMethod.POST)
	public String saveAccount(Model model, Account account) {
		String accountNo = request.getParameter("accountNo");
		String customerName = request.getParameter("accountHolderName");
		String balance = request.getParameter("balance");
		
		model.addAttribute("accountNumber", accountNo);
		model.addAttribute("accountHolderName", customerName);
		model.addAttribute("balance", balance);
		
		//Account account = new Account();
		account.setAccountNo(Integer.parseInt(accountNo));
		account.setAccountHolderName(customerName);
		account.setBalance(Integer.parseInt(balance));
		
		model.addAttribute("account", account);
		
		
		return "showAccount";
	}*/
	
	// Adding Validation
	@RequestMapping(value="/saveAccount", method=RequestMethod.POST)
	public String saveAccount(@Valid @ModelAttribute("account") Account account,
			BindingResult result) {
		/*String accountNo = request.getParameter("accountNo");
		String customerName = request.getParameter("accountHolderName");
		String balance = request.getParameter("balance");*/
		
		/*model.addAttribute("accountNumber", accountNo);
		model.addAttribute("accountHolderName", customerName);
		model.addAttribute("balance", balance);*/
		
		//Account account = new Account();
		/*account.setAccountNo(Integer.parseInt(accountNo));
		account.setAccountHolderName(customerName);
		account.setBalance(Integer.parseInt(balance));*/
		
		/*model.addAttribute("account", account);
		
		
		return "showAccount";*/
		if (result.hasErrors()) {
			return "newAccount";
		} else {
			return "showAccount";
		}
	}

}
