package com.learning.CloudVendor.repository;

import com.learning.CloudVendor.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, Long> {
    List<CloudVendor> findByVendorName(String vendorName);
}
