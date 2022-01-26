package pl.kzapart.booking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reservationID;
    private int rentalPeriod;
    private double costs;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tenantID")
    private Tenant tenantID;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "landlordID")
    private Landlord landlordID;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "apartmentID")
    private Apartment apartmentID;


}
