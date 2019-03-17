package com.roadTransport.RTVehicle.repository.deletedRepository;

import com.roadTransport.RTVehicle.entity.DeletedVehicleData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface DeletedVehicleRepository extends JpaRepository<DeletedVehicleData, Long> {

    @Query("Select d from DeletedVehicleData d where d.vehicleNumber = :vehicleNumber")
    public DeletedVehicleData findByNumber(@PathVariable("vehicleNumber") String vehicleNumber);
}
