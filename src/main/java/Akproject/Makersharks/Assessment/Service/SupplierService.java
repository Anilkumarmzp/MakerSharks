package Akproject.Makersharks.Assessment.Service;

import Akproject.Makersharks.Assessment.Repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;
    public List<Supplier> searchByLocation(String location){
        return supplierRepository.findByLocation(location);
    }
    public  List<Supplier> searchByNatureOfBusiness(String natureOfBusiness){
        return supplierRepository.findByNatureOfBusiness(natureOfBusiness);
    }
    public List<Supplier> searchByManufacturingProcesses(String manufacturingProcesses){
        return supplierRepository.findByManufacturingProcesses(manufacturingProcesses);
    }
}
