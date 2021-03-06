package pl.kzapart.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kzapart.booking.model.Tenant;

@Repository
public interface TenantRepository extends JpaRepository<Tenant,Long> {
    Tenant findByName(String name);
}
