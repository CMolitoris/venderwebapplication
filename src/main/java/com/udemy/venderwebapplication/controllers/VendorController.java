package com.udemy.venderwebapplication.controllers;

import com.udemy.venderwebapplication.entities.Vendor;
import com.udemy.venderwebapplication.services.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class VendorController {

    @Autowired
    VendorService vendorService;

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createVendor";
    }

    @RequestMapping("/saveVend")
    public String saveVendor(@ModelAttribute("Vendor")Vendor vendor, ModelMap modelMap) {
        Vendor saveVendor = vendorService.saveVendor(vendor);
        String message = "The vendor " + saveVendor.getName() + " has been saved to the database.";
        modelMap.addAttribute("message",message);
        return "createVendor";
    }

    @RequestMapping("/displayVendors")
    public String displayVenders(ModelMap modelMap) {
        List<Vendor> allVendors = vendorService.getAllVendors();
        modelMap.addAttribute("vendors",allVendors);
        return "displayVendors";
    }

    @RequestMapping("/deleteVendor")
    public String deleteVendor(@RequestParam("id")int id,ModelMap modelMap) {
        Vendor vendorById = vendorService.getVendorById(id);
        vendorService.deleteVendor(vendorById);
        List<Vendor> allVendors = vendorService.getAllVendors();
        modelMap.addAttribute("vendors",allVendors);
        return "displayVendors";
    }

    @RequestMapping("/showUpdate")
    public String showUpdate(@RequestParam("id")int id,ModelMap modelMap) {
        Vendor vendor = vendorService.getVendorById(id);
        modelMap.addAttribute("vendor",vendor);
        return "updateVendor";
    }

    @RequestMapping("/updateVend")
    public String updateVendor(@ModelAttribute("vendor") Vendor vendor,ModelMap modelMap) {
        vendorService.saveVendor(vendor);
        List<Vendor> allVendors = vendorService.getAllVendors();
        modelMap.addAttribute("vendors", allVendors);
        return "displayVendors";
    }


}
