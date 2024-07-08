package com.example.CivlManagement.repository;

import com.example.CivlManagement.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
