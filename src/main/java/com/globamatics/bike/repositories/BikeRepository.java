package com.globamatics.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globamatics.bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
