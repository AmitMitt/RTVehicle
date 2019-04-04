package com.roadTransport.RTVehicle.repository;

import com.roadTransport.RTVehicle.entity.VehicleDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleDetails, Long> {

    @Query("Select v from VehicleDetails v where v.vehicleNumber = :vehicleNumber and v.deleted = false")
    public VehicleDetails findByNumber(@PathVariable("vehicleNumber") String vehicleNumber);


}
