package com.example.demo.controllers.feigns.models.groupResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AsgardeoGroupResponse {

	private int totalResults;
	private int startIndex;
	private int itemsPerPage;
	private Schema2 schemas;
	private Resource2 Resources;
}
