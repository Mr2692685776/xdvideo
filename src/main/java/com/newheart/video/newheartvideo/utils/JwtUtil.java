package com.newheart.video.newheartvideo.utils;

import com.newheart.video.newheartvideo.domain.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * @Author newHeart
 * @Create 2020/2/29 9:13
 */
public class JwtUtil {

    private static final String SUBJECT = "newheart";
    private static final String APPSECRET = "newheart2020";
    private static final long Expire = 1000*60*30;

    public static String createToken(User user){
        if(user==null||user.getName()==null||
        user.getHeadImg()==null){
            return null;
        }
        String token = Jwts.builder().setSubject(SUBJECT).claim("id", user.getId())
                .claim("name", user.getName())
                .claim("img", user.getHeadImg())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + Expire))
                .signWith(SignatureAlgorithm.HS256, APPSECRET).compact();

        return token;
    }

    public static Claims checkToken(String token){
        try {
            final   Claims claims = Jwts.parser().setSigningKey(APPSECRET).parseClaimsJws(token).getBody();
            return claims;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }
}
