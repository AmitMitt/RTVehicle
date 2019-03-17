package com.roadTransport.RTVehicle.serviceImpl;

import com.roadTransport.RTVehicle.entity.DeletedVehicleData;
import com.roadTransport.RTVehicle.repository.deletedRepository.DeletedVehiclePageRepository;
import com.roadTransport.RTVehicle.repository.deletedRepository.DeletedVehicleRepository;
import com.roadTransport.RTVehicle.service.DeletedVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DeletedVehicleServiceImpl implements DeletedVehicleService {

    @Autowired
    private DeletedVehicleRepository deletedVehicleRepository;

    @Autowired
    private DeletedVehiclePageRepository deletedVehiclePageRepository;

    @Override
    public Page<DeletedVehicleData> listAllByPage(Pageable pageable) {
        return deletedVehiclePageRepository.findAll(pageable);
    }

    @Override
    public DeletedVehicleData findByVehicle(String vehicleNumber) throws Exception {

        DeletedVehicleData deletedVehicleData = deletedVehicleRepository.findByNumber(vehicleNumber);
        if(deletedVehicleData == null){
            throw new Exception("Data not Exist.");
        }

        return deletedVehicleData;
    }
}
