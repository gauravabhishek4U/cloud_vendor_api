package com.learning.CloudVendor.service;

import com.learning.CloudVendor.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(Long vendorId);
    public CloudVendor getCloudVendor(Long vendorId);
    public List<CloudVendor> getAllCloudVendors();

}
