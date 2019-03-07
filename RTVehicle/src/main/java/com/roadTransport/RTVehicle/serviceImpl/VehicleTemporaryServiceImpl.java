package com.roadTransport.RTVehicle.serviceImpl;

import com.roadTransport.RTVehicle.entity.VehicleDetails;
import com.roadTransport.RTVehicle.entity.VehicleTemporayDetails;
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

import java.text.SimpleDateFormat;
import java.util.Calendar;

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
    public VehicleTemporayDetails add(VehicleRequest vehicleRequest) throws Exception {

        VehicleTemporayDetails vehicleDetails = vehicleTemporaryRepository.findByNumber(vehicleRequest.getVehicleNumber());

        VehicleDetails vehicleDetails2 = vehicleRepository.findByNumber(vehicleRequest.getVehicleNumber());

        if(vehicleDetails2 !=null){
            throw new Exception("Vehicle Already Exist with this Number.");
        }

        if(vehicleDetails == null){

            VehicleTemporayDetails vehicleDetails1 = new VehicleTemporayDetails();
            vehicleDetails1.setDriverName(vehicleRequest.getDriverName());
            vehicleDetails1.setInsuranceImage(vehicleRequest.getInsuranceImage());
            vehicleDetails1.setOwnerName(vehicleRequest.getOwnerName());
            vehicleDetails1.setRcImage(vehicleRequest.getRcImage());
            vehicleDetails1.setVehicleCompanyName(vehicleRequest.getVehicleCompanyName());
            vehicleDetails1.setVehicleFuelType(vehicleRequest.getVehicleFuelType());
            vehicleDetails1.setVehicleImage(vehicleRequest.getVehicleImage());
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
            vehicleDetails1.setCreatedDate(new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));

            OtpDetails otpDetails = otpService.getOtp(vehicleRequest.getOwnerMobileNumber());
            vehicleDetails1.setOtp(otpDetails.getOtpNumber());
            vehicleTemporaryRepository.saveAndFlush(vehicleDetails1);
            return vehicleDetails1;
        }

        else{

            vehicleDetails.setDriverName(vehicleRequest.getDriverName());
            vehicleDetails.setInsuranceImage(vehicleRequest.getInsuranceImage());
            vehicleDetails.setOwnerName(vehicleRequest.getOwnerName());
            vehicleDetails.setRcImage(vehicleRequest.getRcImage());
            vehicleDetails.setVehicleCompanyName(vehicleRequest.getVehicleCompanyName());
            vehicleDetails.setVehicleFuelType(vehicleRequest.getVehicleFuelType());
            vehicleDetails.setVehicleImage(vehicleRequest.getVehicleImage());
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
            vehicleDetails.setModiedDate(new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));

            OtpDetails otpDetails = otpService.getOtp(vehicleRequest.getOwnerMobileNumber());
            vehicleDetails.setOtp(otpDetails.getOtpNumber());
            vehicleTemporaryRepository.saveAndFlush(vehicleDetails);

            return vehicleDetails;
        }
    }

    @Override
    public VehicleTemporayDetails getListByNumber(String vehicleNumber) throws Exception {

        VehicleTemporayDetails vehicleDetails = vehicleTemporaryRepository.findByNumber(vehicleNumber);

        return vehicleDetails;
    }

    @Override
    public Page<VehicleTemporayDetails> listAllByPage(Pageable pageable) {
        return vehicleTemporaryPageRepository.findAll(pageable);
    }
}
