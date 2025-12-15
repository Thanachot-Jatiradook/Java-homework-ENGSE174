package LAb506;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Video title : ");
        String inputVideoTitle = scanner.nextLine();

        System.out.println("Video duration : ");
        int inputVideoDuration = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Audio title : ");
        String inputAudioTitle = scanner.nextLine();

        System.out.println("Audio quality : ");
        String inputAudioQuality = scanner.nextLine();

        Video blehVideo = new Video(inputVideoTitle, inputVideoDuration);
        Audio blehAudio = new Audio(inputAudioTitle, inputAudioQuality);

        Processor.runProcessor(blehVideo);
        Processor.runProcessor(blehAudio);

        scanner.close();
    }
}
