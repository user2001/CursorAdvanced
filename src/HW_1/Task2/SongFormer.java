package HW_1.Task2;

public class SongFormer implements Runnable {
    Song song;
    Thread thread;

    SongFormer(Song song) {
        this.song = song;
        thread = new Thread(this, "SongFormer");
        thread.start();
    }

    public void run() {
        String songTitle = "Nothing else matters";
        System.out.println("Потік: " + thread.getName() + ", сформував файл: " + songTitle);
        song.put(songTitle);
    }
}


