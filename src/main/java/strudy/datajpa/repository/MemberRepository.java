package strudy.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import strudy.datajpa.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
