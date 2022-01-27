# Zadanie Rekrutacyjne

## API
1. Dodać rezerwację
   ```sh
   curl --location --request POST 'localhost:8080/reservations' \ --header 'Content-Type: application/json' \ --data-raw '{"rentalPeriod":30,"tenantID":2,"landlordID":1,"apartmentID":3}'
   ```
2. Zmienic rezerwację (np. zmiana okresu najmu)
   ```sh
   curl --location --request PUT 'localhost:8080/reservations' \ --header 'Content-Type: application/json' \--data-raw '{"reservationID":3,"rentalPeriod":90,"tenantID":2,"landlordID":1,"apartmentID":3}'
   ```
3. Lista rezerwacji dla zadanego najemcę (nazwa)
   ```sh
   curl --location --request GET 'localhost:8080/reservations/Daniel Kowalski'
   ```
