package com.microservices.msscbeerservices.web.controller;

import com.microservices.msscbeerservices.services.BeerServices;
import com.microservices.msscbeerservices.web.model.BeerDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@AllArgsConstructor
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerServices beerServices;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable  UUID beerId){
        return new ResponseEntity<>(beerServices.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@Validated @RequestBody BeerDto beerDto){
        return new ResponseEntity<>(beerServices.saveNewBeer(beerDto), HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable UUID beerId,@Validated @RequestBody BeerDto beerDto){
        return new ResponseEntity<>(beerServices.updateBeer(beerId,beerDto), HttpStatus.NO_CONTENT);
    }

}
