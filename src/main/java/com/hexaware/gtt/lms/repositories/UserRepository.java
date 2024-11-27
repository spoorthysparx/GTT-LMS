package com.hexaware.gtt.lms.repositories;

import java.util.UUID;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.hexaware.gtt.lms.entities.Users;
 
public interface UserRepository extends JpaRepository<Users, UUID> {
    UUID getTierId(UUID userId);
}
