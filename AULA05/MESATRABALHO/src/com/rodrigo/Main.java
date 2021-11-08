package com.rodrigo;

public class Main {
    public static void main(String[] args) {

        Usuario user1 = new Usuario("Rodrigo", false);
        Usuario user2 = new Usuario("Larissa", true);

        System.out.println("\n---------------------------\n");
        user1.salvarMusicaOffline("stairway to heaven");
        System.out.println("\n---------------------------\n");
        user2.salvarMusicaOffline("lightning & snow");
    }
}
