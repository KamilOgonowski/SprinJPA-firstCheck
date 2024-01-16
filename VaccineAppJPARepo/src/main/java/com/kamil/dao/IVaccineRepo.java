package com.kamil.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.kamil.bo.VaccineDetails;
@Repository // optional annotation
public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long>{}


