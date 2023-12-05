package com.khalil.security.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Role {
	public Role() {
    }
	
	public Role(Long role_id, String role) {
		super();
		this.role_id = role_id;
		this.role = role;
	}
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	private Long role_id;
	private String role;
	
	}
