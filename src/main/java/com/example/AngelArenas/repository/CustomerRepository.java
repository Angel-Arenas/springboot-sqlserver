package com.example.AngelArenas.repository;

import com.example.AngelArenas.model.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // ⚙️🔍 Definir método Listar por Estado
    List<Customer> findByState(String state);

}
