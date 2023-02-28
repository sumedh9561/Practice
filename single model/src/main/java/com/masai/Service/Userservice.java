package com.masai.Service;

import org.hibernate.sql.Update;

import com.masai.DTO.UserDTO;
import com.masai.Model.User;

public interface Userservice {
	
	public UserDTO Register(User user);
	
	public User getId(Integer userid);
	
	public User Update(User userid); 
	
	public User Delete(Integer id);

}
