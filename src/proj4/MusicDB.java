package proj4;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author rafiu
 */
public class MusicDB {
    
    
    //arraylist from artist table for all artist
    public static ArrayList<Artist> getAllArtist() throws SQLException, ClassNotFoundException {
     
        ArrayList<Artist> musicArtist = new ArrayList<>();
        
        try {
            
            Connection connection = DatabaseConnection.getConnection();
            
            Statement statement = connection.createStatement();
            
            ResultSet results = statement.executeQuery(" Select * FROM Artists ORDER BY Name ");
           
            
            while (results.next()) {
                
                int artistId = results.getInt("artistId");
                
                String name = results.getString("name");
                
                Artist artist = new Artist(artistId, name);
                
                musicArtist.add(artist);
           
            } 
            
            results.close();
            statement.close();
            connection.close();
            
        } catch (SQLException e){
            System.out.println("Error accessing Database: " + e.getMessage());
        }
        return musicArtist;
    } 
    
    
    //arraylist from albums table for all albums by artist
    public static ArrayList<Album> getAllAlbum() throws SQLException, ClassNotFoundException {
        
        ArrayList<Album> musicAlbum = new ArrayList<>();
        
        try {
            
            Connection connection = DatabaseConnection.getConnection();
            
            Statement statement =connection.createStatement();
            
            ResultSet results = statement.executeQuery(" Select * FROM Albums ORDER BY Name ");
            
            while (results.next()) {
                
                int albumId = results.getInt("albumId");
                int artistId = results.getInt("artistId");
                String name = results.getString("name");
                
                Album album = new Album(albumId, artistId, name);
                
                musicAlbum.add(album);
                
            }   
            
            results.close();
            statement.close();
            connection.close();
            
        } catch (SQLException e){
            System.out.println("Error accessing Database: " + e.getMessage());
        }
        return musicAlbum;
    }  
 
}

    
