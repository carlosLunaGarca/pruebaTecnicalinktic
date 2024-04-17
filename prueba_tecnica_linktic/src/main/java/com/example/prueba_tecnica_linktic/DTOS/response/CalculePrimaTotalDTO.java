package com.example.prueba_tecnica_linktic.DTOS.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "tipo_identificacion",
        "nro_identificacion",
        "valor_asegurado",
        "liquidaci\u00f3n",
        "Valor_total"
})
@Generated("jsonschema2pojo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CalculePrimaTotalDTO {

    @JsonProperty("tipo_identificacion")
     String tipoIdentificacion;
    @JsonProperty("nro_identificacion")
     String nroIdentificacion;
    @JsonProperty("valor_asegurado")
     Integer valorAsegurado;
    @JsonProperty("liquidaci\u00f3n")
     List<LiquidaciN> liquidaciN;
    @JsonProperty("Valor_total")
     Double valorTotal;

}