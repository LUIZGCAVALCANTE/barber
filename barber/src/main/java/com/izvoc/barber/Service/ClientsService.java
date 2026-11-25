package com.izvoc.barber.Service;

import com.izvoc.barber.DTO.ClientsDTO;
import com.izvoc.barber.Repository.ClientsRepository;
import com.izvoc.barber.Entities.Clients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientsService {
    @Autowired
    private ClientsRepository CRepository;




// buscar por id
   public ClientsDTO getId(Long id){

       Clients client = CRepository.findById(id).orElseThrow(()-> new RuntimeException("Cliente inexistente"));



       ClientsDTO dto = new ClientsDTO(
        client.getId(),
        client.getName(),
        client.getEmail(),
        client.getCPF()
       );
       return dto;

   }
// buscar todos clients

    public List <ClientsDTO> getAll(){

        List <Clients> clients = CRepository.findAll();

        List<ClientsDTO> clientsDTO = new ArrayList<>();

        for(Clients client: clients){

            ClientsDTO dto = new ClientsDTO(

                    client.getId(),
                    client.getName(),
                    client.getEmail(),
                    client.getCPF()



            );  clientsDTO .add(dto);

        }

        return clientsDTO ;

    }
// cria um client novo
    public ClientsDTO InsertClient(ClientsDTO clientsDTO){
            Clients clients = new Clients();
                clients.setName(clientsDTO.getName());
                clients.setEmail(clientsDTO.getEmail());
                clients.setCPF(clientsDTO.getCPF());


          CRepository.save(clients);
        return new ClientsDTO(clients.getId(), clients.getName(),clients.getEmail(),clients.getCPF() );
    }


public ClientsDTO ClientUpdate(   ClientsDTO clientsDTO, Long id){

    Clients clients = CRepository.findById(id).orElseThrow(()-> new RuntimeException("Cliente inexistente"));
    clients.setName(clientsDTO.getName());
    clients.setEmail(clientsDTO.getEmail());
    clients.setCPF(clientsDTO.getCPF());


    CRepository.save(clients);
    return new ClientsDTO(clients.getId(), clients.getName(),clients.getEmail(),clients.getCPF() );

}


public ClientsDTO deleteUserId(Long id){
    Clients client = CRepository.findById(id).orElseThrow(()-> new RuntimeException("Cliente inexistente"));

    ClientsDTO dto = new ClientsDTO(
            client.getId(),
            client.getName(),
            client.getEmail(),
            client.getCPF()
    );

    CRepository.delete(client);

    return dto;

}











}





