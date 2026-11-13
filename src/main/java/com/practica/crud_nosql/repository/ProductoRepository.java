package com.practica.crud_nosql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practica.crud_nosql.model.Producto;


public interface ProductoRepository extends MongoRepository<Producto, String> {
    // Spring Data MongoDB nos provee automáticamente de métodos como save(), findAll(), findById(), deleteById()
}