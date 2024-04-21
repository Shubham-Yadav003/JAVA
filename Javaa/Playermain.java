import java.util.Scanner;

interface Playable {
    void play();
}

class Mp3Player implements Playable {
    public void play() {
        System.out.println("Playing mp3 audio");
    }
}

class WavPlayer implements Playable {
    public void play() {
        System.out.println("Playing wav audio");
    }
}

class MusicPlayer {
    public void playAudio(Playable audio) {
        audio.play();
    }
}

public class Playermain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mp3Player mp3Player = new Mp3Player();
        WavPlayer wavPlayer = new WavPlayer();
        MusicPlayer musicPlayer = new MusicPlayer();
        System.out.println("Enter your choice (1 for mp3, 2 for wav): ");
        int choice = scanner.nextInt();
        switch(choice) {
            case 1:
                musicPlayer.playAudio(mp3Player);
                break;
            case 2:
                musicPlayer.playAudio(wavPlayer);
                break;
            default:
                System.out.println("Invalid choice");
        }
        scanner.close();
    }
}
