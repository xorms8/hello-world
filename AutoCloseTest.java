package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		
		
		try(AutoCloseObj obj2 = new AutoCloseObj()) {
			//정상적으로 수행 되면 close()가 그냥 실행 됌
			
			
			
		} catch (Exception e) {
			System.out.println("eception");
		}
	}

}
