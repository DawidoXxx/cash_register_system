package com.zygadlo.cash_register_system.controller;

import com.zygadlo.cash_register_system.service.InstallationPlaceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class InstallationPlaceRestController {

    private InstallationPlaceService insService;

    public InstallationPlaceRestController(InstallationPlaceService insService) {
        this.insService = insService;
    }
}
