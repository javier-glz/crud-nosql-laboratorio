package com.practica.crud_nosql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practica.crud_nosql.exception.RecursoNoEncontradoException;
import com.practica.crud_nosql.model.Producto;
import com.practica.crud_nosql.repository.ProductoRepository;

@Service
public class ProductoService {

    
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodos() {
        return productoRepository.findAll();
    }

    public Producto obtenerPorId(String id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException("Producto no encontrado con el ID: " + id));
    }

    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto actualizar(String id, Producto productoDetalles) {
        Producto productoExistente = obtenerPorId(id);
        productoExistente.setNombre(productoDetalles.getNombre());
        productoExistente.setPrecio(productoDetalles.getPrecio());
        productoExistente.setStock(productoDetalles.getStock());
        return productoRepository.save(productoExistente);
    }

    public void eliminar(String id) {
        Producto productoExistente = obtenerPorId(id);
        productoRepository.delete(productoExistente);
    }
}