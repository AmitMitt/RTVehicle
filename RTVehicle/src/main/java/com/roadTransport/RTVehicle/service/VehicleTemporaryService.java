package com.roadTransport.RTVehicle.service;

import com.roadTransport.RTVehicle.entity.VehicleTemporaryDetails;
import com.roadTransport.RTVehicle.model.VehicleRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface VehicleTemporaryService {

    public VehicleTemporaryDetails add (VehicleRequest vehicleRequest) throws Exception;
    public VehicleTemporaryDetails getListByNumber(String vehicleNumber) throws Exception;
    public Page<VehicleTemporaryDetails> listAllByPage(Pageable pageable);

}
