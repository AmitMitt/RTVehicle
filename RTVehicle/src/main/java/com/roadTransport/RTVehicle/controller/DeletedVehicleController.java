package com.roadTransport.RTVehicle.controller;

import com.roadTransport.RTVehicle.entity.DeletedVehicleData;
import com.roadTransport.RTVehicle.service.DeletedVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/DeletedData")
public class DeletedVehicleController {

    @Autowired
    private DeletedVehicleService deletedVehicleService;

    @Cacheable(value = "DeletedVehicle", key = "#vehicleNumber")
    @GetMapping("/getDeletedData/{vehicleNumber}")
    public ResponseEntity<DeletedVehicleData> getByMdn(@PathVariable("vehicleNumber") String vehicleNumber) throws Exception {

        DeletedVehicleData deletedUserData = deletedVehicleService.findByVehicle(vehicleNumber);
        return ResponseEntity.ok(deletedUserData);
    }

    @Cacheable(value = "DeletedVehicle", key = "#vehicleNumber")
    @GetMapping("/getListOfDeletedData")
    public Page<DeletedVehicleData> getData(Pageable pageable){

        Page<DeletedVehicleData> list = deletedVehicleService.listAllByPage(PageRequest.of(0, 10, Sort.Direction.ASC));
        return list;
    }

}
