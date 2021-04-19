package vtb.geekbrains.market.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Map;

@Component
public class JwtProvider {
    final String secret = "amF2YW1hc3Rlcg==";

    public String generateToken(String login) {
        Date date = Date.from(LocalDate.now().plusDays(15).atStartOfDay(ZoneId.systemDefault()).toInstant());
        return Jwts.builder()
                .setSubject(login)
                .claim("ROLES", "ROLE_USER")
                .setExpiration(date)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public String getLoginFromToken(String token) {
        Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        return claims.getSubject();
    }

    public String getRole(String token) {
        String role = "";

        Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        for (final Map.Entry<String, Object> claim : claims.entrySet()) {
            if (claim.getKey().equals("ROLE")) {
                if (claim.getValue() != null) {
                    role = claim.getValue().toString();
                }
            }
        }

        return role;
    }
}