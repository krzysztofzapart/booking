package pl.kzapart.booking.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kzapart.booking.dto.ReservationRequest;
import pl.kzapart.booking.exceptions.ReservationException;
import pl.kzapart.booking.model.Apartment;
import pl.kzapart.booking.model.Landlord;
import pl.kzapart.booking.model.Reservation;
import pl.kzapart.booking.model.Tenant;
import pl.kzapart.booking.repository.ReservationRepository;

@Service
@AllArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final ApartmentService apartmentService;
    private final LandlordService landlordService;
    private final TenantService tenantService;

    public Reservation add(ReservationRequest reservationRequest)
    {
        if(checkIfApartmentIsBooked(reservationRequest))
        {
            throw new ReservationException("Apartment is already booked");
        }
        else
        {
         Apartment apartment = apartmentService.findById(reservationRequest.getApartmentID());
         Landlord landlord = landlordService.findById(reservationRequest.getLandlordID());
         Tenant tenant = tenantService.findById(reservationRequest.getTenantID());

         Reservation reservation = new Reservation();
         reservation.setCosts(apartment.getPrice());
         reservation.setApartmentID(apartment);
         reservation.setLandlordID(landlord);
         reservation.setRentalPeriod(reservationRequest.getRentalPeriod());
         reservationRepository.save(reservation);
         return reservation;
        }
    }

    private boolean checkIfApartmentIsBooked(ReservationRequest reservationRequest) {
        boolean ifAppartmentIsBooked = reservationRepository.existsReservationByApartmentID(reservationRequest.getApartmentID());
        return ifAppartmentIsBooked;
    }

}
