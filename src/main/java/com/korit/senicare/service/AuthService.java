package com.korit.senicare.service;

import org.springframework.http.ResponseEntity;

import com.korit.senicare.dto.request.auth.IdCheckRequestDto;
import com.korit.senicare.dto.request.auth.SignInRequestDto;
import com.korit.senicare.dto.request.auth.SignUpRequestDto;
import com.korit.senicare.dto.request.auth.TelAuthCheckRequestDto;
import com.korit.senicare.dto.request.auth.TelAuthRequestDto;
import com.korit.senicare.dto.response.ResponseDto;
import com.korit.senicare.dto.response.auth.SignInResponseDto;




public interface AuthService {

    ResponseEntity<ResponseDto> idCheck(IdCheckRequestDto dto);
    ResponseEntity<ResponseDto> telAuth(TelAuthRequestDto dto);
    ResponseEntity<ResponseDto> telAuthCheck(TelAuthCheckRequestDto dto);
    ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto);

// - Unbounded Wildcard (?): 어떤 타입이든 될 수 있는 와일드카드. 이를 이용하면, 모든 타입에 대응하는 제너릭 코드를 작성할 수 있음.
// - Upper Bounded Wildcard (? extends T): T 또는 T의 하위 타입을 의미하는 와일드카드. T 타입의 메소드를 호출할 수 있음.
// - Lower Bounded Wildcard (? super T): T 또는 T의 상위 타입을 의미하는 와일드카드. T 타입의 인스턴스를 메소드에 전달할 수 있음.
    ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);

}