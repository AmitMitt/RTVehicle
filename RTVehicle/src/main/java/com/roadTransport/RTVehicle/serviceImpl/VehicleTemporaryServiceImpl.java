package com.roadTransport.RTVehicle.serviceImpl;

import com.roadTransport.RTVehicle.entity.VehicleDetails;
import com.roadTransport.RTVehicle.entity.VehicleTemporaryDetails;
import com.roadTransport.RTVehicle.model.OtpDetails;
import com.roadTransport.RTVehicle.model.VehicleRequest;
import com.roadTransport.RTVehicle.otpService.OtpService;
import com.roadTransport.RTVehicle.repository.VehicleRepository;
import com.roadTransport.RTVehicle.repository.VehicleTemporaryPageRepository;
import com.roadTransport.RTVehicle.repository.VehicleTemporaryRepository;
import com.roadTransport.RTVehicle.service.VehicleTemporaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Base64;
import java.util.Calendar;
import java.util.TimeZone;

@Service
public class VehicleTemporaryServiceImpl implements VehicleTemporaryService {

    @Autowired
    private VehicleTemporaryRepository vehicleTemporaryRepository;

    @Autowired
    private OtpService otpService;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private VehicleTemporaryPageRepository vehicleTemporaryPageRepository;


    @Override
    public VehicleTemporaryDetails add(VehicleRequest vehicleRequest) throws Exception {

        VehicleTemporaryDetails vehicleDetails = vehicleTemporaryRepository.findByNumber(vehicleRequest.getVehicleNumber());

        VehicleDetails vehicleDetails2 = vehicleRepository.findByNumber(vehicleRequest.getVehicleNumber());

        if(vehicleDetails2 !=null){
            throw new Exception("Vehicle Already Exist with this Number.");
        }

        if(vehicleDetails == null){

            VehicleTemporaryDetails vehicleDetails1 = new VehicleTemporaryDetails();
            vehicleDetails1.setDriverName(vehicleRequest.getDriverName());
            vehicleDetails1.setInsuranceImage(Base64.getEncoder().encodeToString(vehicleRequest.getInsuranceImage().getBytes()));
            vehicleDetails1.setOwnerName(vehicleRequest.getOwnerName());
            vehicleDetails1.setRcImage(Base64.getEncoder().encodeToString(vehicleRequest.getRcImage().getBytes()));
            vehicleDetails1.setVehicleCompanyName(vehicleRequest.getVehicleCompanyName());
            vehicleDetails1.setVehicleFuelType(vehicleRequest.getVehicleFuelType());
            vehicleDetails1.setVehicleImage(Base64.getEncoder().encodeToString(vehicleRequest.getVehicleImage().getBytes()));
            vehicleDetails1.setVehicleInsuranceNumber(vehicleRequest.getVehicleInsuranceNumber());
            vehicleDetails1.setVehicleLoadCapacity(vehicleRequest.getVehicleLoadCapacity());
            vehicleDetails1.setVehicleModel(vehicleRequest.getVehicleModel());
            vehicleDetails1.setVehicleName(vehicleRequest.getVehicleName());
            vehicleDetails1.setVehicleNumber(vehicleRequest.getVehicleNumber());
            vehicleDetails1.setVehicleRcNumber(vehicleRequest.getVehicleRcNumber());
            vehicleDetails1.setVehicleSeatingCapacity(vehicleRequest.getVehicleSeatingCapacity());
            vehicleDetails1.setVehicleSize(vehicleRequest.getVehicleSize());
            vehicleDetails1.setVehicleStatus(false);
            vehicleDetails1.setVehicleTotalTyres(vehicleRequest.getVehicleTotalTyres());
            vehicleDetails1.setVehicleTransportName(vehicleRequest.getVehicleTransportName());
            vehicleDetails1.setVehicleTransportNumber(vehicleRequest.getVehicleTransportNumber());
            vehicleDetails1.setVehicleType(vehicleRequest.getVehicleType());
            vehicleDetails1.setOwnerMobileNumber(vehicleRequest.getOwnerMobileNumber());
            vehicleDetails1.setCreatedDate(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis());

            OtpDetails otpDetails = otpService.getOtp(vehicleRequest.getOwnerMobileNumber());
            vehicleDetails1.setOtp(otpDetails.getOtpNumber());
            vehicleTemporaryRepository.saveAndFlush(vehicleDetails1);
            return vehicleDetails1;
        }

        else{

            vehicleDetails.setDriverName(vehicleRequest.getDriverName());
            vehicleDetails.setInsuranceImage(Base64.getEncoder().encodeToString(vehicleRequest.getInsuranceImage().getBytes()));
            vehicleDetails.setOwnerName(vehicleRequest.getOwnerName());
            vehicleDetails.setRcImage(Base64.getEncoder().encodeToString(vehicleRequest.getRcImage().getBytes()));
            vehicleDetails.setVehicleCompanyName(vehicleRequest.getVehicleCompanyName());
            vehicleDetails.setVehicleFuelType(vehicleRequest.getVehicleFuelType());
            vehicleDetails.setVehicleImage(Base64.getEncoder().encodeToString(vehicleRequest.getVehicleImage().getBytes()));
            vehicleDetails.setVehicleInsuranceNumber(vehicleRequest.getVehicleInsuranceNumber());
            vehicleDetails.setVehicleLoadCapacity(vehicleRequest.getVehicleLoadCapacity());
            vehicleDetails.setVehicleModel(vehicleRequest.getVehicleModel());
            vehicleDetails.setVehicleName(vehicleRequest.getVehicleName());
            vehicleDetails.setVehicleNumber(vehicleRequest.getVehicleNumber());
            vehicleDetails.setVehicleRcNumber(vehicleRequest.getVehicleRcNumber());
            vehicleDetails.setVehicleSeatingCapacity(vehicleRequest.getVehicleSeatingCapacity());
            vehicleDetails.setVehicleSize(vehicleRequest.getVehicleSize());
            vehicleDetails.setVehicleStatus(false);
            vehicleDetails.setVehicleTotalTyres(vehicleRequest.getVehicleTotalTyres());
            vehicleDetails.setVehicleTransportName(vehicleRequest.getVehicleTransportName());
            vehicleDetails.setVehicleTransportNumber(vehicleRequest.getVehicleTransportNumber());
            vehicleDetails.setVehicleType(vehicleRequest.getVehicleType());
            vehicleDetails.setOwnerMobileNumber(vehicleRequest.getOwnerMobileNumber());
            vehicleDetails.setModiedDate(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis());

            OtpDetails otpDetails = otpService.getOtp(vehicleRequest.getOwnerMobileNumber());
            vehicleDetails.setOtp(otpDetails.getOtpNumber());
            vehicleTemporaryRepository.saveAndFlush(vehicleDetails);

            return vehicleDetails;
        }
    }

    @Override
    public VehicleTemporaryDetails getListByNumber(String vehicleNumber) throws Exception {

        VehicleTemporaryDetails vehicleDetails = vehicleTemporaryRepository.findByNumber(vehicleNumber);

        return vehicleDetails;
    }

    @Override
    public Page<VehicleTemporaryDetails> listAllByPage(Pageable pageable) {
        return vehicleTemporaryPageRepository.findAll(pageable);
    }
}
