package com.s2daw.demo.controllers;

import com.s2daw.demo.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value="usuario")
    public Usuario getUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Hina");
        usuario.setApellido("Aoi");
        usuario.setEmail("soyunaprueba@gmail.com");
        usuario.setTelefono("666666666");
        return usuario;
    }
}
