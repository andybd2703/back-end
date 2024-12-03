package com.example.BackendDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.BackendDemo.model.Usuario;
import com.example.BackendDemo.services.Usuarioservice;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private Usuarioservice usuarioService;

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "crear_usuario";
    }

    @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute Usuario usuario) {
        usuarioService.createUser(usuario);
        return "redirect:/usuarios";
    }

    @GetMapping
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioService.selectAllUsers());
        return "lista_usuarios";
    }

    // Endpoint adicional para usar con JavaScript directamente
    @PostMapping("/api/guardar")
    public Usuario guardarUsuarioAPI(@RequestBody Usuario usuario) {
        return usuarioService.createUser(usuario);
    }
}