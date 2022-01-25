package pl.kzapart.booking.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kzapart.booking.model.Landlord;
import pl.kzapart.booking.repository.LandlordRepository;

@Service
@AllArgsConstructor
public class LandlordService {

    private final LandlordRepository landlordRepository;

    public Landlord findById(Long landlordID)
    {
        return landlordRepository.findById(landlordID).orElseThrow(()-> new RuntimeException("No such landlord found"));
    }
}
