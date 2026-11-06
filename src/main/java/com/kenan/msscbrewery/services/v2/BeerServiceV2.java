package com.kenan.msscbrewery.services.v2;

import com.kenan.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);              // HttpHeaders → BeerDtoV2
    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);        // POST, kaydedilen DTO'yu (id'li) döner
    void updateBeer(UUID beerId, BeerDtoV2 beerDto); // PUT, body dönmez (204)
    void deleteById(UUID beerId);                    // DELETE
}