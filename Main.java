
public class Main {
    public static void main(String[] args) {
        FilePlayer filePlayer = new FilePlayer();

        Thread thread1 = new Thread(new ThreadOne(filePlayer));
        Thread thread2 = new Thread(new ThreadTwo(filePlayer));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(" ------------- Playing Twinkle Twinkle ---------------- ");
        
        playTwinkleTwinkle(filePlayer);
        
        
    }




private static void playTwinkleTwinkle(FilePlayer filePlayer) {
    String[] twinkleTones = {"do.wav", "do.wav", "sol.wav", "sol.wav", "la.wav", "la.wav", "sol.wav", "fa.wav",
            "fa.wav", "mi.wav", "mi.wav", "re.wav", "re.wav", "do.wav","sol.wav", "sol.wav", "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav", "sol.wav",
            "sol.wav", "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav", "do.wav", "do.wav", "sol.wav",
            "sol.wav", "la.wav", "la.wav", "sol.wav", "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav", "re.wav", "do.wav"};
    for (String tone : twinkleTones) {
        filePlayer.play(tone);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


}



