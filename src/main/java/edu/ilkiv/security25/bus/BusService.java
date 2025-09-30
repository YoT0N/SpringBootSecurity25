package edu.ilkiv.security25.bus;

/*
@author   Bodya
@project   security25
@class  BusService
@version  1.0.0
@since 30.09.2025 - 19.26
*/

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BusService {

    private final BusRepository repository;

    private List<Bus> buses;
    @PostConstruct
    void init() {
        buses.add(new Bus("1", "145321","CE 2354 MO"));
        buses.add(new Bus("2", "145765","CE 3354 MO"));
        buses.add(new Bus("3", "198721","CE 4354 MO"));
        repository.saveAll(buses);
    }

    public List<Bus> getAll() {
        return repository.findAll();
    }

    public Bus getById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public Bus create(Bus bus) {
        return repository.save(bus);
    }

    public Bus update(Bus bus) {
        return repository.save(bus);
    }
}