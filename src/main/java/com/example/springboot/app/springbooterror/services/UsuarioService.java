package com.example.springboot.app.springbooterror.services;

import java.util.List;
import java.util.Optional;

import com.example.springboot.app.springbooterror.models.domain.Usuario;

public interface UsuarioService {

  public List<Usuario> listar();

  public Usuario obtenerPorId(Integer id);

  public Optional<Usuario> obtenerPorIdOptional(Integer id);

}
