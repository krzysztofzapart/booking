insert into tenant(tenantID, name) VALUES (1, 'littleBuddy');
insert into tenant(tenantID, name) VALUES (2, 'secondbuddy');
insert into tenant(tenantID, name) VALUES (3, 'thirdbudy');

insert into landlord(landlordID, name) VALUES (1, 'Landlord1');
insert into landlord(landlordID, name) VALUES (2, 'Landlord2');
insert into landlord(landlordID, name) VALUES (3, 'Landlord3');

insert into apartment(apartmentID, price, living_area, description) VALUES (1, 1250.0,40.5,'Odnowione mieszkanie na ulicy Marszalkowskiej');
insert into apartment(apartmentID, price, living_area, description) VALUES (2, 850.0,20.0,'Przytulny pokoj dla studenta lub studentki na ulicy dlugiej');
insert into apartment(apartmentID, price, living_area, description) VALUES (3, 5560.0,120.5,'Wolnostojacy dom z 4 pokojami, 2 lazienkami na ulicy Stasica');

insert into reservation(reservationID,rental_period, costs, tenantID, landlordID, apartmentID) VALUES (1,90,1250.0,1,3,1);
insert into reservation(reservationID,rental_period, costs, tenantID, landlordID,apartmentID) VALUES (2,20,850.0,3,2,2);
insert into reservation(reservationID,rental_period, costs, tenantID, landlordID,apartmentID) VALUES (3,30,5560.0,2,1,3);

