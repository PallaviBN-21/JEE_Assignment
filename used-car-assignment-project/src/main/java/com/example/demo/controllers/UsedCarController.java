package com.example.demo.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.CarDetails;
import com.example.demo.repository.CarRepository;


@Controller
public class UsedCarController {

	
	@Autowired
	private CarDetails carDetail;;
	
	@Autowired
	private CarRepository repo;
	
	@RequestMapping(value = "/carDetails", method= RequestMethod.GET)
	public String initForm(Model model) {
		model.addAttribute("command",carDetail);
		return "addCarDetails";
	}
	
	@RequestMapping(value = "/carDetails", method= RequestMethod.POST)
	public String SubmitForm(@ModelAttribute ("command") CarDetails carDetail , Model model) {
		
		int rowAdded = repo.addCarDetails(carDetail);
		model.addAttribute("rowAdded",rowAdded);
		return "addCarDetails";
	}
	
	@RequestMapping(value = "/carDetails/view", method= RequestMethod.GET)
	public String findAllCustomers(Model model) {
		List<CarDetails> list=repo.getAllCarDetails();
		model.addAttribute("list",list);
		return "showCarDetails";
	}
	
	@RequestMapping(value = "/carDetails/search", method= RequestMethod.POST)
	public String findCarByBrand(Model model,  @RequestParam String brand) {
		
		//model.addAttribute("command",carDetail);
		List<CarDetails> list=repo.getAllModel();
		model.addAttribute("list",list);
		return "searchCar";
	}
	
	@RequestMapping(value = "/carDetails/view", method= RequestMethod.GET)
	public String findCarForTheRequestedBrand(Model model , @RequestParam String brand) {
		
		List<CarDetails> list=repo.getCarDetailsByBrand(brand);
		model.addAttribute("list",list);
		return "showCarDetails";
	}
}