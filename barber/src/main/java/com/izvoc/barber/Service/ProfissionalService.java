package com.izvoc.barber.Service;

import com.izvoc.barber.DTO.ProfissionalDTO;
import com.izvoc.barber.Entities.Profissional;
import com.izvoc.barber.Repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfissionalService {
    @Autowired
    private ProfissionalRepository PRepository;





    public ProfissionalDTO newInsert(ProfissionalDTO profissaDTO){

        Profissional profissa = new Profissional();

                profissa.setName(profissaDTO.getName());
                profissa.setEmail(profissaDTO.getEmail());
                profissa.setCPF(profissaDTO.getCPF());




        PRepository.save(profissa);
        return new ProfissionalDTO(profissa.getId(),
                profissa.getName(), profissa.getEmail(), profissa.getCPF());

    }


    public List<ProfissionalDTO> getAll(){

                        List <Profissional> profissa = PRepository.findAll();
                        List <ProfissionalDTO> proDTO = new ArrayList<>();

                for(Profissional profissi : profissa){

                    ProfissionalDTO PDTO = new ProfissionalDTO(


                            profissi.getId(),
                            profissi.getName(),
                            profissi.getEmail(),
                            profissi.getCPF()

                    );  proDTO.add(PDTO);



                }
        return proDTO;

    }





    public ProfissionalDTO getId(Long id){

        Profissional profissa = PRepository.findById(id).orElseThrow(()-> new RuntimeException("Profissional " +
                "Inexistente"));

        ProfissionalDTO PDTO = new ProfissionalDTO(

                profissa.getId(),
                profissa.getName(),
                profissa.getEmail(),
                profissa.getCPF()



                );
        return PDTO;
    }

}
