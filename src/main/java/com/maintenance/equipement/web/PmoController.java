package com.maintenance.equipement.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maintenance.equipement.model.District;
import com.maintenance.equipement.model.Pmo;
import com.maintenance.equipement.model.Region;
import com.maintenance.equipement.service.DistrictService;
import com.maintenance.equipement.service.PmoService;
import com.maintenance.equipement.service.RegionService;
@Controller
public class PmoController {
	@Autowired
	private PmoService pmoService;
	
	@Autowired
	private RegionService regionService;
	
	@Autowired
	private DistrictService districtService;
	
	
	@GetMapping("liste_pmo")
	public String liste_pmo(Model model) {
		List<Pmo> pmos  = pmoService.findAll();
		model.addAttribute("pmo",pmos);
		List<Region> regions  = regionService.findAll();
		model.addAttribute("region",regions);
		List<District> districts  = districtService.findAll();
		model.addAttribute("district",districts);
		return "pmo/liste_pmo"; 
	}
	
	@GetMapping("delete-pmo")
		public String deletpmo(@RequestParam("idpmo") Long id) {
		pmoService.delete(id);
			return "redirect:/liste_pmo";
		}
	
	
	
	@GetMapping("edit-pmo")
	public String editregion(@RequestParam("idpmo") Long id, Model model, Pmo pmo, Region region, District district) {
		model.addAttribute("pmo", pmoService.findOne(id).get());
		List<Region> regions  = regionService.findAll();
		model.addAttribute("region",regions);
		List<District> districts  = districtService.findAll();
		model.addAttribute("district",districts);
		
		return "pmo/add-pmo";
	}
	
	/*
	 * @GetMapping("details-pmo") public String
	 * detailpmo(@PathParam("idpmo") Long id) { return
	 * "redirect:/liste_pmo"; }
	 */
	
	
	@GetMapping("add-pmo")
	public String add_pmo(Model model) {
		model.addAttribute("pmo", new Pmo());
		List<Region> regions  = regionService.findAll();
		model.addAttribute("region",regions);
		List<District> districts  = districtService.findAll();
		model.addAttribute("district",districts);
		return "pmo/add-pmo"; 
	}
	
	@PostMapping("add-pmo")
	public String addpmoPost(Model model, Pmo pmo) {
		pmoService.save(pmo);
		return "pmo/liste_pmo"; 
	}

	@GetMapping("details-pmo")
	public String detailpmo() {
		
		return "pmo/details-pmo";
	}
}


