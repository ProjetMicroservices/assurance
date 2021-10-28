package com.esprit.assurance.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.assurance.entities.Assurance;



public interface AssuranceRepository extends JpaRepository<Assurance, Long> {

}
