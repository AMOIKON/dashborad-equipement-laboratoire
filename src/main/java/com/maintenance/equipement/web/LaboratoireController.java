package com.maintenance.equipement.web;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maintenance.equipement.model.District;
import com.maintenance.equipement.model.Laboratoire;
import com.maintenance.equipement.model.Region;
import com.maintenance.equipement.service.DistrictService;
import com.maintenance.equipement.service.LaboratoireService;
import com.maintenance.equipement.service.RegionService;

@Controller
public class LaboratoireController {

	@Autowired
	private LaboratoireService laboratoireService;
	
	
	@Autowired
	private RegionService regionService;
	
	@Autowired
	private DistrictService districtService;
	
	
	@GetMapping("liste_laboratoire")
	public String liste_labo(Model model) {
		List<Laboratoire> laboratoires  = laboratoireService.findAll();
		model.addAttribute("laboratoire",laboratoires);
		List<Region> regions  = regionService.findAll();
		model.addAttribute("region",regions);
		List<District> districts  = districtService.findAll();
		model.addAttribute("district",districts);
		
		return "laboratoire/liste_laboratoire"; 
	}
	
	@GetMapping("delete-laboratoire")
		public String deletlabo(@RequestParam("idlaboratoire") Long id) {
		laboratoireService.delete(id);
			return "redirect:/liste_laboratoire";
		}
	
	
	
	@GetMapping("edit-laboratoire")
	public String editlabo(@RequestParam("idlaboratoire") Long id, Model model, Laboratoire laboratoire, Region region, District district) {
		model.addAttribute("laboratoire",laboratoireService.findOne(id).get());
		model.addAttribute("region",regionService.findOne(id).get());
		model.addAttribute("district",districtService.findOne(id).get());
		
		return "laboratoire/add-laboratoire";
	}
	
	@GetMapping("detail-laboratoire")
	public String detaillabo(@PathParam("idlaboratoire") Long id) {
		return "redirect:/liste_laboratoire";
	}
	
	
	@GetMapping("add-labo")
	public String add_labo(Model model) {
		List<Region> regions  = regionService.findAll();
		model.addAttribute("region",regions);
		List<District> districts  = districtService.findAll();
		model.addAttribute("district",districts);
		model.addAttribute("laboratoire", new Laboratoire());
		return "laboratoire/add-labo"; 
	}
	
	@PostMapping("add-labo")
	public String addlaboPost(Model model, Laboratoire laboratoire) {
		laboratoireService.save(laboratoire);
		return "laboratoire/liste_laboratoire"; 
	}

	@GetMapping("details-laboratoire")
	public String detailabo() {
		
		return "laboratoire/details-laboratoire";
	}
}
