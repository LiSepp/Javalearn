package control;

import javax.swing.JFrame;

public class DebugText {

	public static void main(String[] args) {
		int[] ints= new int[20];
		try {
			for (int i = 0; i < 21; i++) {
				ints[i] = i+1;
				System.out.println(i+1);

			}
		} catch (Exception e) {
			System.err.println("数组越界！");
		}
	}

}
	