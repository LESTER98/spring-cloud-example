package com.example.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "EUREKA-CLIENT-HI")
public class HiFeignClient {


}
