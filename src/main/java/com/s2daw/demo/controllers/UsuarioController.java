package com.s2daw.demo.controllers;

import com.s2daw.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Hina");
        usuario.setApellido("Aoi");
        usuario.setEmail("soyunaprueba@gmail.com");
        usuario.setTelefono("666666666");
        return usuario;
    }

    @RequestMapping(value="usuarios")
    public List<Usuario> getUsuarios(){
        List <Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1234L);
        usuario.setNombre("Hina");
        usuario.setApellido("Aoi");
        usuario.setEmail("soyunaprueba@gmail.com");
        usuario.setTelefono("666666666");

        Usuario usuario2 = new Usuario();
        usuario2.setId(5678L);
        usuario2.setNombre("Yuta");
        usuario2.setApellido("Aoi");
        usuario2.setEmail("soyunaprueba2222@gmail.com");
        usuario2.setTelefono("222222222");

        Usuario usuario3 = new Usuario();
        usuario3.setId(9012L);
        usuario3.setNombre("Rei");
        usuario3.setApellido("Sakuma");
        usuario3.setEmail("soyunaprueba9999@gmail.com");
        usuario3.setTelefono("999999999");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }
    @RequestMapping(value="usuario6788")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Hina");
        usuario.setApellido("Aoi");
        usuario.setEmail("soyunaprueba@gmail.com");
        usuario.setTelefono("666666666");
        return usuario;
    }

    @RequestMapping(value="usuario78900")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Hina");
        usuario.setApellido("Aoi");
        usuario.setEmail("soyunaprueba@gmail.com");
        usuario.setTelefono("666666666");
        return usuario;
    }

    @RequestMapping(value="usuario344455")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Hina");
        usuario.setApellido("Aoi");
        usuario.setEmail("soyunaprueba@gmail.com");
        usuario.setTelefono("666666666");
        return usuario;
    }
}
