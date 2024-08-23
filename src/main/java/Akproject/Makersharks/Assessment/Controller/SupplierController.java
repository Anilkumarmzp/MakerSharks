package Akproject.Makersharks.Assessment.Controller;

import Akproject.Makersharks.Assessment.Service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Supplier;

@RestController
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    @GetMapping("/suppliers/byLocation")
    public List<Supplier> getSuppliersByLocation(@RequestParam String location){
        return supplierService.searchByLocation(location);
    }
    @GetMapping("/suppliers/byNatureOfBusiness")
    public List<Supplier> getSuppliersByNatureOfBusiness(@RequestParam String natureOfBusiness) {
        return supplierService.searchByNatureOfBusiness(natureOfBusiness);
    }
    @GetMapping("/suppliers/byManufacturingProcesses")
    public List<Supplier> getSuppliersByManufacturingProcesses(@RequestParam String manufacturingProcesses) {
        return supplierService.searchByManufacturingProcesses(manufacturingProcesses);
    }
}
