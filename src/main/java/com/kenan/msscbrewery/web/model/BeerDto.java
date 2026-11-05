package com.kenan.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data                 // getter, setter, equals/hashCode, toString
@NoArgsConstructor    // new BeerDto(): Jackson JSON'dan nesne kurarken kullanır
@AllArgsConstructor   // new BeerDto(id, beerName, beerStyle, upc)
@Builder              // BeerDto.builder()...build(): arka planda @AllArgsConstructor'ı çağırır
public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}