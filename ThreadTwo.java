
public class ThreadTwo implements Runnable {

    private final FilePlayer filePlayer;

    public ThreadTwo(FilePlayer filePlayer) {
        this.filePlayer = filePlayer;
    }

    @Override
    public void run() {
        String[] tones = {"re.wav", "fa.wav", "la.wav", "do-octave.wav"};
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