package pl.kzapart.booking.exceptions;

public class ReservationException extends RuntimeException{
    public ReservationException(String message, Exception exception)
    {
        super(message,exception);
    }
    public ReservationException(String message)
    {
        super(message);
    }

}
