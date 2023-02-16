package com.example.demo.controllers.feigns;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Resource {

	private Meta meta;
	private Schema schemas;
	
	private ArrayList<Email> emails;
	
	@JsonProperty("urn:ietf:params:scim:schemas:extension:enterprise:2.0User")
	private UserParam userParam;
	
	private Role roles;
}
