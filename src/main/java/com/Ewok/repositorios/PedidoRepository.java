package com.Ewok.repositorios;

import com.Ewok.modelos.Pedido;
import com.Ewok.modelos.Plato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    // Spring Data JPA implementa automáticamente los métodos CRUD
}