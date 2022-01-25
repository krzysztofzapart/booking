package pl.kzapart.booking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Landlord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long landlordID;
    private String name;
}
