package com.izvoc.barber.Repository;

import com.izvoc.barber.Entities.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfissionalRepository extends JpaRepository <Profissional, Long> {



}
