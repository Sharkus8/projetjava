package com.tawa.repository;

import com.tawa.model.Reservation;
import com.tawa.model.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    // Trouver toutes les réservations par nom du client
    List<Reservation> findByCustomerName(String customerName);

    // Trouver toutes les réservations avant une certaine date et heure
    List<Reservation> findByReservationTimeBefore(LocalDateTime dateTime);

    // Trouver toutes les réservations après une certaine date et heure
    List<Reservation> findByReservationTimeAfter(LocalDateTime dateTime);

    // Trouver toutes les réservations associées à une table spécifique
    List<Reservation> findByTable(Table table);

    // Trouver toutes les réservations entre deux dates
    List<Reservation> findByReservationTimeBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);

    // Trouver toutes les réservations triées par date de réservation
    List<Reservation> findAllByOrderByReservationTimeAsc();
}
