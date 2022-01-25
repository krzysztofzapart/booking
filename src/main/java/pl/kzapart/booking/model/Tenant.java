package pl.kzapart.booking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tenantID;
    private String name;

}
