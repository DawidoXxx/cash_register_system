package com.zygadlo.cash_register_system.repository;

import com.zygadlo.cash_register_system.model.TaxPayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxPayerRepository extends JpaRepository<TaxPayer,Long> {
}
