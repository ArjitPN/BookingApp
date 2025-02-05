package com.booking.repository;

import com.booking.entities.BusOperator;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface BusOperatorRepository extends JpaRepository<BusOperator, Long> {
}
