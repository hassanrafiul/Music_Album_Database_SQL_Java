
package proj4;

/**
 *
 * @author rafiu
 */
public class Album {
    private int albumId;
    private int artistId;
    private String name;

    public Album(int albumId, int artistId, String name) {
        this.albumId = albumId;
        this.artistId = artistId;
        this.name = name;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }  
}
