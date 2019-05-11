package com.example.masterthesis;

import com.example.masterthesis.entities.Songdata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongsRepository extends JpaRepository<Songdata, String> {

}
