package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.DTO.UserDTO;
import com.masai.Model.User;
import com.masai.Service.Userservice;

@RestController
public class Usercontroller {
	
	
	@Autowired
	public Userservice useservice;
	
	
	@PostMapping("/user")
	public ResponseEntity<UserDTO>register(@RequestBody User user){
		UserDTO x = useservice.Register(user);
		return new ResponseEntity<UserDTO>(x,HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<User>get(@PathVariable Integer id){
		User ssUser = useservice.getId(id);
		return new ResponseEntity<User>(ssUser , HttpStatus.ACCEPTED);
	}
	
	
	@PutMapping("/user")
	public ResponseEntity<User>update(@RequestBody User user){
		User x = useservice.Update(user);
		return new ResponseEntity<User>(x,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<User>delete(@PathVariable Integer id){
		User ssUser = useservice.Delete(id);
		return new ResponseEntity<User>(ssUser , HttpStatus.ACCEPTED);
	}
	
	
	
}
