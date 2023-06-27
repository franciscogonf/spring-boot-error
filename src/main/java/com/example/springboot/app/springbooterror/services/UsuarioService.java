package com.example.springboot.app.springbooterror.services;

import java.util.List;

import com.example.springboot.app.springbooterror.models.domain.Usuario;

public interface UsuarioService {
  
    public List<Usuario> listar();
    public Usuario obtenerPorId(Integer id);
}
