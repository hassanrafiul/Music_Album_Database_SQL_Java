/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj4;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rafiu
 */
public class Proj4 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        MusicDB MusicDB = new MusicDB();

        ArrayList<Artist> artists = new ArrayList<>();
        ArrayList<Album> albums = new ArrayList<>();

        artists = MusicDB.getAllArtist();
        albums = MusicDB.getAllAlbum();

        System.out.println("Artist and Album Listings");
        System.out.println("-----------------------");

        System.out.println("-------------------");
        System.out.println("Atists");
        System.out.println("-------------------");

        for (Iterator<Artist> it = artists.iterator(); it.hasNext();) {
            Artist artist = it.next();
            System.out.println(artist.getName());
        }

        System.out.println("-------------------");
        System.out.println("Album");
        System.out.println("-------------------");

        for (Iterator<Album> it = albums.iterator(); it.hasNext();) {
            Album album = it.next();
            System.out.println(album.toString());
        }

        System.out.println("-------------------");
        System.out.println("List of Albums by Artist");
        System.out.println("-------------");

        for (Iterator<Artist> it = artists.iterator(); it.hasNext();) {

            Artist artist = it.next();

            System.out.println("-------Artists Name------------");

            System.out.println(artist.getName());

            System.out.println("-------Album Name------------");

            for (Album album : albums) {

                if (artist.getArtistId() == album.getArtistId()) {

                    System.out.println(album.toString());

                }
            }
        }

    }
    
}
