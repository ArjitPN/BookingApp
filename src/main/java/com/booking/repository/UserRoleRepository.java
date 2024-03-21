package com.booking.repository;

import com.booking.entities.UserRole;
import com.booking.util.UserRoleId;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRoleRepository extends JpaRepository<UserRole, UserRoleId> {
}
