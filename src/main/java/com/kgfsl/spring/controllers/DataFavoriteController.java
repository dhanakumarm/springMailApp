package com.kgfsl.spring.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kgfsl.spring.models.Cities;
import com.kgfsl.spring.models.DataFavorite;
import com.kgfsl.spring.services.DataFavoriteService;


@Controller
@RequestMapping(value = "datafavorite")
public class DataFavoriteController {

	@Autowired
	private DataFavoriteService dataFavService;
	
	@RequestMapping(value = "/")
	public String index(Model model) {
		String message = "Welcome to data favorite..!";
		Map dataFav = new HashMap();
		dataFav.put("listDataFav", dataFavService.listDataFavorite());
		model.addAttribute("message", message);
		return "/datafavorite/index";
	}

	/*@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody List<DataFavorite> getEmployeeInJSON() {
		List<DataFavorite> data = dataFavService.listDataFavorite();        
        return data;
    }*/
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addDataFav(Model model)
	{
		return "/datafavorite/add";
	}
	
	
	/**
	 * get all data Favorite list to json
	 * @return
	 */
	@RequestMapping(value="/getDataFavList",method=RequestMethod.GET,produces="application/json")
	public @ResponseBody List<DataFavorite> getDataFavList()
	{
		List<DataFavorite> data = dataFavService.listDataFavorite();
		return data;
	}
}
