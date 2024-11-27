package com.hexaware.gtt.lms.repositories;
import java.util.UUID;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.hexaware.gtt.lms.entities.Tiers;
 
public interface TierRepository extends JpaRepository<Tiers, UUID>{
    float getCouponProbablity(UUID TierId);
    }
