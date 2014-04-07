package cipher.gala;

public class MonoAlphabeticCipher implements Cipher{

	private String secretAlphabet = "uflpwdrasjmconqybvtexhzkgi"; 
	
	public MonoAlphabeticCipher(){
		
		
	}

	public String getSecretAlphabet() {
		return secretAlphabet;
	}

	protected void setSecretAlphabet(String secretAlphabet) {
		this.secretAlphabet = secretAlphabet;
	}

	@Override
	public String encrypt(String text) {
		text = text.toLowerCase();
		String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
		for(int i = 0; i < alphabet.length(); i++){
			if(alphabet.charAt(i) == text.charAt(i)){
				
			}
		}
		
		
		return null;
	}

	@Override
	public String decrypt(String text) {
		text = text.toLowerCase();
		return null;
	}
}
