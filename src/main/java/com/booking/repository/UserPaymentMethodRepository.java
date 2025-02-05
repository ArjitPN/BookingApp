package com.booking.repository;

import com.booking.entities.UserPaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserPaymentMethodRepository extends JpaRepository<UserPaymentMethod, Long> {
}
