package com.zygadlo.cash_register_system.repository;

import com.zygadlo.cash_register_system.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device,Long> {
}
