package HW_1.Task2;

public class ProduserMain {
    public static void main(String[] args) {
        Song song = new Song();
        new SongFormer(song);
        new GetSong(song);
    }
}
