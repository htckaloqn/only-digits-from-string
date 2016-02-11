
public class OnlyDigitsFromString {

	
	/**
	 * Remove letters.
	 * @author Internet
	 * @param input String to remove letters.
	 * @return StringBuilder to String.
	 * 
	 */
	private String onlyDigits(String input){
   
		final StringBuilder sb = new StringBuilder(input.length());
   
		for(int i = 0; i < input.length(); i++){
			
			final char c = input.charAt(i);
			
			if(c > 47 && c < 58){
				
				sb.append(c);
        }
    }
    return sb.toString();
}
	
	
	
	
	
	
	public static void main(String[] args) {
	

	}

}
