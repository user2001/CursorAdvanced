package HW_1.Task2;

public class GetSong implements Runnable {
    Song song;
    Thread thread;

    GetSong(Song song) {
        this.song = song;
        thread = new Thread(this, "GetSong");
        thread.start();
    }

    public void run() {
        System.out.println("Потік: " + thread.getName() + ", отримав файл: " + song.get());
        System.out.println("Let's play this song: " + song.name);
    }
}
