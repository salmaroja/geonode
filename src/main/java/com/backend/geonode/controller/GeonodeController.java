package com.backend.geonode.controller;

import com.backend.geonode.model.Geonode;
import com.backend.geonode.service.GeonodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/geonode")
public class GeonodeController {

    @Autowired
    private GeonodeService geonodeService;

    @PostMapping
    public Geonode save(@RequestBody Geonode geonode){
        return geonodeService.save(geonode);
    }

    @GetMapping("/{id}")
    public Optional<Geonode> getById(@PathVariable int id) {
        return geonodeService.getById(id);
    }
    @GetMapping
    public List<Geonode> getAll() {
        return geonodeService.getAll();
    }

    @PutMapping("/{id}")
    public Geonode update(@RequestBody Geonode geonode) {
        return geonodeService.update(geonode);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        geonodeService.deleteById(id);
    }

}
