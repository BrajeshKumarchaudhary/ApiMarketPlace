package com.java.api.login.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import com.java.api.utills.ERole;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "roles")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(value = "Role Id", example = "5", position = 1)
	private Integer role_id;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	@ApiModelProperty(value = "Role Name", example = "ROLE_USER", position = 2)
	private ERole name;
	
//	@ManyToMany(mappedBy = "users")
//	private Set<User> users=new HashSet<>();
	public Integer getId() {
		return role_id;
	}

	public void setId(Integer id) {
		this.role_id = id;
	}

	public ERole getName() {
		return name;
	}

	public void setName(ERole name) {
		this.name = name;
	}

	public Role() {

	}

	public Role(ERole name) {
		this.name = name;
	}
}
