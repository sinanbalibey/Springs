package com.GraphQl.GraphQl.Repos;

import com.GraphQl.GraphQl.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
    List<Vehicle> getByTypeLike(String type);

}
