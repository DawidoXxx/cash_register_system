package com.zygadlo.cash_register_system.controller;

import com.zygadlo.cash_register_system.service.DeviceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DeviceRestController {

    private DeviceService devService;

    public DeviceRestController(DeviceService devService) {
        this.devService = devService;
    }
}
