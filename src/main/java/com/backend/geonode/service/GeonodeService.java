package com.backend.geonode.service;

import com.backend.geonode.model.Geonode;
import com.backend.geonode.repository.GeonodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GeonodeService {
    @Autowired
    private GeonodeRepo geonodeRepo;

    public Geonode save(Geonode geonode){
        return geonodeRepo.save(geonode);
    }
    public Optional<Geonode> getById(int id) {
        return geonodeRepo.findById(id);
    }
    public List<Geonode> getAll() {
        return geonodeRepo.findAll();
    }

    public Geonode update(Geonode geonode) {
        return geonodeRepo.save(geonode);
    }

    public void deleteById(int id) {
        geonodeRepo.deleteById(id);
    }
}
