package com.roadTransport.RTVehicle.serviceImpl;

import com.roadTransport.RTVehicle.entity.VehicleDetails;
import com.roadTransport.RTVehicle.entity.VehicleTemporayDetails;
import com.roadTransport.RTVehicle.model.OtpRequest;
import com.roadTransport.RTVehicle.model.VehicleRequest;
import com.roadTransport.RTVehicle.otpService.OtpService;
import com.roadTransport.RTVehicle.repository.VehiclePageRepository;
import com.roadTransport.RTVehicle.repository.VehicleRepository;
import com.roadTransport.RTVehicle.repository.VehicleTemporaryRepository;
import com.roadTransport.RTVehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private VehicleTemporaryRepository vehicleTemporaryRepository;

    @Autowired
    private OtpService otpService;

    @Autowired
    private VehiclePageRepository vehiclePageRepository;

    @Override
    public VehicleDetails add(OtpRequest otpRequest) throws Exception {

        VehicleTemporayDetails vehicleTemporayDetails = vehicleTemporaryRepository.findByNumber(otpRequest.getVehicleNumber());

        if(vehicleTemporayDetails == null){
            throw new Exception("User Data is not Available.");
        }

        boolean verify = otpService.verify(otpRequest.getOtp(),otpRequest.getUserMobileNumber());

        if(verify == false){

            throw new Exception("Otp is Expired.");
        }
        else {

            VehicleDetails vehicleDetails = new VehicleDetails();
            vehicleDetails.setDriverName(vehicleTemporayDetails.getDriverName());
            vehicleDetails.setInsuranceImage(vehicleTemporayDetails.getInsuranceImage());
            vehicleDetails.setOwnerName(vehicleTemporayDetails.getOwnerName());
            vehicleDetails.setRcImage(vehicleTemporayDetails.getRcImage());
            vehicleDetails.setVehicleCompanyName(vehicleTemporayDetails.getVehicleCompanyName());
            vehicleDetails.setVehicleFuelType(vehicleTemporayDetails.getVehicleFuelType());
            vehicleDetails.setVehicleImage(vehicleTemporayDetails.getVehicleImage());
            vehicleDetails.setVehicleInsuranceNumber(vehicleTemporayDetails.getVehicleInsuranceNumber());
            vehicleDetails.setVehicleLoadCapacity(vehicleTemporayDetails.getVehicleLoadCapacity());
            vehicleDetails.setVehicleModel(vehicleTemporayDetails.getVehicleModel());
            vehicleDetails.setVehicleName(vehicleTemporayDetails.getVehicleName());
            vehicleDetails.setVehicleNumber(vehicleTemporayDetails.getVehicleNumber());
            vehicleDetails.setVehicleRcNumber(vehicleTemporayDetails.getVehicleRcNumber());
            vehicleDetails.setVehicleSeatingCapacity(vehicleTemporayDetails.getVehicleSeatingCapacity());
            vehicleDetails.setVehicleSize(vehicleTemporayDetails.getVehicleSize());
            vehicleDetails.setVehicleStatus(false);
            vehicleDetails.setVehicleTotalTyres(vehicleTemporayDetails.getVehicleTotalTyres());
            vehicleDetails.setVehicleTransportName(vehicleTemporayDetails.getVehicleTransportName());
            vehicleDetails.setVehicleTransportNumber(vehicleTemporayDetails.getVehicleTransportNumber());
            vehicleDetails.setVehicleType(vehicleTemporayDetails.getVehicleType());
            vehicleDetails.setOwnerMobileNumber(vehicleTemporayDetails.getOwnerMobileNumber());
            vehicleDetails.setCreatedDate(new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));

            vehicleRepository.saveAndFlush(vehicleDetails);
            return vehicleDetails;
        }
    }

    @Override
    public VehicleDetails get(String vehicleNumber) throws Exception {

       VehicleDetails vehicleDetails = vehicleRepository.findByNumber(vehicleNumber);

       if(vehicleDetails==null){
           throw new Exception("Vehicle Data Not Exist.");
       }

        return vehicleDetails;
    }

    @Override
    public VehicleDetails delete(String vehicleNumber) throws Exception {

        VehicleDetails vehicleDetails = vehicleRepository.findByNumber(vehicleNumber);

        if(vehicleDetails!=null) {

            vehicleDetails.setVehicleStatus(false);
            vehicleRepository.saveAndFlush(vehicleDetails);
        }

        else{
            throw new Exception("Vehicle Data Not Exist.");
        }

        return null;
    }



    @Override
    public Page<VehicleDetails> listAllByPage(Pageable pageable) {
        return vehiclePageRepository.findAll(pageable);
    }

    @Override
    public VehicleDetails updateVehicleDetails(VehicleRequest vehicleRequest) {

        VehicleDetails vehicleDetails = vehicleRepository.findByNumber(vehicleRequest.getVehicleNumber());

        vehicleDetails.setDriverName(vehicleRequest.getDriverName());
        vehicleDetails.setOwnerName(vehicleRequest.getOwnerName());
        vehicleDetails.setVehicleCompanyName(vehicleRequest.getVehicleCompanyName());
        vehicleDetails.setVehicleFuelType(vehicleRequest.getVehicleFuelType());
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
        vehicleDetails.setModifedDate(new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));

        vehicleRepository.saveAndFlush(vehicleDetails);
        return vehicleDetails;
    }

    @Override
    public VehicleDetails updateRcImage(VehicleRequest vehicleRequest) {

        VehicleDetails vehicleDetails = vehicleRepository.findByNumber(vehicleRequest.getVehicleNumber());
        vehicleDetails.setRcImage(Base64.getEncoder().encodeToString(vehicleRequest.getRcImage().getBytes()));

        vehicleRepository.saveAndFlush(vehicleDetails);
        return vehicleDetails;
    }

    @Override
    public VehicleDetails updateVehicleInsurance(VehicleRequest vehicleRequest) {

        VehicleDetails vehicleDetails = vehicleRepository.findByNumber(vehicleRequest.getVehicleNumber());
        vehicleDetails.setInsuranceImage(Base64.getEncoder().encodeToString(vehicleRequest.getInsuranceImage().getBytes()));

        vehicleRepository.saveAndFlush(vehicleDetails);
        return vehicleDetails;
    }

    @Override
    public VehicleDetails updateVehicleStatus(VehicleRequest vehicleRequest) {

        VehicleDetails vehicleDetails = vehicleRepository.findByNumber(vehicleRequest.getVehicleNumber());
        vehicleDetails.setVehicleStatus(vehicleRequest.isVehicleStatus());

        vehicleRepository.saveAndFlush(vehicleDetails);
        return vehicleDetails;
    }
}
