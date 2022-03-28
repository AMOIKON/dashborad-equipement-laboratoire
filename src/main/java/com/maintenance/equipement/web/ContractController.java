package com.maintenance.equipement.web;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maintenance.equipement.model.Contract;

import com.maintenance.equipement.service.ContractService;

@Controller
public class ContractController {
	
	@Autowired
	private ContractService contractService;
	
	@GetMapping("liste_contract")
	public String lieu_contract(Model model) {
		List<Contract> contracts  = contractService.findAll();
		model.addAttribute("contract",contracts);
		return "contract/liste_contract"; 
	}
	
	@GetMapping("delete-contract")
		public String deletcontract(@RequestParam("idcontract") Long id) {
		contractService.delete(id);
			return "redirect:/liste_contract";
		}
	
	
	
	@GetMapping("edit-contract")
	public String editfournisseur(@RequestParam("idcontract") Long id, Model model, Contract contract) {
		model.addAttribute("contract",contractService.findOne(id).get());
		return "contract/add-contract";
	}
	
	@GetMapping("detail-contract")
	public String detailfournisseur(@PathParam("idfournisseur") Long id) {
		return "redirect:/liste_contract";
	}
	
	
	@GetMapping("add-contract")
	public String add_contract(Model model) {
		model.addAttribute("contract", new Contract());
		return "contract/add-contract"; 
	}
	
	@PostMapping("add-contract")
	public String addcontractPost(Model model, Contract contract) {
		contractService.save(contract);
		return "contract/liste_contract"; 
	}

	@GetMapping("details-contract")
	public String detailsite() {
		
		return "contract/details-contract";
	}

}
