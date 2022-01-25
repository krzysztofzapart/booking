package pl.kzapart.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kzapart.booking.model.Landlord;

@Repository
public interface LandlordRepository extends JpaRepository<Landlord,Long> {
}
