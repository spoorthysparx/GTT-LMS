package com.hexaware.gtt.lms.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.gtt.lms.entities.Partner;
import com.hexaware.gtt.lms.entities.Program;
@Repository
public interface ProgramRepository  extends JpaRepository<Program, UUID>{

	List<Program> findAllProgramByPartner(Partner partner);
}
