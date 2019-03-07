package com.roadTransport.RTVehicle.repository;

import com.roadTransport.RTVehicle.entity.VehicleDetails;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiclePageRepository extends PagingAndSortingRepository<VehicleDetails, Long> {
}
