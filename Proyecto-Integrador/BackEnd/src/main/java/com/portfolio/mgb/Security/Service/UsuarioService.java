/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Security.Service;

import com.portfolio.mgb.Security.Entity.Usuario;
import com.portfolio.mgb.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author titip
 */
@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iusuarioRepository;
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
      public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }
      public void save(Usuario usuario){
          iusuarioRepository.save(usuario);
      }
}
