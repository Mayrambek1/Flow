package kg.it_lab.backend.Flow.repository;

import kg.it_lab.backend.Flow.entities.Experts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpertsRepository extends JpaRepository<Experts, Long> {
}
