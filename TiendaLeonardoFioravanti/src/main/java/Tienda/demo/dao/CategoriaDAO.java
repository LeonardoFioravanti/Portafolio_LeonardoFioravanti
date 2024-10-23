package Tienda.demo.dao;


import Tienda.demo.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDAO extends JpaRepository <Categoria,Long> {
    
}