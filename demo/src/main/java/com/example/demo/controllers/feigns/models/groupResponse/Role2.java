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
public class Role2 {

	LinkedHashMap<String,ArrayList<RoleDetail2>> roleDetail2;
	/*
	 * "":[{"type":"default","value":"Internal/everyone"}]
	 */
}
