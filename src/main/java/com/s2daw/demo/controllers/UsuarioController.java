package com.s2daw.demo.controllers;

import com.s2daw.demo.dao.UsuarioDao;
import com.s2daw.demo.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController implements UsuarioDao {

    @Autowired
    private UsuarioDao usuarioDao;

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
    return usuarioDao.getUsuarios();
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
