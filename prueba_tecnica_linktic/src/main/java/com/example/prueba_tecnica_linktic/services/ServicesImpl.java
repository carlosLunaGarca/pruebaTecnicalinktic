package com.example.prueba_tecnica_linktic.services;

import com.example.prueba_tecnica_linktic.DTOS.request.AseguradoRequestDTO;
import com.example.prueba_tecnica_linktic.DTOS.request.PrimaDTO;
import com.example.prueba_tecnica_linktic.DTOS.response.CalculePrimaTotalDTO;
import com.example.prueba_tecnica_linktic.DTOS.response.LiquidaciN;
import com.example.prueba_tecnica_linktic.model.Asegurados;
import com.example.prueba_tecnica_linktic.model.Primas;
import com.example.prueba_tecnica_linktic.model.enumerate.TipoIdentificacion;
import com.example.prueba_tecnica_linktic.repository.AmparosRepository;
import com.example.prueba_tecnica_linktic.repository.AseguradosRepository;
import com.example.prueba_tecnica_linktic.repository.PrimasRepository;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
@Service
public class ServicesImpl implements  IServices{
    @Autowired
    AmparosRepository amparosRepository;
    @Autowired
    AseguradosRepository aseguradosRepository;
    @Autowired
    PrimasRepository primasRepository;
    @Override
    public List<CalculePrimaTotalDTO> calcularPrimaTotal(PrimaDTO primaDTO) {
        List<CalculePrimaTotalDTO> listaResponse= new ArrayList<>();
        for (AseguradoRequestDTO aseguradoRequestDTO:primaDTO.getList()) {
            CalculePrimaTotalDTO aux= new CalculePrimaTotalDTO();
            List<Asegurados> asegurados= aseguradosRepository.findByNumeroIdenticficacionAndTipoIdentificacion(aseguradoRequestDTO.getNumeroIdentificacion(), TipoIdentificacion.valueOf(aseguradoRequestDTO.getTiposIdentificacion().toString()));
            aux.setNroIdentificacion(asegurados.get(0).getNumeroIdenticficacion());
            aux.setTipoIdentificacion(asegurados.get(0).getTipoIdentificacion().toString());
            Integer años= (int)Math.abs(ChronoUnit.YEARS.between(asegurados.get(0).getFechaNacimeinto(), LocalDate.now()));
            System.err.println(años);
            List<Primas> primas=primasRepository.findByEdadMinimaLessThanEqualAndEdadMaximaGreaterThanEqual(años,años);
            List<LiquidaciN> liquidaciones= new ArrayList<>();
            Double total=0.0;
            for (Primas prima: primas) {
                LiquidaciN aux1= new LiquidaciN();
                aux1.setValorPrima(prima.getPorcentajePrima()*aseguradoRequestDTO.getValorAsegurado());
                aux1.setCDigoAmparo(prima.getAmparos().getCodigo());
                aux1.setNombreAmparo(prima.getAmparos().getNombre());
                total+=aux1.getValorPrima();
                liquidaciones.add(aux1);
            }
            aux.setLiquidaciN(liquidaciones);
            aux.setValorTotal(total);
            aux.setValorAsegurado(aseguradoRequestDTO.getValorAsegurado());
            listaResponse.add(aux);
        }

        return listaResponse;
    }
}
