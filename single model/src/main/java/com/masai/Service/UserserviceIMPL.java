package com.masai.Service;

import java.util.Optional;

import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.DTO.UserDTO;
import com.masai.Model.User;
import com.masai.Repo.Userrepo;

@Service
public class UserserviceIMPL implements Userservice{
	
	@Autowired
	public Userrepo  userrepo;

	
	
	@Override
	public UserDTO Register(User user) {
		User sSUser = userrepo.save(user);
		UserDTO xy = new UserDTO();
		xy.setName(sSUser.getName());
		xy.setCityString(sSUser.getCityString());
		return xy;
	}

	
	
	@Override
	public User getId(Integer userid) {
       
		Optional<User> ssUser = userrepo.findById(userid);
		
		if(ssUser.isEmpty()) {
          System.out.println("No user found");
		
		
		}
	return ssUser.get();
		
	}

	
	
	@Override
	public User Update(User userid) {
    Optional<User> ssUser = userrepo.findById(userid.getId());
		
		if(ssUser.isEmpty()) {
          System.out.println("No user found");
          
		}
		User yyUser = ssUser.get();
		yyUser.setName(userid.getName());
		yyUser.setCityString(userid.getCityString());
		
		return userrepo.save(yyUser);
	}



	@Override
	public User Delete(Integer id) {

		Optional<User>ssuser= userrepo.findById(id);
		if(ssuser.isEmpty()) {
	          System.out.println("No user found");
	          
			}
		User zzuser= ssuser.get();
		userrepo.delete(zzuser);

		
		return zzuser ;
	}

	
	
	


}
