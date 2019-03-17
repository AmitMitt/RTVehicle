package com.roadTransport.RTVehicle.service;

import com.roadTransport.RTVehicle.entity.DeletedVehicleData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface DeletedVehicleService {

    public Page<DeletedVehicleData> listAllByPage(Pageable pageable);
    public DeletedVehicleData findByVehicle(String vehicleNumber) throws Exception;

}
