package az.ingress.repo;

import az.ingress.entity.Count;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountRepository extends JpaRepository<Count,Long> {

}
