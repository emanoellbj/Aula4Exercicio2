
public class Main {
	public static void main(String[] args) {
		
        MP3Player mp3Player = new MP3Player();
        mp3Player.abrir("musica.mp3");
        mp3Player.reproduzir();
        mp3Player.pausar();
        mp3Player.parar();
        
        WAVPlayer wavPlayer = new WAVPlayer();
        wavPlayer.abrir("audio.wav");
        wavPlayer.reproduzir();
        wavPlayer.pausar();
        wavPlayer.parar();
        
	}
}
