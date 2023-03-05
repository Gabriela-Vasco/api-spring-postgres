package com.springbd.SpringRestApiPostgre.controller;

import com.springbd.SpringRestApiPostgre.model.Product;
import com.springbd.SpringRestApiPostgre.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        //verificação se comunicação está ok e busca por todos os produtos
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
   }

   @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> findById(@PathVariable Long id) {
        //verificação se comunicação está ok e busca por produto pelo id
        return ResponseEntity.status(HttpStatus.OK).body(productService.findById(id));
   }

   @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        //verificação da criação do produto e invocando o método save, resp. por salvar o obj.
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
   }

   @PutMapping
    public ResponseEntity<Product> update(@RequestBody Product product) {
        //verificação se comunicação está ok e invocando o método update, resp. por alterar o obj.
        return ResponseEntity.status(HttpStatus.OK).body(productService.update(product));
   }

   @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        //deletando o obj. pelo id e verificação se comunicação está ok
        productService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
   }
}
