package com.springlec.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.Movies_Dto;
import com.springlec.base.service.Movies_Dao_Service;

@Controller
@RequestMapping("/movies")
public class Movies_Controller {

	@Autowired
	Movies_Dao_Service service;
	
	@GetMapping("/list")
	public String movieslist(Model model) throws Exception{
		List<Movies_Dto> movies = service.moviesList();
		model.addAttribute("movies", movies);
		System.out.println(movies);
		return "movies";
	}
}
