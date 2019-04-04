package com.roadTransport.RTVehicle.repository;

import com.roadTransport.RTVehicle.entity.VehicleTemporaryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleTemporaryRepository extends JpaRepository<VehicleTemporaryDetails, Long> {

    @Query("Select v from VehicleTemporaryDetails v where v.vehicleNumber = :vehicleNumber")
    public VehicleTemporaryDetails findByNumber(String vehicleNumber);
}
