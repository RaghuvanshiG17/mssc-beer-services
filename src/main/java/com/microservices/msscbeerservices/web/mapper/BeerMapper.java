package com.microservices.msscbeerservices.web.mapper;

import com.microservices.msscbeerservices.domain.Beer;
import com.microservices.msscbeerservices.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
