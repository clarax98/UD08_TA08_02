package Password;

import java.security.SecureRandom;

public class Password {
	private int lon = 8;
	private String passwd = "";
	
	public Password() {
		// TODO Auto-generated constructor stub
	}
	
	public Password (int lon) {
		this.lon = lon;
		this.passwd = generateRandomPassword(lon);
	}

	/**
	 * @return the lon
	 */
	public int getLon() {
		return lon;
	}

	/**
	 * @param lon the lon to set
	 */
	public void setLon(int lon) {
		this.lon = lon;
	}

	/**
	 * @return the passwd
	 */
	public String getPasswd() {
		return generateRandomPassword(this.lon);
	}

	private static String generateRandomPassword(int len)
    {
        // Rango ASCII – alfanumérico (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        // cada iteración del bucle elige aleatoriamente un carácter del rango
        // ASCII y lo agrega a la instancia `StringBuilder`
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
    }
}
