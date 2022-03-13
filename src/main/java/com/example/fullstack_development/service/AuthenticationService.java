//package com.example.fullstack_development.service;
//
//import static java.util.Collections.emptyList;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import java.util.Collections;
//import java.util.Date;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.hibernate.sql.ordering.antlr.OrderByFragmentTranslator.StandardOrderByTranslationImpl;
//import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//
//public class AuthenticationService {
//    static final long EXPIRATIONTIME = 24*60*60*1000;
//    static final String SIGNINGKEY = "SecretKey";
//    static final String PREFIX = "Bearer";
//
//    //Add token to Authorization header
//    static public void addTokenFromAuthorizationHeader(HttpServletResponse res, String username){
//        String JwtToken = Jwts.builder().setSubject(username).setExpiration(new Date(System.currentTimeMillis()+ EXPIRATIONTIME)).signWith(
//            SignatureAlgorithm.HS512, SIGNINGKEY).compact();
//        res.addHeader("Authorization", PREFIX + " "+ JwtToken);
//        res.addHeader("Access-Control-Expose-Headers", "Authorization");
//    }
//
//    //get token from Authorization header
//    static public Authentication getAuthentication(HttpServletRequest request){
//        String token = request.getHeader("Authorization");
//        if(token!=null){
//            String user = Jwts.parser().setSigningKey(SIGNINGKEY).parseClaimsJws(token.replace(PREFIX, "")).getBody().getSubject();
//            if(user!=null){
//                return new UsernamePasswordAuthenticationToken(user,null, emptyList());
//            }
//            return null;
//        }
//
//
//    }
//}
