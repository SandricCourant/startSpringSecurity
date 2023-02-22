package com.example.demo.controllers.feigns.models.groupResponse;

import com.example.demo.controllers.feigns.models.userReponse.RoleDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Members {

	LinkedHashMap<String,ArrayList<Member>> members;
	/*
	 * "":[{"type":"default","value":"Internal/everyone"}]
	 */
}
