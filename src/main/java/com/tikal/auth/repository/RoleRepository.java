package com.tikal.auth.repository;

import com.tikal.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sopher on 23/03/2017.
 */
public interface RoleRepository extends JpaRepository<Role, Long>{
}