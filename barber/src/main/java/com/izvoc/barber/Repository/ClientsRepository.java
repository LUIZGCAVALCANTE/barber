package com.izvoc.barber.Repository;

import com.izvoc.barber.Entities.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends JpaRepository <Clients, Long> {
}
