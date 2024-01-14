package com.kamil.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kamil.bo.VaccineDetails;
@Repository // optional annotation
public interface IVaccineRepo extends CrudRepository<VaccineDetails, Serializable> { 
	//generics have been adjusted for CrudRepository


}