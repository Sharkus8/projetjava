package com.tawa.repository;

import com.tawa.model.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TableRepository extends JpaRepository<Table, Long> {

    // Trouver toutes les tables avec une capacité spécifique
    List<Table> findByCapacity(int capacity);

    // Trouver une table par son numéro
    Optional<Table> findByNumber(int number);

    // Trouver toutes les tables ayant une capacité supérieure à une valeur donnée
    List<Table> findByCapacityGreaterThan(int capacity);
    
    // Trouver toutes les tables ayant une capacité entre deux valeurs
    List<Table> findByCapacityBetween(int minCapacity, int maxCapacity);

    // Trouver toutes les tables triées par capacité
    List<Table> findAllByOrderByCapacityAsc();
}
