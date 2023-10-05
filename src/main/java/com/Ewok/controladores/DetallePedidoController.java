package com.Ewok.controladores;

import com.Ewok.modelos.DetallePedido;
import com.Ewok.repositorios.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/detallepedido")
public class DetallePedidoController {

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    // Endpoint para crear un DetallePedido (Método POST)
    @PostMapping("/agregar")
    public DetallePedido agregarDetallePedido(@RequestBody DetallePedido detallePedido){ return detallePedidoRepository.save(detallePedido);}

    // Endpoint para obtener todos los pedidos (Método GET)

}
