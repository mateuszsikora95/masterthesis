package com.example.masterthesis;

import com.example.masterthesis.entities.Customer;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface LineItemRepository extends JpaRepository<Customer, Integer> {

}
