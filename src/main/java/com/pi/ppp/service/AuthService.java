package com.pi.ppp.service;


import com.pi.ppp.dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
