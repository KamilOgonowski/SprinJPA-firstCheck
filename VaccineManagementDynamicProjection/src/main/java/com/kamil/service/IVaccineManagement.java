package com.kamil.service;

import java.util.List;

import com.kamil.view.View;

public interface IVaccineManagement {

	public <T extends View>List<T>fetchByCompanyName(String companyName, Class<T> cls);

}
