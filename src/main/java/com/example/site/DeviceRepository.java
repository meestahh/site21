package com.example.site;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DeviceRepository extends JpaRepository<Device,Long>{
    @Query("SELECT p FROM Device p WHERE concat(p.type1, '', p.groupp, '', p.date_first, '', p.data_last, '', p.fio) LIKE %?1%")
    List<Device> search(String keyword);
}
