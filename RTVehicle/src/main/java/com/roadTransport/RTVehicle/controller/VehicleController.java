package com.roadTransport.RTVehicle.controller;

import com.roadTransport.RTVehicle.entity.VehicleDetails;
import com.roadTransport.RTVehicle.model.OtpRequest;
import com.roadTransport.RTVehicle.model.VehicleRequest;
import com.roadTransport.RTVehicle.model.VehicleResponse;
import com.roadTransport.RTVehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/add")
    public ResponseEntity<VehicleResponse> add(@RequestBody OtpRequest otpRequest) throws Exception {

        vehicleService.add(otpRequest);
        VehicleResponse vehicleResponse = new VehicleResponse();
        vehicleResponse.setMessage("Vehicle Successfully Added.");
        return ResponseEntity.ok(vehicleResponse);
    }

    @Cacheable(value = "VehicleDetails", key = "#vehicleNumber")
    @GetMapping("/getVehicle/{vehicleNumber}")
    public ResponseEntity<VehicleDetails> get(@PathVariable("vehicleNumber") String vehicleNumber) throws Exception {

        VehicleDetails vehicleDetails = vehicleService.get(vehicleNumber);
        return ResponseEntity.ok(vehicleDetails);
    }

    @Cacheable(value = "VehicleDetails", key = "#vehicleNumber")
    @GetMapping("/getlistByPage")
    public Page<VehicleDetails> getList(Pageable pageable){

        Page<VehicleDetails> list = vehicleService.listAllByPage(PageRequest.of(0,10, Sort.Direction.ASC));
        return list;
    }

    @CachePut(value = "VehicleDetails", key = "#vehicleNumber")
    @PutMapping("/update")
    public ResponseEntity<VehicleResponse> update(@RequestBody VehicleRequest vehicleRequest){

        vehicleService.updateVehicleDetails(vehicleRequest);
        VehicleResponse vehicleResponse = new VehicleResponse();
        vehicleResponse.setMessage("Successfully Updated.");
        return ResponseEntity.ok(vehicleResponse);
    }

    @CacheEvict(value = "VehicleDetails", allEntries=true)
    @DeleteMapping("/delete")
    public ResponseEntity<VehicleResponse> delete(@RequestBody OtpRequest otpRequest) throws Exception {

        vehicleService.deleteByOtp(otpRequest);
        VehicleResponse vehicleResponse = new VehicleResponse();
        vehicleResponse.setMessage("Successfully Deleted.");
        vehicleResponse.setOtp(otpRequest.getOtp());
        return ResponseEntity.ok(vehicleResponse);
    }
    @CachePut(value = "VehicleDetails", key = "#vehicleNumber")
    @PutMapping("/updateRcImage")
    public ResponseEntity<VehicleResponse> updateRcImage(@RequestBody VehicleRequest vehicleRequest){

        vehicleService.updateRcImage(vehicleRequest);
        VehicleResponse vehicleResponse = new VehicleResponse();
        vehicleResponse.setMessage("Successfully Updated.");
        return ResponseEntity.ok(vehicleResponse);
    }

    @CachePut(value = "VehicleDetails", key = "#vehicleNumber")
    @PutMapping("/updateInsuranceImage")
    public ResponseEntity<VehicleResponse> updateInsuranceImage(@RequestBody VehicleRequest vehicleRequest){

        vehicleService.updateVehicleInsurance(vehicleRequest);
        VehicleResponse vehicleResponse = new VehicleResponse();
        vehicleResponse.setMessage("Successfully Updated.");
        return ResponseEntity.ok(vehicleResponse);
    }

    @CachePut(value = "VehicleDetails", key = "#vehicleNumber")
    @PutMapping("/updateVehicleStatus")
    public ResponseEntity<VehicleResponse> updateVehicleStatus(@RequestBody VehicleRequest vehicleRequest){

        vehicleService.updateVehicleStatus(vehicleRequest);
        VehicleResponse vehicleResponse = new VehicleResponse();
        vehicleResponse.setMessage("Successfully Updated.");
        return ResponseEntity.ok(vehicleResponse);
    }


}
