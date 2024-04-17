package com.example.prueba_tecnica_linktic.DTOS.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class aseguradoRequestDTO {
    @JsonProperty("tipo_identificacion")
    TiposIdentificacionDTO tiposIdentificacion;
    @JsonProperty("nro_identificacion")
    String numeroIdentificacion;
    @JsonProperty("valor_asegurado")
    Integer valorAsegurado;
}
