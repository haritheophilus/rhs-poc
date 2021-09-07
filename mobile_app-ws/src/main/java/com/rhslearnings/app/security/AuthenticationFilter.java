package com.rhslearnings.app.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rhslearnings.app.SpringApplicationContext;
import com.rhslearnings.app.service.UserService;
import com.rhslearnings.app.shared.dto.UserDto;
import com.rhslearnings.app.ui.model.request.UserLoginRequestModel;

import io.jsonwebtoken.Jwts;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {

	private final AuthenticationManager authenticationManager;

	public AuthenticationFilter(AuthenticationManager authenticationManager) {
		super();
		this.authenticationManager = authenticationManager;
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {


		try {
			UserLoginRequestModel creds = new ObjectMapper().readValue(request.getInputStream(), UserLoginRequestModel.class);
			return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(creds.getEmail(),
					creds.getPassword(), new ArrayList<>()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		
		String username = ( (User)authResult.getPrincipal()).getUsername();
		String token = Jwts.builder().setSubject(username).setExpiration(new Date(System.currentTimeMillis() + SecurityConstants.EXPIRATION_TIME)).
				signWith(io.jsonwebtoken.SignatureAlgorithm.HS512, SecurityConstants.getTokenSecret()).compact();
		UserService userService = (UserService)SpringApplicationContext.getbean("userServiceImpl");
		UserDto userDto =  userService.getUser(username);
		response.addHeader(SecurityConstants.HEADER_STRING, SecurityConstants.TOKEN_PREFIX + token);
		response.addHeader("userId", userDto.getUserId());
	}
	
	

}
