package com.learning.CloudVendor.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {

    @Id
    @SequenceGenerator(name = "vendor_sequence", sequenceName = "vendor_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vendor_sequence")
    private Long vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;
}
