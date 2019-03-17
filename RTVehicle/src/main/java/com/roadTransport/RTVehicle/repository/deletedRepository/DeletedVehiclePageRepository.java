package com.roadTransport.RTVehicle.repository.deletedRepository;

import com.roadTransport.RTVehicle.entity.DeletedVehicleData;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeletedVehiclePageRepository extends PagingAndSortingRepository<DeletedVehicleData, Long> {
}
