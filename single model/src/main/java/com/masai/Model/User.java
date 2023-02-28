package com.masai.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
	private Integer Id;
	private String name;
	private String cityString;

	private String password;
}
