package com.maintenance.equipement.web;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maintenance.equipement.model.Fournisseur;
import com.maintenance.equipement.service.FournisseurService;


@Controller
public class FournisseurController {

	
		@Autowired
		private FournisseurService fournisseurService;
		
		
		@GetMapping("liste_fournisseur")
		public String lieu_site(Model model) {
			List<Fournisseur> fournisseurs  = fournisseurService.findAll();
			model.addAttribute("fournisseur",fournisseurs);
			return "fournisseur/liste_fournisseur"; 
		}
		
		@GetMapping("delete-fournisseur")
			public String deletfournisseur(@RequestParam("idfournisseur") Long id) {
			fournisseurService.delete(id);
				return "redirect:/liste_fournisseur";
			}
		
		
		
		@GetMapping("edit-fournisseur")
		public String editfournisseur(@RequestParam("idfournisseur") Long id, Model model, Fournisseur fournisseur) {
			model.addAttribute("fournisseur",fournisseurService.findOne(id).get());
			return "fournisseur/add-fournisseur";
		}
		
		@GetMapping("detail-fournisseur")
		public String detailfournisseur(@PathParam("idfournisseur") Long id) {
			return "redirect:/liste_fournisseur";
		}
		
		
		@GetMapping("add-fournisseur")
		public String add_fournisseur(Model model) {
			model.addAttribute("fournisseur", new Fournisseur());
			return "fournisseur/add-fournisseur"; 
		}
		
		@PostMapping("add-fournisseur")
		public String addfournisseurPost(Model model, Fournisseur fournisseur) {
			fournisseurService.save(fournisseur);
			return "fournisseur/liste_fournisseur"; 
		}

		@GetMapping("details-fournisseur")
		public String detailsite() {
			
			return "fournisseur/details-fournisseur";
		}
	}

