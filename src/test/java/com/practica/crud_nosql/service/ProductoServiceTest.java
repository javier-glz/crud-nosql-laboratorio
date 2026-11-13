package com.practica.crud_nosql.service;

import com.practica.crud_nosql.model.Producto;
import com.practica.crud_nosql.repository.ProductoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProductoServiceTest {

    @Mock
    private ProductoRepository productoRepository;

    @InjectMocks
    private ProductoService productoService;

    @Test
    public void testObtenerTodos() {
        Producto p1 = new Producto("Laptop", 15000.0, 5);
        Producto p2 = new Producto("Mouse", 500.0, 20);
        when(productoRepository.findAll()).thenReturn(Arrays.asList(p1, p2));

        List<Producto> resultados = productoService.obtenerTodos();

        assertNotNull(resultados);
        assertEquals(2, resultados.size());
        verify(productoRepository, times(1)).findAll();
    }
}