package pl.kzapart.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kzapart.booking.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
