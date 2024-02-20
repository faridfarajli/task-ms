package az.ingress.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Count {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long count;
}
