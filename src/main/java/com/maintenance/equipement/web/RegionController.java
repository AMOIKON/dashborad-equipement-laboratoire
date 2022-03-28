package com.maintenance.equipement.web;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maintenance.equipement.model.Region;
import com.maintenance.equipement.service.RegionService;

@Controller
public class RegionController {
	
	@Autowired
	private RegionService regionService;
	
	
	@GetMapping("liste_region")
	public String liste_region(Model model) {
		List<Region> regions  = regionService.findAll();
		model.addAttribute("region",regions);
		return "organisations/liste_region"; 
	}
	
	@GetMapping("delete-region")
		public String deletregion(@RequestParam("idregion") Long id) {
		regionService.delete(id);
			return "redirect:/liste_region";
		}
	
	
	
	@GetMapping("edit-region")
	public String editregion(@RequestParam("idregion") Long id, Model model, Region region) {
		model.addAttribute("region", regionService.findOne(id).get());
		return "organisations/add-region";
	}
	
	@GetMapping("detail-region")
	public String detailregion(@PathParam("idregion") Long id) {
		return "redirect:/liste_region";
	}
	
	
	@GetMapping("add-region")
	public String add_region(Model model) {
		model.addAttribute("region", new Region());
		return "organisations/add-region"; 
	}
	
	@PostMapping("add-region")
	public String addregionPost(Model model, Region region) {
		regionService.save(region);
		return "organisations/liste_region"; 
	}

	@GetMapping("details-region")
	public String detailregion() {
		
		return "organisations/details-region";
	}
}
