package com.roadTransport.RTVehicle.service;

import com.roadTransport.RTVehicle.entity.VehicleDetails;
import com.roadTransport.RTVehicle.model.OtpRequest;
import com.roadTransport.RTVehicle.model.VehicleRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface VehicleService {

    public VehicleDetails add (OtpRequest otpRequest) throws Exception;
    public VehicleDetails get(String vehicleNumber) throws Exception;
    public Page<VehicleDetails> listAllByPage(Pageable pageable);
    public VehicleDetails updateVehicleDetails(VehicleRequest vehicleRequest);
    public VehicleDetails updateRcImage(VehicleRequest vehicleRequest);
    public VehicleDetails updateVehicleInsurance(VehicleRequest vehicleRequest);
    public VehicleDetails updateVehicleStatus(VehicleRequest vehicleRequest);
    public VehicleDetails deleteByOtp(OtpRequest otpRequest) throws Exception;
}
