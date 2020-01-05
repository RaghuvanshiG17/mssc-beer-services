package com.microservices.msscbeerservices.services;

import com.microservices.msscbeerservices.web.model.BeerDto;

import java.util.UUID;

public interface BeerServices {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
