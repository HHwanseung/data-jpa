package strudy.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import strudy.datajpa.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
