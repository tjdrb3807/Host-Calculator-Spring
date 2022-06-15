package hostCalculator.HostCalculatorSpring.domain.member.repository;

import hostCalculator.HostCalculatorSpring.domain.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    
}
