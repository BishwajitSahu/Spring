import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//logic to create bcrypt version fo password
public class PasswordEncryptor {
	public static void main(String[] args) {
		BCryptPasswordEncoder passwordEncoder=null;
		String hashedPwd1=null,hashedPwd2=null,hashedPwd3=null;
		
		
		passwordEncoder=new BCryptPasswordEncoder();
		hashedPwd1=passwordEncoder.encode("biswa");
		hashedPwd2=passwordEncoder.encode("dibya");
		hashedPwd3=passwordEncoder.encode("bisu");
		
		
		System.out.println(hashedPwd1+"\n"+hashedPwd2+"\n"+hashedPwd3);
	}
}
