package com.hexaware.gtt.lms.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.gtt.lms.entities.Coupons;

public interface CouponRepository extends JpaRepository<Coupons, UUID>{

}
