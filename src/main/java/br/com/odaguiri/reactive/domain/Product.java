package br.com.odaguiri.reactive.domain;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Document(collection = "products")
public class Product {

    @Id
    private String id;
    private String code;
    private Map<Integer, Double> packages;
   
}