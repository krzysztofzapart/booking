package pl.kzapart.booking.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.kzapart.booking.dto.ReservationRequest;
import pl.kzapart.booking.model.Reservation;
import pl.kzapart.booking.service.ReservationService;

import java.util.List;

@RequestMapping("/reservations")
@RestController
@AllArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ReservationRequest reservationRequest)
    {
        reservationService.add(reservationRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/{name}")
    public ResponseEntity<List<Reservation>> getReservationsByTenant(@PathVariable String name)
    {
        return ResponseEntity.status(HttpStatus.OK).body(reservationService.getReservationByTenant(name));
    }

    @PutMapping
    public ResponseEntity<Void> editReservation(@RequestBody ReservationRequest reservationRequest)
    {
        reservationService.editReservation(reservationRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
