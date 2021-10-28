package com.esprit.assurance.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.assurance.entities.AssuranceOffers;


public interface AssuranceOffersRepository extends JpaRepository<AssuranceOffers, Long> {

}
