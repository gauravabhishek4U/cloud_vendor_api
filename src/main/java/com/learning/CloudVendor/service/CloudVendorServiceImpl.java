package com.learning.CloudVendor.service;

import com.learning.CloudVendor.exception.CloudVendorNotFoundException;
import com.learning.CloudVendor.model.CloudVendor;
import com.learning.CloudVendor.repository.CloudVendorRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{

    @Autowired
    private CloudVendorRepositoryImpl cloudVendorRepositoryImpl;

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepositoryImpl.save(cloudVendor);
        return "success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        return "success";
    }

    @Override
    public String deleteCloudVendor(Long vendorId) {
        cloudVendorRepositoryImpl.deleteById(vendorId);
        return "success";
    }

    @Override
    public CloudVendor getCloudVendor(Long vendorId) {

        if(cloudVendorRepositoryImpl.findById(vendorId).isEmpty()){
            throw new CloudVendorNotFoundException("Requested Cloud Vendor does not exist !!");
        }
        return cloudVendorRepositoryImpl.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepositoryImpl.findAll();
    }
}
