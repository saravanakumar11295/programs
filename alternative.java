package lives;

public class alternative {
	static void prime(int start, int end) {
		for (int i = start; i <=end; i++) {
			int cn=1;
			int count = 0;
			for (int j =i ; j<=cn; j++) {
				if (cn % j == 0) {
					count++;
					//break;
				}
			}
				if (count == 2) {
					System.out.print(cn);
				}
			}//System.out.println(i);
		}

	public static void main(String[] args) {
		int start = 1, end = 100;
		prime(start, end);

	}

}
