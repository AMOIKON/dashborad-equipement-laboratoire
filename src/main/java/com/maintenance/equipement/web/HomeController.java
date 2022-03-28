package com.maintenance.equipement.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	@GetMapping("/")
	public String home() {
		return "/indexe";
	}
	
	@GetMapping("/layout")
	public String layout() {
		return "/layout/_layout";
	}
	
	@GetMapping("/views")
	public String view() {
		return "/views/index";
	}
	
	@GetMapping("/pmo")
	public String pmo() {
		return "/pmo/pmo";
	}
	@GetMapping("/pannes")
	public String pannes() {
		return "/pannes/panne";
	}
	
	@GetMapping("/organisations")
	public String organisations() {
		return "/organisations/org";
	}
		
	@GetMapping("/maintenance")
	public String maintenance() {
		return "/maintenance/maintenance";
	}
 
	@GetMapping("/laboratoire")
	public String labo() {
		return "/laboratoire/labo";
	}
	
	@GetMapping("/equipements")
	public String equipements() {
		return "/equipements/equipements";
	}
}
