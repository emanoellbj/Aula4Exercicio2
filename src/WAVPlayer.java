
public class WAVPlayer implements FormatoAudio{
	
	private String arquivo;
	
	@Override
	public void abrir(String arquivo) {
        setArquivo(arquivo);
        System.out.println("WAVPlayer: Abrindo arquivo " + arquivo);
	}

	@Override
	public void reproduzir() {
        System.out.println("WAVPlayer: Reproduzindo arquivo " + arquivo);
	}

	@Override
	public void pausar() {
        System.out.println("WAVPlayer: Pausando reprodução do arquivo " + arquivo);
	}

	@Override
	public void parar() {
        System.out.println("WAVPlayer: Parando reprodução do arquivo " + arquivo);
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

}
