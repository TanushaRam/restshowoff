package com.example.RestdemoShowoff3.Controller;
 import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestdemoShowoff3.Model.CloudVendor;

@RestController
@RequestMapping("/TANUSHA")
public class CloudVendorAPIService {
     CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
      {
        
           //return new CloudVendor("C1","Name-1","Address-1","xxxx1");
           return cloudVendor;
        
          }
          @PostMapping
          public String postCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
          this.cloudVendor=cloudVendor;
          return "Cloud Vendor Added Successfully";
}
         @PutMapping
          public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
          this.cloudVendor=cloudVendor;
          return "Cloud Vendor Upadated Successfully";
}
          @DeleteMapping("{vendorId}")
          public String deleteCloudVendorDetails(String vendorId)
          {
            this.cloudVendor=null;
            return "deleted vendor Successfully";
          }
}
