



package com.Ewok.repositorios;
import com.Ewok.modelos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}
