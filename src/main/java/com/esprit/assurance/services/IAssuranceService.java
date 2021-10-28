package com.esprit.assurance.services;

import java.util.List;

import com.esprit.assurance.entities.Assurance;



public interface IAssuranceService {

	List<Assurance> getAllAssurances();
	public Long addAssurance(Assurance assurance);
	public void deleteAssuranceByID(Long assuranceID );
	public Assurance updateAssurance(Assurance assurance);
	List<String> getAllAssuranceByNames();
}