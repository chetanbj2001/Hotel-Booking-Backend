package com.dailycodework.demo.repository;

import com.dailycodework.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
   Optional<Role> findByName(String roleUser);

    boolean existsByName(Role role);
}
