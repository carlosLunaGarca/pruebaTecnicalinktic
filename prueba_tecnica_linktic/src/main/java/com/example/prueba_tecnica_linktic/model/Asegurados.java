package com.example.prueba_tecnica_linktic.model;

import com.example.prueba_tecnica_linktic.model.enumerate.TipoIdentificacion;
import com.example.prueba_tecnica_linktic.model.enumerate.sexo;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "asegurados")
public class Asegurados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_identificacion")
    TipoIdentificacion tipoIdentificacion;

    @Column(name="numero_identificacion")
    String numeroIdenticficacion;

    @Column(name = "apellidos")
    String apellidos;

    @Column(name = "nombres")
    String nombres;

    @Column(name = "sexo")
    @Enumerated(EnumType.STRING)
    sexo sexo;

    @Column(name = "fecha_nacimiento")
    LocalDate fechaNacimeinto;
}
