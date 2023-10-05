package com.Ewok.repositorios;

import com.Ewok.modelos.Plato;
import com.Ewok.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatoRepository extends JpaRepository<Plato, Long>{
    // Spring Data JPA implementa automáticamente los métodos CRUD
}
