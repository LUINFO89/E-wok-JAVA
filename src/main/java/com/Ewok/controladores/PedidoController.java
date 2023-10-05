package com.Ewok.controladores;

import com.Ewok.modelos.Pedido;
import com.Ewok.modelos.Plato;
import com.Ewok.repositorios.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    // Endpoint para crear un pedido (Método POST)
    @PostMapping("/agregar")
    public Pedido agregarPedido(@RequestBody Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // Endpoint para obtener todos los pedidos (Método GET)

}
