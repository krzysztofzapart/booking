package pl.kzapart.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kzapart.booking.model.Apartment;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
}
