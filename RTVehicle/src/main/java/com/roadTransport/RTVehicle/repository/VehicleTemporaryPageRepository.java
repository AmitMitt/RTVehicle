package com.roadTransport.RTVehicle.repository;

import com.roadTransport.RTVehicle.entity.VehicleTemporayDetails;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleTemporaryPageRepository extends PagingAndSortingRepository<VehicleTemporayDetails,Long> {
}
