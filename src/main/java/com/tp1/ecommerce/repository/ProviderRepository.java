package com.tp1.ecommerce.repository;

import com.tp1.ecommerce.entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {

    Provider findByMatricule(String matricule);
}
