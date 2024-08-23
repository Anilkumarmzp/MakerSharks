package Akproject.Makersharks.Assessment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.function.Supplier;
@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Long> {
    List<Supplier> findByLocation(String location);
    List<Supplier> findByNatureOfBusiness(String natureOfBusiness);
    List<Supplier> findByManufacturingProcesses(String manufacturingProcesses);

}
