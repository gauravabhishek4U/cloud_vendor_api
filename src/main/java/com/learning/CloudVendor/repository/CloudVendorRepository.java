package com.learning.CloudVendor.repository;

import com.learning.CloudVendor.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, Long> {
}
