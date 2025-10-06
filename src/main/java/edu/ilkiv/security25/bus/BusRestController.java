package edu.ilkiv.security25.bus;

/*
@author   Bodya
@project   security25
@class  BusRestController
@version  1.0.0
@since 30.09.2025 - 19.29
*/

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/buses")
@AllArgsConstructor
public class BusRestController {

    private final BusService service;

    @GetMapping
    public List<Bus> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Bus getOneBus(@PathVariable String id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.deleteById(id);
    }

    @PostMapping
    public Bus create(@RequestBody Bus bus) {
        return service.create(bus);
    }

    @PutMapping
    public Bus update(@RequestBody Bus bus) {
        return service.update(bus);
    }

    @GetMapping("/hello/user")
    public String helloUser() {
        return "Hello User!";
    }

    @GetMapping("hello/admin")
    public String helloAdmin() {
        return "Hello Admin!";
    }

    @GetMapping("hello/unknown")
    public String helloUnknown() {
        return "Hello Unknown!";
    }
}
