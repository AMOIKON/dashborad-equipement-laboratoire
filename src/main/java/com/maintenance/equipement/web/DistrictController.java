package com.maintenance.equipement.web;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maintenance.equipement.model.District;
import com.maintenance.equipement.model.Lieu;
import com.maintenance.equipement.model.Region;
import com.maintenance.equipement.service.DistrictService;
import com.maintenance.equipement.service.LieuService;
import com.maintenance.equipement.service.RegionService;

@Controller
public class DistrictController {
	@Autowired 
	private RegionService regionService;
	
	@Autowired
	private DistrictService districtService;
	
	@Autowired
	private LieuService lieuService;
	
	@GetMapping("liste_district")
	public String liste_district(Model model) {
		List<District> districts  = districtService.findAll();
		model.addAttribute("district",districts);
		List<Lieu> lieus  = lieuService.findAll();
		model.addAttribute("lieu",lieus);
		return "organisations/liste_district"; 
	}
	
	@GetMapping("delete-district")
		public String deletdistrict(@RequestParam("iddistrict") Long id) {
		districtService.delete(id);
			return "redirect:/liste_district";
		}
	
	
	
	@GetMapping("edit-district")
	public String editregion(@RequestParam("iddistrict") Long id, Model model, District district, Region region) {
		model.addAttribute("district", districtService.findOne(id).get());
		model.addAttribute("region", regionService.findOne(id).get());
		model.addAttribute("lieu", lieuService.findOne(id).get());
		return "organisations/add-district";
	}
	
	/*
	 * @GetMapping("details-district") public String
	 * detailregion(@PathParam("iddistrict") Long id) { return
	 * "redirect:/liste_district"; }
	 */
	
	
	@GetMapping("add-district")
	public String add_district(Model model) {
		model.addAttribute("district", new District());
		List<Region> regions  = regionService.findAll();
		model.addAttribute("region",regions);
		List<Lieu> lieus  = lieuService.findAll();
		model.addAttribute("lieu",lieus);
		return "organisations/add-district"; 
	}
	
	@PostMapping("add-district")
	public String addregionPost(Model model, District district) {
		districtService.save(district);
		return "organisations/liste_district"; 
	}

	@GetMapping("details-district")
	public String detaildistrict() {
		
		return "organisations/details-district";
	}
}
