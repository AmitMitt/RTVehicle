package com.roadTransport.RTVehicle.service;

import com.roadTransport.RTVehicle.entity.VehicleTemporayDetails;
import com.roadTransport.RTVehicle.model.VehicleRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface VehicleTemporaryService {

    public VehicleTemporayDetails add (VehicleRequest vehicleRequest) throws Exception;
    public VehicleTemporayDetails getListByNumber(String vehicleNumber) throws Exception;
    public Page<VehicleTemporayDetails> listAllByPage(Pageable pageable);

}
