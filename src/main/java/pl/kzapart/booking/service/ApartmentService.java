package pl.kzapart.booking.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kzapart.booking.model.Apartment;
import pl.kzapart.booking.repository.ApartmentRepository;

@Service
@AllArgsConstructor
public class ApartmentService {

    private final ApartmentRepository apartmentRepository;

    public Apartment findById(Long apartmentID)
    {
        return apartmentRepository.findById(apartmentID).orElseThrow(() -> new RuntimeException("No such apartment found") );
    }
}
