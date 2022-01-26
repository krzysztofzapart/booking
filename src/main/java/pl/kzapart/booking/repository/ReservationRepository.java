package pl.kzapart.booking.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.kzapart.booking.model.Apartment;
import pl.kzapart.booking.model.Reservation;
import pl.kzapart.booking.model.Tenant;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

   boolean existsByApartmentID(Apartment apartment);
   List<Reservation> findByTenantID(Tenant tenant);
}
