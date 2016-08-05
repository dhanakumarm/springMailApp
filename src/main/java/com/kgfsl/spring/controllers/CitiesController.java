package com.kgfsl.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kgfsl.spring.models.Cities;
import com.kgfsl.spring.services.CitiesService;

@Controller
@RequestMapping(value = "/cities")
public class CitiesController {

	@Autowired
	CitiesService citiesService;
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String index(Model model,Cities cities) {
		List<Cities> lst = citiesService.listCities();
		System.out.println("List of cities"+citiesService);
		model.addAttribute("cities", cities);
		model.addAttribute("cities_list", lst);		
		model.addAttribute("actions", "add");	
		cities.setId(0);
		return "/cities/index";
	}
	
	@RequestMapping(value={"/add","/cities/add"},method=RequestMethod.POST)
	public String addCities(@ModelAttribute("cities") Cities cities,BindingResult result){
		if(cities.getId() == 0){
			citiesService.addCities(cities);
		}else{
			citiesService.updateCities(cities);
		}
		
		return "redirect:/cities/";
	}
	
	@RequestMapping(value="/edit/{id}",method = RequestMethod.GET)
	public String editCities(@PathVariable("id") int id,Model model)
	{
		Cities city = citiesService.getCityById(id);
		model.addAttribute("cities", city);
		System.out.println("City of cities"+city);
		model.addAttribute("cities_list", city);	
		model.addAttribute("actions", "../cities/add");		
		return "/cities/index";	
	}
	
	@RequestMapping(value="/ajaxAdd",method=RequestMethod.GET)
	public String ajaxAddCities(Model model,Cities cities)
	{
		return "/cities/ajax_add";
	}
}
