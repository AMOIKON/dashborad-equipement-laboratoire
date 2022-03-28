package com.maintenance.equipement.web;



import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maintenance.equipement.model.Lieu;
import com.maintenance.equipement.service.LieuService;


@Controller
public class LieuController {
	
	@Autowired
	private LieuService lieuService;
	
	
	@GetMapping("liste_site")
	public String lieu_site(Model model) {
		List<Lieu> lieus  = lieuService.findAll();
		model.addAttribute("lieu",lieus);
		return "site/liste_site"; 
	}
	
	@GetMapping("delete-site")
		public String deletregion(@RequestParam("idlieu") Long id) {
		lieuService.delete(id);
			return "redirect:/liste_site";
		}
	
	
	
	@GetMapping("edit-site")
	public String editlieu(@RequestParam("idlieu") Long id, Model model, Lieu lieu) {
		model.addAttribute("lieu",lieuService.findOne(id).get());
		return "site/add-site";
	}
	
	@GetMapping("detail-site")
	public String detailieu(@PathParam("idlieu") Long id) {
		return "redirect:/liste_site";
	}
	
	
	@GetMapping("add-site")
	public String add_lieu(Model model) {
		model.addAttribute("lieu", new Lieu());
		return "site/add-site"; 
	}
	
	@PostMapping("add-site")
	public String addregionPost(Model model, Lieu lieu) {
		lieuService.save(lieu);
		return "site/liste_site"; 
	}

	@GetMapping("details-site")
	public String detailsite() {
		
		return "site/details-site";
	}
}
