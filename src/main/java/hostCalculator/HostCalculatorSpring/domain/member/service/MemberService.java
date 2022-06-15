package hostCalculator.HostCalculatorSpring.domain.member.service;

import hostCalculator.HostCalculatorSpring.domain.member.dto.PhoneNumberValidationRequestDto;
import hostCalculator.HostCalculatorSpring.domain.member.dto.PhoneNumberValidationResponseDto;

public interface MemberService {

    PhoneNumberValidationResponseDto PhoneNumberDuplicationValid(PhoneNumberValidationRequestDto requestDto);
}
