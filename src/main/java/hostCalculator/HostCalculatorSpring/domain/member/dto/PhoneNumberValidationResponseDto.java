package hostCalculator.HostCalculatorSpring.domain.member.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = PROTECTED)
public class PhoneNumberValidationResponseDto {

    private String phoneNumber;
    private String message;
    private Boolean result;
}
