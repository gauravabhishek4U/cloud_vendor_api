package com.learning.CloudVendor.controller;

import com.learning.CloudVendor.model.CloudVendor;
import com.learning.CloudVendor.response.ResponseHandler;
import com.learning.CloudVendor.service.CloudVendorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorController {

    @Autowired
    private CloudVendorServiceImpl cloudVendorServiceImpl;

    // Get specific cloud vendor details
    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") Long vendorId){
        CloudVendor cloudVendor = cloudVendorServiceImpl.getCloudVendor(vendorId);
        return ResponseHandler.responseBuilder("Requested Cloud Vendor Details are : ", HttpStatus.FOUND, cloudVendor);
    }

    // Get All cloud vendor details
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){
        List<CloudVendor> allCloudVendors = cloudVendorServiceImpl.getAllCloudVendors();
        return allCloudVendors;
    }

    // create cloud vendor details
    @PostMapping()
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorServiceImpl.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully!!!";
    }

    // update cloud vendor details
    @PutMapping()
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorServiceImpl.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully!!!";
    }

    // delete cloud vendor details by vendorId
    @DeleteMapping("{vendorId}")
    public String updateCloudVendorDetails(@PathVariable("vendorId") Long vendorId){
        cloudVendorServiceImpl.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully!!!";
    }
}
