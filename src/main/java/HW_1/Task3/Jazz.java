package HW_1.Task3;

public class Jazz extends Genre implements Runnable {
    @Override
    public void run() {
        this.store.put("Jazz1", "JazzSong1");
        this.store.put("Jazz2", "JazzSong2");
        this.store.put("Jazz3", "JazzSong3");
    }
}
