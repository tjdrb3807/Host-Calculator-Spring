package hostCalculator.HostCalculatorSpring.domain.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = PROTECTED)
public class PhoneNumberValidationRequestDto {

    private String phoneNumber;
}
