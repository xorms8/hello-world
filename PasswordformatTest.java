package exception;

public class PasswordformatTest {
	
	private String userPassword;
	
	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) throws PasswordformatException  { //얘를 정말 사용하는 쪽에서 exception 해라
		
		if(userPassword == null) { //들어온 비밀번호가 null이면
			throw new PasswordformatException("Password는 null 값 일 수 없습니다.");
		}else if(userPassword.length() <= 5) {
			throw new PasswordformatException("Password는 5자 이하일 수 없습니다.");
		}else if(userPassword.matches("[a-zA-Z]+")) { // password가 문자열로 이루어졌으면 ~ 
			throw new PasswordformatException("Password는 문자열로만 이루어 질 수 없습니다.");
		}
			
		this.userPassword = userPassword;
		
	}


	
	
	public static void main(String[] args) {
		
	
		
		
		PasswordformatTest passwordTest = new PasswordformatTest();
		String userPassword = null; //처음에 넣을 자리
		
		try {
			passwordTest.setUserPassword(userPassword);
			System.out.println("오류없음1");
		} catch (PasswordformatException e) {
			System.out.println(e);
		}
		userPassword = "abcd";
		try {
			passwordTest.setUserPassword(userPassword);
			System.out.println("오류없음2");
		} catch (PasswordformatException e) {
			System.out.println(e);
		}
		
		userPassword = "abcde";
		try {
			passwordTest.setUserPassword(userPassword);
			System.out.println("오류없음3");
		} catch (PasswordformatException e) {
			System.out.println(e);
		}
		
		userPassword = "abcde1";
		
		try {
			passwordTest.setUserPassword(userPassword);
		} catch (PasswordformatException e) {
			System.out.println(e.getMessage());
		}

	}

}
