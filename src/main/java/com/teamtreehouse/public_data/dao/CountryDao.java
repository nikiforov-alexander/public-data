package com.teamtreehouse.public_data.dao;

import com.teamtreehouse.public_data.model.Country;

import java.util.List;

public interface CountryDao {
    void editCountry(Country country);
    void addCountry(Country country);
    void deleteCountry(Country country);

    List<Country> fetchAllCountries();
    Country findCountryByCode(int code);
}
