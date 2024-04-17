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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "c\u00f3digo_amparo",
        "nombre_amparo",
        "valor_prima"
})
@Generated("jsonschema2pojo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LiquidaciN {

    @JsonProperty("c\u00f3digo_amparo")
     Integer cDigoAmparo;
    @JsonProperty("nombre_amparo")
     String nombreAmparo;
    @JsonProperty("valor_prima")
     Double valorPrima;

}