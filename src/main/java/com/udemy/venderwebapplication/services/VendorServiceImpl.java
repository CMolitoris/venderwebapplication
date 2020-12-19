package com.udemy.venderwebapplication.services;

import com.udemy.venderwebapplication.entities.Vendor;
import com.udemy.venderwebapplication.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements VendorService{
    @Autowired
    private VendorRepository repository;

    public VendorRepository getRepository() {
        return repository;
    }

    public void setRepository(VendorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Vendor saveVendor(Vendor vendor) {
        return repository.save(vendor);
    }

    @Override
    public Vendor updateVendor(Vendor vendor) {
        return repository.save(vendor);
    }

    @Override
    public void deleteVendor(Vendor vendor) {
        repository.delete(vendor);
    }

    @Override
    public Vendor getVendorById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Vendor> getAllVendors() {
        return repository.findAll();
    }
}
