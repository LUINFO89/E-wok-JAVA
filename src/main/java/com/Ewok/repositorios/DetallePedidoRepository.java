package com.Ewok.repositorios;
import com.Ewok.modelos.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}
