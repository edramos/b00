package com.simularte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simularte.model.Usuario;
import com.simularte.service.UserService;

@Controller
public class UserController {

	@Autowired UserService us;
	
	@RequestMapping("toLogin")
	public String toLogin(){
		return "login";
	}

	@RequestMapping(value = "toCrearCuenta", method = RequestMethod.POST)
	public String toCrearCuenta(@ModelAttribute("usuario")Usuario usuario, Model model){
		String path = "";
		
		if(us.crearCuenta(usuario)){
			model.addAttribute("msg", "Cuenta creada!");
		}else{
			model.addAttribute("msg", "Error!");
		}
		path = "login";
		
		return path;
	}
}