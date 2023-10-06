package com.Ewok.controladores;

import com.Ewok.modelos.Plato;
import com.Ewok.repositorios.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/platos")
public class PlatoController {
    @Autowired
    private PlatoRepository platoRepository;

    @GetMapping("/")
    public List<Plato> obtenerTodosLosPlatos() {
        return platoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Plato obtenerPlatoPorId(@PathVariable Long id) {
        return platoRepository.findById(id).orElse(null);
    }

    @PostMapping("/")
    public Plato crearPlato(@RequestBody Plato plato) {
        return platoRepository.save(plato);
    }

    @PutMapping("/{id}")
    public Plato actualizarPlato(@PathVariable Long id, @RequestBody Plato plato) {
        plato.setId(id);
        return platoRepository.save(plato);
    }

    @DeleteMapping("/{id}")
    public void eliminarPlato(@PathVariable Long id) {
        platoRepository.deleteById(id);
    }
}
