package hostCalculator.HostCalculatorSpring.domain.member.service;

import hostCalculator.HostCalculatorSpring.domain.member.dto.PhoneNumberValidationRequestDto;
import hostCalculator.HostCalculatorSpring.domain.member.dto.PhoneNumberValidationResponseDto;
import hostCalculator.HostCalculatorSpring.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public PhoneNumberValidationResponseDto PhoneNumberDuplicationValid(PhoneNumberValidationRequestDto requestDto) {
        if (!memberRepository.findByPhoneNumber(requestDto.getPhoneNumber()).isPresent()) {
            return PhoneNumberValidationResponseDto.builder()
                    .phoneNumber(requestDto.getPhoneNumber())
                    .message("가입 가능한 휴대폰번호입니다.")
                    .result(true)
                    .build();
        } else {
            return PhoneNumberValidationResponseDto.builder()
                    .phoneNumber(requestDto.getPhoneNumber())
                    .message("이미 가입한 휴대폰번호입니다.")
                    .result(false)
                    .build();
        }
    }
}
