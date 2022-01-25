package pl.kzapart.booking.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.kzapart.booking.model.Apartment;
import pl.kzapart.booking.model.Landlord;
import pl.kzapart.booking.model.Tenant;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@NoArgsConstructor
@Getter
public class ReservationRequest {

    private int rentalPeriod;
    private long tenantID;
    private long landlordID;
    private long apartmentID;

}
