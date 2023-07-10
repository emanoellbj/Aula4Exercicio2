
public class MP3Player implements FormatoAudio{
	
	private String arquivo;

	@Override
	public void abrir(String arquivo) {
        setArquivo(arquivo);
        System.out.println("MP3Player: Abrindo arquivo " + arquivo);
	}

	@Override
	public void reproduzir() {
		System.out.println("MP3Player: Reproduzindo arquivo " + arquivo);
	}

	@Override
	public void pausar() {
        System.out.println("MP3Player: Pausando reprodução do arquivo " + arquivo);
	}

	@Override
	public void parar() {
        System.out.println("MP3Player: Parando reprodução do arquivo " + arquivo);
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

}
