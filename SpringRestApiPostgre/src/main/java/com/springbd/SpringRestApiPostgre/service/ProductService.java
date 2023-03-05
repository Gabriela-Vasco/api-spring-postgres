package com.springbd.SpringRestApiPostgre.service;

import com.springbd.SpringRestApiPostgre.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product save(Product product); //método para salvar os produtos CREATE

    List<Product> findAll(); //método para buscar todos os produtos READ

    Optional<Product> findById(Long id); //método para buscar um único produto READ

    Product update(Product product); //método para alterar um produto UPDATE

    void deleteById(Long id); //método para deletar um produto DELETE
}
