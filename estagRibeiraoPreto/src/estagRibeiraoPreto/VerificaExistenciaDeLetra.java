package estagRibeiraoPreto;

public class VerificaExistenciaDeLetra {
	public String VerificaExistenciaLetra(String palavra, char letra) {
		int aparicoesLetra = 0;
		palavra.toLowerCase();
		letra = Character.toLowerCase(letra);
		for(int i = 0; i < palavra.length(); i++) {
			char caractere = palavra.charAt(i);
			if(caractere == letra) aparicoesLetra++;
		}
		return "A letra " + letra + " aparece " + aparicoesLetra + " vezes na palavra " + palavra + " .";
		
	}
}
