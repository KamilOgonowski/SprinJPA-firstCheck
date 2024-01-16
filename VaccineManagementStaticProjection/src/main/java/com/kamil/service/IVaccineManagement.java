package com.kamil.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.kamil.ResultView;
import com.kamil.bo.VaccineDetails;

public interface IVaccineManagement {

	public List<ResultView>fetchedByPriceLessThan(Integer price);

}
