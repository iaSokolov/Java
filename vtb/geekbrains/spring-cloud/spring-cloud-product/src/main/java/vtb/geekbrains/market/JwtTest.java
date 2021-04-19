package vtb.geekbrains.market;

import vtb.geekbrains.market.jwt.JwtProvider;

public class JwtTest {
    public static void main(String[] args) {
        JwtProvider provider = new JwtProvider();
        System.out.println(provider.generateToken("a"));
        System.out.println(provider.generateToken("u"));
        System.out.println(provider.generateToken("sokolov"));
    }
}
