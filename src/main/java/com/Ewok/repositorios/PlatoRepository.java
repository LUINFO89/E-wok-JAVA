package com.Ewok.repositorios;
import com.Ewok.modelos.Plato;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlatoRepository extends JpaRepository<Plato, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}
