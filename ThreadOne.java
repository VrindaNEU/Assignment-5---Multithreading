
public class ThreadOne implements Runnable {

    private final FilePlayer filePlayer;

    public ThreadOne(FilePlayer filePlayer) {
        this.filePlayer = filePlayer;
    }

    @Override
    public void run() {
        String[] tones = {"do.wav", "mi.wav", "sol.wav", "si.wav", "do-octave.wav"};
        for (String tone : tones) {
            filePlayer.play(tone);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}