package pl.kzapart.booking.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.kzapart.booking.model.Apartment;
import pl.kzapart.booking.model.Landlord;
import pl.kzapart.booking.model.Reservation;
import pl.kzapart.booking.model.Tenant;
import pl.kzapart.booking.repository.ReservationRepository;
import pl.kzapart.booking.repository.TenantRepository;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith({MockitoExtension.class})
class ReservationServiceTest {
    @Mock
    private ReservationRepository reservationRepository;
    @Mock
    private ApartmentService apartmentService;
    @Mock
    private LandlordService landlordService;
    @Mock
    private TenantService tenantService;
    @Mock
    private TenantRepository tenantRepository;

    @InjectMocks
    private ReservationService reservationService;
    private Tenant tenant = new Tenant(1L,"Jan Kowalski");
    private Landlord landlord = new Landlord(1L,"Daniel Nowak");
    private Apartment apartment = new Apartment(1L,1200.0,50.0,"Testowy Opis");
    @Test
    void shouldFindAllReservationsByTenant() {
        //given
        Mockito.when(reservationRepository.findByTenantID(Mockito.any())).thenReturn(
                Arrays.asList(
                        new Reservation(1L,90,1200.0,tenant,landlord,apartment)
                )
        );
        //when
        List<Reservation> reservations = reservationService.getReservationByTenant("Jan Kowalski");
        //then
        assertThat(reservations).hasSize(1);

    }
}