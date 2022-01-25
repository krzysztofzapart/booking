package pl.kzapart.booking.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kzapart.booking.model.Reservation;
import pl.kzapart.booking.service.ReservationService;

import java.util.List;

@RequestMapping("/reservations")
@RestController
@AllArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;

}
