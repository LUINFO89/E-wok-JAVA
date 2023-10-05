package com.Ewok.controladores;


import com.Ewok.modelos.Plato;
import com.Ewok.repositorios.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/platos")
public class PlatoController {

    @Autowired
    private PlatoRepository platoRepository;

    // Endpoint para crear un plato (Método POST)
    @PostMapping("/agregar")
    public Plato agregarPlato(@RequestBody Plato plato) {
        return platoRepository.save(plato);
    }

    // Endpoint para obtener todos los platos (Método GET)
    @GetMapping("/todos")
    public List<Plato> obtenerTodosLosPlatos() {
        return platoRepository.findAll();
    }

    // Endpoint para obtener un plato por ID (Método GET)
    @GetMapping("/{id}")
    public Plato obtenerPlatoPorId(@PathVariable Long id) {
        return platoRepository.findById(id).orElse(null);
    }

    // Endpoint para actualizar un plato por ID (Método PUT)
    @PutMapping("/{id}")
    public Plato actualizarPlato(@PathVariable Long id, @RequestBody Plato platoActualizado) {
        Plato platoExistente = platoRepository.findById(id).orElse(null);
        if (platoExistente != null) {
            platoExistente.setNombre(platoActualizado.getNombre());
            platoExistente.setDescripción(platoActualizado.getDescripción());
            platoExistente.setPrecio(platoActualizado.getPrecio());
            return platoRepository.save(platoExistente);
        } else {
            return null; // Manejar el caso en que el plato no existe
        }
    }

    // Endpoint para eliminar un plato por ID (Método DELETE)
    @DeleteMapping("/{id}")
    public void eliminarPlato(@PathVariable Long id) {
        platoRepository.deleteById(id);
    }
}
