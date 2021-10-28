package com.esprit.assurance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.assurance.entities.Assurance;
import com.esprit.assurance.repo.AssuranceRepository;



@Service
public class AssuranceServiceImpl implements IAssuranceService {

	@Autowired
	AssuranceRepository assuranceRepository;
	
	@Override
	public List<Assurance> getAllAssurances() {
		return assuranceRepository.findAll();
		
	}

	@Override
	public Long addAssurance(Assurance assurance) {
		assuranceRepository.save(assurance);
		return assurance.getId();
	}

	@Override
	public void deleteAssuranceByID(Long assuranceID) {
		Assurance assurance = assuranceRepository.findById(assuranceID).get();
		assuranceRepository.delete(assurance);
		
	}

	@Override
	public Assurance updateAssurance(Assurance assurance) {
		
		return assuranceRepository.save(assurance);
	}

	@Override
	public List<String> getAllAssuranceByNames() {
		return null;
	}


}
