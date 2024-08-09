package com.GraphQl.GraphQl.api;


import com.GraphQl.GraphQl.Entity.Vehicle;
import com.GraphQl.GraphQl.Repos.VehicleRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQueryResolver implements GraphQLQueryResolver {

    private final VehicleRepository vehicleRepository;

    public VehicleQueryResolver(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getVehicles(String type){

        return vehicleRepository.getByTypeLike(type);
    }

    public Optional<Vehicle> getById(Long id){

        return vehicleRepository.findById(id);
    }

}
