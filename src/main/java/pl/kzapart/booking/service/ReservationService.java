package pl.kzapart.booking.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.kzapart.booking.dto.ReservationRequest;
import pl.kzapart.booking.exceptions.ReservationException;
import pl.kzapart.booking.model.Apartment;
import pl.kzapart.booking.model.Landlord;
import pl.kzapart.booking.model.Reservation;
import pl.kzapart.booking.model.Tenant;
import pl.kzapart.booking.repository.ReservationRepository;
import pl.kzapart.booking.repository.TenantRepository;

import java.util.LinkedList;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final ApartmentService apartmentService;
    private final LandlordService landlordService;
    private final TenantService tenantService;
    private final TenantRepository tenantRepository;

    public Reservation add(ReservationRequest reservationRequest)
    {
        if(checkIfApartmentIsBooked(reservationRequest))
        {
            throw new ReservationException("Apartment is already booked");
        }
        else {
            Apartment apartment = apartmentService.findById(reservationRequest.getApartmentID());
            Landlord landlord = landlordService.findById(reservationRequest.getLandlordID());
            Tenant tenant = tenantService.findById(reservationRequest.getTenantID());

            Reservation reservation = new Reservation();
            reservation.setCosts(apartment.getPrice());
            reservation.setApartmentID(apartment);
            reservation.setLandlordID(landlord);
            reservation.setTenantID(tenant);
            reservation.setRentalPeriod(reservationRequest.getRentalPeriod());
            reservationRepository.save(reservation);
            return reservation;
        }
    }
    @Transactional(readOnly = true)
    public List<Reservation> getReservationByTenant(String name)
    {
        Tenant tenant = tenantRepository.findByName(name);
        List<Reservation> reservationList = reservationRepository.findByTenantID(tenant);

        return reservationList;
    }

    @Transactional
    public Reservation editReservation(ReservationRequest reservationRequest)
    {
        if(checkIfApartmentIsBooked(reservationRequest))
        {
            throw new ReservationException("Apartment is already booked");
        }
        else
        {
            Reservation editedReservation = reservationRepository.findById(reservationRequest.getReservationID()).orElseThrow(() -> new IllegalStateException("No such reservation found"));
            Apartment apartment = apartmentService.findById(reservationRequest.getApartmentID());
            Landlord landlord = landlordService.findById(reservationRequest.getLandlordID());
            Tenant tenant = tenantService.findById(reservationRequest.getTenantID());
            editedReservation.setCosts(apartment.getPrice());
            editedReservation.setApartmentID(apartment);
            editedReservation.setLandlordID(landlord);
            editedReservation.setTenantID(tenant);
            editedReservation.setRentalPeriod(reservationRequest.getRentalPeriod());
            return editedReservation;
        }
    }

    private boolean checkIfApartmentIsBooked(ReservationRequest reservationRequest) {
        Apartment apartment = apartmentService.findById(reservationRequest.getApartmentID());
        boolean ifAppartmentIsBooked = reservationRepository.existsByApartmentID(apartment);
        return ifAppartmentIsBooked;
    }

}
