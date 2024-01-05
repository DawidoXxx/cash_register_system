package com.zygadlo.cash_register_system.controller;

import com.zygadlo.cash_register_system.model.TaxPayer;
import com.zygadlo.cash_register_system.service.TaxPayerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TaxPayerRestController {

    private TaxPayerService taxPayerService;

    public TaxPayerRestController(TaxPayerService taxPayerService) {
        this.taxPayerService = taxPayerService;
    }
}
