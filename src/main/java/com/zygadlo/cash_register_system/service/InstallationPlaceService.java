package com.zygadlo.cash_register_system.service;

import com.zygadlo.cash_register_system.repository.InstallationPlaceRepository;
import org.springframework.stereotype.Service;

@Service
public class InstallationPlaceService {

    private InstallationPlaceRepository instPlaRepo;

    public InstallationPlaceService(InstallationPlaceRepository instPlaRepo) {
        this.instPlaRepo = instPlaRepo;
    }
}
