package com.example.demo.controllers.feigns;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "asgardeo", url = "https://api.asgardeo.io/t/altrh")
public interface AsgardeoFeignClient {
	
	@PostMapping("/oauth2/token")
	public AsgardeoResponse getTokenFromCode(@RequestParam String grant_type, @RequestParam String client_id,
			@RequestParam String code, @RequestParam String redirect_uri);

	@GetMapping("scim2/Users")
	public AsgardeoUserResponse getUsers(@RequestHeader String token);
	
}


//https://api.asgardeo.io/t/altrh/oauth2/token?grant_type=client_credentials&client_id=U5abWEqOf_LxrJ5swKSiyJH7jMQa&code=XXXXX&redirect_uri=http://localhost:3001/redirecturl
