package com.masai.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Model.User;

public interface Userrepo extends JpaRepository<User, Integer>{

	
}
