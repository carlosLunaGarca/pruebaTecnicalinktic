package com.example.prueba_tecnica_linktic.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "primas")
public class Primas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigo", referencedColumnName = "id")
    Amparos amparos;

    @Column(name = "edad_minima")
    Integer edadMinima;

    @Column(name = "edad_maxima")
    Integer edadMaxima;

    @Column(name ="porcentaje_prima")
    Double porcentajePrima;
}
