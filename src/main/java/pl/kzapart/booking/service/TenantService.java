package pl.kzapart.booking.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kzapart.booking.model.Tenant;
import pl.kzapart.booking.repository.TenantRepository;

@Service
@AllArgsConstructor
public class TenantService {

    private final TenantRepository tenantRepository;

    public Tenant findById(Long tenantID)
    {
        return tenantRepository.findById(tenantID).orElseThrow(()-> new RuntimeException("No such tenant found"));
    }
}
