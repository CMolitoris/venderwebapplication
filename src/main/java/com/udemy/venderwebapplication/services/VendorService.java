package com.udemy.venderwebapplication.services;

import com.udemy.venderwebapplication.entities.Vendor;

import java.util.List;

public interface VendorService {
    public Vendor saveVendor(Vendor vendor);
    public Vendor updateVendor(Vendor vendor);
    public void deleteVendor(Vendor vendor);
    public Vendor getVendorById(int id);
    public List<Vendor> getAllVendors();
}
