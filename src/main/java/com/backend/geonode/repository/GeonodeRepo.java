package com.backend.geonode.repository;

import com.backend.geonode.model.Geonode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeonodeRepo extends JpaRepository<Geonode,Integer> {
}
