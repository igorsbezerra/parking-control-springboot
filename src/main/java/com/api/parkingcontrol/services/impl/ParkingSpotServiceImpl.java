package com.api.parkingcontrol.services.impl;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import com.api.parkingcontrol.services.ParkingSpotService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotServiceImpl implements ParkingSpotService {
    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotServiceImpl(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Override
    @Transactional
    public ParkingSpotModel save(ParkingSpotModel model) {
        return this.parkingSpotRepository.save(model);
    }

    @Override
    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return this.parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }

    @Override
    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return this.parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    @Override
    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return this.parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

    @Override
    public Page<ParkingSpotModel> findAll(Pageable pageable) {
        return this.parkingSpotRepository.findAll(pageable);
    }

    @Override
    public Optional<ParkingSpotModel> findById(UUID id) {
        return this.parkingSpotRepository.findById(id);
    }

    @Override
    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        this.parkingSpotRepository.delete(parkingSpotModel);
    }
}
