package com.zygadlo.cash_register_system.service;

import com.zygadlo.cash_register_system.model.TaxPayer;
import com.zygadlo.cash_register_system.repository.TaxPayerRepository;
import org.springframework.stereotype.Service;

@Service
public class TaxPayerService {

    private TaxPayerRepository taxPayerRepository;

    public TaxPayerService(TaxPayerRepository taxPayerRepository) {
        this.taxPayerRepository = taxPayerRepository;
    }
}
