insert into tenant(tenantID, name) VALUES (NULL, 'Jan Nowak');
insert into tenant(tenantID, name) VALUES (NULL, 'Maciej Krasinski');
insert into tenant(tenantID, name) VALUES (NULL, 'Daniel Kowalski');

insert into landlord(landlordID, name) VALUES (NULL, 'Eugeniusz Domanski');
insert into landlord(landlordID, name) VALUES (NULL, 'Teodor Filipowicz');
insert into landlord(landlordID, name) VALUES (NULL, 'Roman Karpowicz');

insert into apartment(apartmentID, price, living_area, description) VALUES (NULL, 1250.0,40.5,'Odnowione mieszkanie na ulicy Marszalkowskiej');
insert into apartment(apartmentID, price, living_area, description) VALUES (NULL, 850.0,20.0,'Przytulny pokoj dla studenta lub studentki na ulicy dlugiej');
insert into apartment(apartmentID, price, living_area, description) VALUES (NULL, 5560.0,120.5,'Wolnostojacy dom z 4 pokojami, 2 lazienkami na ulicy Stasica');
insert into apartment(apartmentID, price, living_area, description) VALUES (NULL, 1500.0,23.5,'Nowoczesna kawalerka dla mlodej osoby pracujacej');

insert into reservation(reservationID,rental_period, costs, tenantID, landlordID, apartmentID) VALUES (NULL,90,1250.0,1,3,1);
insert into reservation(reservationID,rental_period, costs, tenantID, landlordID,apartmentID) VALUES (NULL,20,850.0,3,2,2);
insert into reservation(reservationID,rental_period, costs, tenantID, landlordID,apartmentID) VALUES (NULL,50,1500.0,3,1,4);

