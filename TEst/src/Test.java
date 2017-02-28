public class Test {

	public static void main(String[] args) {
		String str = "asdfzxccv";
		System.out.println(check(str));
				
	}

	public static boolean check(String str) {
		boolean[] check = new boolean[256];
		char[] chArr = str.toCharArray();
		int index = chArr.length;

		for (int i = 0; i < index; i++) {
			if(check[chArr[i]] == false){
				check[chArr[i]] = true;
			}else{
				return false;
			}
		}

		return true;
	}
}
