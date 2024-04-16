package com.tienda.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name="usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;    
    @NotEmpty
    private String username;    
    @NotEmpty
    private String password;
        private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;    
    private String rutaImagen;
    private boolean activo;
    
    @OneToMany
    @JoinColumn(name="id_usuario")
    private List<Rol> roles;
}
