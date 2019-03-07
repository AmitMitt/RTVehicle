package com.roadTransport.RTVehicle.controller;


import com.roadTransport.RTVehicle.entity.VehicleTemporayDetails;
import com.roadTransport.RTVehicle.model.VehicleRequest;
import com.roadTransport.RTVehicle.model.VehicleResponse;
import com.roadTransport.RTVehicle.service.VehicleTemporaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicleTemporary")
public class VehicleTemporaryController {

    @Autowired
    private VehicleTemporaryService vehicleTemporaryService;

    @PostMapping("/add")
    public ResponseEntity<VehicleResponse> add(@RequestBody VehicleRequest vehicleRequest) throws Exception {

        VehicleTemporayDetails vehicleTemporayDetails = vehicleTemporaryService.add(vehicleRequest);
        VehicleResponse vehicleResponse = new VehicleResponse();
        vehicleResponse.setMessage("please enter the otp for verification.");
        vehicleResponse.setOtp(vehicleTemporayDetails.getOtp());
        return ResponseEntity.ok(vehicleResponse);
    }

    @Cacheable(value = "VehicleDetails", key = "#vehicleNumber")
    @GetMapping("/getData/{vehicleNumber}")
    public ResponseEntity<VehicleTemporayDetails> getDataByNumber(@PathVariable("vehicleNumber") String vehicleNumber) throws Exception {

        VehicleTemporayDetails vehicleTemporayDetails = vehicleTemporaryService.getListByNumber(vehicleNumber);
        return ResponseEntity.ok(vehicleTemporayDetails);
    }

    @Cacheable(value = "VehicleDetails", key = "#vehicleNumber")
    @GetMapping("/getlistByPage")
    public Page<VehicleTemporayDetails> getList(Pageable pageable){

        Page<VehicleTemporayDetails> list = vehicleTemporaryService.listAllByPage(pageable);
        return list;
    }

}
