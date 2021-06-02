package exception;

public class IDFormatTest {
	
	private String userID;
	
	
	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) throws IDformatException { //얘를 정말 사용하는 쪽에서 exception 해라
		
		if(userID == null) {//들어온 아이디가 null이면
			throw new IDformatException("아이디는 NULL 값 일 수 없습니다.");
		}
		else if(userID.length() < 8 || userID.length() > 20 ) {
			throw new IDformatException("8자 이상 20자 이하로 아이디를 작성하세요");
		}
		
		this.userID = userID;
	}

	
	
	
	
	
	public static void main(String[] args) {
		
		IDFormatTest idTest = new IDFormatTest();
		String userID = null; //처음에 넣을 자리
		
		try {
			idTest.setUserID(userID);
		} catch (IDformatException e) {
			System.out.println(e);
		}
		
		userID = "1234567";
		
		try {
			idTest.setUserID(userID);
		} catch (IDformatException e) {
			System.out.println(e.getMessage());
		}

	}

}
