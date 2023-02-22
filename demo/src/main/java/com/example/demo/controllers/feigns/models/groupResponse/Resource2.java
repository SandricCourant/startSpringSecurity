package com.example.demo.controllers.feigns.models.groupResponse;

import com.example.demo.controllers.feigns.models.groupResponse.Meta2;
import com.example.demo.controllers.feigns.models.groupResponse.Role2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Resource2 {
	private String displayName;
	private Meta2 meta;
	private Members members;
	private Role2 roles;
	private String id;
}
