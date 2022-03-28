package com.maintenance.equipement.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maintenance.equipement.model.District;
import com.maintenance.equipement.model.Equipement;

import com.maintenance.equipement.service.DistrictService;
import com.maintenance.equipement.service.EquipementService;





	@Controller
	public class EquipementController {
		
		@Autowired
		private EquipementService equipementService;
		
		@Autowired
		private DistrictService districtService;
		
		
		
		@GetMapping("liste_equipe")
		public String liste_equipe(Model model) {
			List<Equipement> equipements  = equipementService.findAll();
			model.addAttribute("equipement",equipements);
			List<District> districts  = districtService.findAll();
			model.addAttribute("district",districts);
			return "equipements/liste_equipe"; 
		}
		
		@GetMapping("delete-equipe")
			public String deletequipe(@RequestParam("idequipement") Long id) {
			equipementService.delete(id);
				return "redirect:/liste_equipe";
			}
		
		
		
		@GetMapping("edit-equipe")
		public String editequipe(@RequestParam("idequipement") Long id, Model model, Equipement equipement, District district) {
			model.addAttribute("equipement", equipementService.findOne(id).get());
			model.addAttribute("district", districtService.findOne(id).get());
			return "equipements/add-equipe";
		}
		
		/*
		 * @GetMapping("detail-equipe") public String
		 * detailregion(@PathParam("idequipement") Long id) { return
		 * "redirect:/liste_equipe"; }
		 */
		
		
		@GetMapping("add-equipe")
		public String addequipe(Model model) {
			model.addAttribute("equipement", new Equipement());
			List<District> districts  = districtService.findAll();
			model.addAttribute("district",districts);
			
			return "equipements/add-equipe"; 
		}
		
		@PostMapping("add-equipe")
		public String addequipePost(Model model, Equipement equipement) {
			equipementService.save(equipement);
			return "equipements/liste_equipe"; 
		}

		@GetMapping("details-equipe")
		public String detailequipe() {
			
			return "equipements/details-equipe";
		}
	}


