package com.hexaware.gtt.lms.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.gtt.lms.entities.Transactions;

public interface TransactionRepository  extends JpaRepository<Transactions, UUID> {

}
