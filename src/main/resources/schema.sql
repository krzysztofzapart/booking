DROP TABLE IF EXISTS reservation;
DROP TABLE IF EXISTS apartment;
DROP TABLE IF EXISTS tenant;
DROP TABLE IF EXISTS landlord;

CREATE TABLE apartment (
  apartmentid BIGINT NOT NULL AUTO_INCREMENT,
  price DOUBLE NULL,
  living_area DOUBLE NULL,
  description VARCHAR(255) NULL,
  CONSTRAINT pk_apartment PRIMARY KEY (apartmentid)
);

CREATE TABLE tenant (
  tenantid BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NULL,
  CONSTRAINT pk_tenant PRIMARY KEY (tenantid)
);
CREATE TABLE landlord (
  landlordid BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NULL,
  CONSTRAINT pk_landlord PRIMARY KEY (landlordid)
);
CREATE TABLE reservation (
  reservationid BIGINT NOT NULL AUTO_INCREMENT,
  rental_period INT NULL,
  costs DOUBLE NULL,
  tenantid BIGINT NOT NULL,
  landlordid BIGINT NOT NULL,
  apartmentid BIGINT NOT NULL,
  CONSTRAINT pk_reservation PRIMARY KEY (reservationid),
  CONSTRAINT fk_tenant FOREIGN KEY(tenantid) REFERENCES tenant(tenantID),
  CONSTRAINT fk_landlord FOREIGN KEY(landlordid) REFERENCES landlord(landlordid),
  CONSTRAINT fk_apartment FOREIGN KEY(apartmentid) REFERENCES apartment(apartmentid)
);