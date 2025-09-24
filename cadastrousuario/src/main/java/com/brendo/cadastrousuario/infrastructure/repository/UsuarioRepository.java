package com.brendo.cadastrousuario.infrastructure.repository;

import com.brendo.cadastrousuario.infrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);  // Corrigido

    @Transactional
    void deleteByEmail(String email);

}
