package edu.drexel.examples.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.drexel.examples.model.Bacteria;

@Repository
public interface BacteriaRepo extends JpaRepository<Bacteria, Integer>{
	
}
