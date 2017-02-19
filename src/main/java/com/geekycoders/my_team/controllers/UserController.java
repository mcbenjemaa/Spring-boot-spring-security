package com.geekycoders.my_team.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.geekycoders.my_team.domain.User;
import com.geekycoders.my_team.services.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/findall")
    @ResponseBody
	public List<User> findall(){
		return userRepository.findAll();
		
	}
	@RequestMapping("/find")
    @ResponseBody
	public User getUser(@PathParam("id") int id){
		return userRepository.findOne(id);
	}
	
}
