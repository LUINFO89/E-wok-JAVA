package com.Ewok.repositorios;
import com.Ewok.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    // Spring Data JPA implementa automáticamente los métodos CRUD
}

