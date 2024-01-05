package com.zygadlo.cash_register_system.service;

import com.zygadlo.cash_register_system.repository.DeviceRepository;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {

    private DeviceRepository deviRepo;

    public DeviceService(DeviceRepository deviRepo) {
        this.deviRepo = deviRepo;
    }
}
