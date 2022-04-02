package com.example.fullstack_development.ArrayList;

import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Hero");
        desertIslandPlaylist.add("Autumn in my heart");
        desertIslandPlaylist.add("My love");
        desertIslandPlaylist.add("When you say nothing at all");
        desertIslandPlaylist.add("Perfect");
        desertIslandPlaylist.add("Winter sonata");
        int numberOfSongs = desertIslandPlaylist.size();
        System.out.println("-----------------");
        System.out.println("Before: " + numberOfSongs);
        System.out.println(desertIslandPlaylist.toString());
        while(desertIslandPlaylist.size() > 5){
            desertIslandPlaylist.remove(0);
        }

        System.out.println("After remove: " + desertIslandPlaylist.size());
        System.out.println(desertIslandPlaylist.toString());


    int swapIndice = 0;
    int swapIndice2 = 1;
    String tempo = desertIslandPlaylist.get(swapIndice);
    desertIslandPlaylist.set(swapIndice, desertIslandPlaylist.get(swapIndice2));
    desertIslandPlaylist.set(swapIndice2, tempo);

     System.out.println("After swap: " + desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist.toString());
    }
}
