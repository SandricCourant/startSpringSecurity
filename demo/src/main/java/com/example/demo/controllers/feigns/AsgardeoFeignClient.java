package com.example.demo.controllers.feigns;

import com.example.demo.controllers.dto.AsgardeoResponse;
import com.example.demo.controllers.dto.AsgardeoUserResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="asgardeo", url = "https://api.asgard.io/t/althrh")
public interface AsgardeoFeignClient {
    @PostMapping("/oauth2/token")
    public AsgardeoResponse getTokenFromCode(@RequestParam String grant_type, @RequestParam String client_id, @RequestParam String code, @RequestParam String redirect_uri);
    @GetMapping("scim2/Users")
    public AsgardeoUserResponse getUsers(@RequestHeader String token);
}
