package com.Ewok.controladores;

import com.Ewok.modelos.DetallePedido;
import com.Ewok.repositorios.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalles-pedidos")
public class DetallePedidoController {
    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    @GetMapping("/todos")
    public List<DetallePedido> obtenerTodosLosDetallesPedidos() {
        return detallePedidoRepository.findAll();
    }

    @GetMapping("/{id}")
    public DetallePedido obtenerDetallePedidoPorId(@PathVariable Long id) {
        return detallePedidoRepository.findById(id).orElse(null);
    }

    @PostMapping("/")
    public DetallePedido crearDetallePedido(@RequestBody DetallePedido detallePedido) {
        return detallePedidoRepository.save(detallePedido);
    }

    @PutMapping("/{id}")
    public DetallePedido actualizarDetallePedido(@PathVariable Long id, @RequestBody DetallePedido detallePedido) {
        detallePedido.setId(id);
        return detallePedidoRepository.save(detallePedido);
    }

    @DeleteMapping("/{id}")
    public void eliminarDetallePedido(@PathVariable Long id) {
        detallePedidoRepository.deleteById(id);
    }
}
