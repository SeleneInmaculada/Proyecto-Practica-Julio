package com.s2daw.demo.controllers;

import com.s2daw.demo.dao.UsuarioDao;
import com.s2daw.demo.models.Usuario;
import com.s2daw.demo.utils.JWTUtil;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value="api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Hina");
        usuario.setApellido("Aoi");
        usuario.setEmail("soyunaprueba@gmail.com");
        usuario.setTelefono("666666666");
        return usuario;
    }
    @RequestMapping(value="api/usuarios")
    public List<Usuario> getUsuarios(@RequestHeader(value = "Authorization") String token){
        String usuarioID = jwtUtil.getKey(token);
        if(usuarioID==null){
            return new ArrayList<>();
        }
        return usuarioDao.getUsuarios();
    }
    @RequestMapping(value="api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario){

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1,usuario.getPassword());
        usuario.setPassword(hash);
        usuarioDao.registrar(usuario);
    }


    @RequestMapping(value="api/usuario6788")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Hina");
        usuario.setApellido("Aoi");
        usuario.setEmail("soyunaprueba@gmail.com");
        usuario.setTelefono("666666666");
        return usuario;
    }

    @RequestMapping(value="api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id) {
        usuarioDao.eliminar(id);
    }


    @RequestMapping(value="api/usuario344455")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Hina");
        usuario.setApellido("Aoi");
        usuario.setEmail("soyunaprueba@gmail.com");
        usuario.setTelefono("666666666");
        return usuario;
    }
}
