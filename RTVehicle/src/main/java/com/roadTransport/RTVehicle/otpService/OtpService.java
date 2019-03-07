package com.roadTransport.RTVehicle.otpService;

import com.roadTransport.RTVehicle.model.OtpDetails;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "OtpService", url = "http://localhost:8090/otp/")
public interface OtpService {

    @GetMapping("/getOtp/{mdn}")
    @Headers("Content-Type: application/json")
    public OtpDetails getOtp(@PathVariable("mdn") long ownerMobileNumber);

    @GetMapping("/verifyOtp/{otp}/{mdn}")
    @Headers("Content-Type: application/json")
    public boolean verify(@PathVariable("otp") long otp, @PathVariable("mdn") long ownerMobileNumber);

}