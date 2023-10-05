package com.Ewok.controladores;

import com.Ewok.modelos.Usuario;
import com.Ewok.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    private Object MediaType;

    @PostMapping(value = "/agregar")
    public Usuario agregarUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Endpoint para obtener todos los usuarios (Método GET)
    @GetMapping("/todos")
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    // Endpoint para obtener un usuario por ID (Método GET)
    @GetMapping("/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    // Endpoint para actualizar un usuario por ID (Método PUT)
    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioActualizado) {
        // Verificar si el usuario existe
        Usuario usuarioExistente = usuarioRepository.findById(id).orElse(null);
        if (usuarioExistente != null) {
            // Actualizar los datos del usuario
            usuarioExistente.setNombre(usuarioActualizado.getNombre());
            usuarioExistente.setDirección(usuarioActualizado.getDirección());
            usuarioExistente.setTeléfono(usuarioActualizado.getTeléfono());
            return usuarioRepository.save(usuarioExistente);
        } else {
            return null; // Manejar el caso en que el usuario no existe
        }
    }

    // Endpoint para eliminar un usuario por ID (Método DELETE)
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }
}