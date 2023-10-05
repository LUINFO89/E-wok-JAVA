package com.Ewok.repositorios;

import com.Ewok.modelos.DetallePedido;
import com.Ewok.modelos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Long> {
    // Spring Data JPA implementa automáticamente los métodos CRUD
}