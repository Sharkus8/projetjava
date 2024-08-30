package com.tawa.service;

import com.tawa.model.Reservation;
import com.tawa.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Optional<Reservation> getReservationById(Long id) {
        return reservationRepository.findById(id);
    }

    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Reservation updateReservation(Long id, Reservation reservationDetails) {
        Optional<Reservation> optionalReservation = reservationRepository.findById(id);
        if (optionalReservation.isPresent()) {
            Reservation reservation = optionalReservation.get();
            reservation.setCustomerName(reservationDetails.getCustomerName());
            reservation.setReservationTime(reservationDetails.getReservationTime());
            reservation.setTable(reservationDetails.getTable());
            return reservationRepository.save(reservation);
        } else {
            return null;
        }
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
