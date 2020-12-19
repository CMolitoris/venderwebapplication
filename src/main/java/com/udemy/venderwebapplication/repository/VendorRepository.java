package com.udemy.venderwebapplication.repository;

import com.udemy.venderwebapplication.entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor,Integer> {
}
