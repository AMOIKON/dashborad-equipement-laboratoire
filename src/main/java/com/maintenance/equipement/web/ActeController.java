package com.maintenance.equipement.web;

import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maintenance.equipement.model.Acte;
import com.maintenance.equipement.model.District;
import com.maintenance.equipement.model.Lieu;
import com.maintenance.equipement.model.Pmo;
import com.maintenance.equipement.model.Region;
import com.maintenance.equipement.service.ActeService;
import com.maintenance.equipement.service.DistrictService;
import com.maintenance.equipement.service.LieuService;
import com.maintenance.equipement.service.PmoService;
import com.maintenance.equipement.service.RegionService;



@Controller
public class ActeController {
	@Autowired
	private ActeService acteService;
	
	@Autowired
	private RegionService regionService;
	
	@Autowired
	private DistrictService districtService;
	
	@Autowired
	private LieuService lieuService;
	
	@Autowired
	private PmoService pmoService;
	
	
	@GetMapping("liste_acte")
	public String liste_acte(Model model) {
		List<Acte> actes  = acteService.findAll();
		model.addAttribute("acte",actes);
		List<Region> regions  = regionService.findAll();
		model.addAttribute("region",regions);
		List<District> districts  = districtService.findAll();
		model.addAttribute("district",districts);
		List<Lieu> lieus  = lieuService.findAll();
		model.addAttribute("lieu",lieus);
		List<Pmo> pmos  = pmoService.findAll();
		model.addAttribute("pmo",pmos);
		model.addAttribute("standardDate", new Date());
		return "acte/liste_acte"; 
	}
	
	@GetMapping("delete-acte")
		public String deletacte(@RequestParam("idacte") Long id) {
		acteService.delete(id);
			return "redirect:/liste_acte";
		}
	
	
	
	@GetMapping("edit-acte")
	public String editacte(@RequestParam("idacte") Long id, Model model, Acte acte, Region region, District district, Lieu lieu, Pmo pmo) {
		model.addAttribute("acte",acteService.findOne(id).get());
		model.addAttribute("region",regionService.findOne(id).get());
		model.addAttribute("district",districtService.findOne(id).get());
		model.addAttribute("lieu",lieuService.findOne(id).get());
		model.addAttribute("pmo",pmoService.findOne(id).get());
		model.addAttribute("standardDate", new Date());
		return "acte/add-acte";
	}
	
	@GetMapping("detail-acte")
	public String detailacte(@PathParam("idacte") Long id) {
		return "redirect:/liste_acte";
	}
	
	
	
	@GetMapping("add-acte")
	public String add_acte(Model model) {
		model.addAttribute("acte", new Acte());
		List<Region> regions  = regionService.findAll();
		model.addAttribute("region",regions);
		List<District> districts  = districtService.findAll();
		model.addAttribute("district",districts);
		List<Lieu> lieus  = lieuService.findAll();
		model.addAttribute("lieu",lieus);
		List<Pmo> pmos  = pmoService.findAll();
		model.addAttribute("pmo",pmos);
		model.addAttribute("standardDate", new Date());

		
	   return "acte/add-acte"; 
	}
	
	@PostMapping("add-acte")
	public String addactePost(Model model,Acte acte) {
		acteService.save(acte);
		return "acte/liste_acte"; 
	}

	@GetMapping("details-acte")
	public String detailacte() {
		
		return "acte/details-acte";
	}
}
