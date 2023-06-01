import java.util.Scanner;

public class DownloadCalculator {
    public static void main(String[] args) throws Exception {
        final int bitsPerByte = 8;
        final int secondsPerMinute = 60;
        double fileSizeMB;
        double internetSpeedMbps;
        double fileSizeMb;
        double downloadTimeSeconds;
        double downloadTimeMinutes;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Insira o tamanho do arquivo (em MB):");
        fileSizeMB = keyboard.nextDouble();

        System.out.println("Insira a velocidade da internet (em Mbps):");
        internetSpeedMbps = keyboard.nextDouble();

        fileSizeMb = fileSizeMB * bitsPerByte;

        downloadTimeSeconds = fileSizeMb / internetSpeedMbps;

        downloadTimeMinutes = downloadTimeSeconds / secondsPerMinute;

        downloadTimeMinutes = Math.ceil(downloadTimeMinutes * 1000) / 1000;

        System.out.println("Tempo estimado de download: " + downloadTimeMinutes + " minutos.");

        keyboard.close();
    }
}
