package operator;

public class AssignOperatorExample {
	public static void main(String[] args) {
		int val1 = 10;
		val1++;
		val1 = val1 + 2;
		val1 += 2;
		val1--;
		val1 = val1 - 3;
		val1 -= 3;
		val1 = val1 * 2;
		val1 *= 2;		
		
		System.out.println(val1);
		
		String str1 = "A";
		str1 = str1 + "B";
		str1 += "C";
		System.out.println(str1);
		
		String msg = "";
		if(val1 %2==0) {
			msg = "¦��";
		} else {
			msg = "Ȧ��";
		}
		System.out.println(val1 + "��" + msg + "�Դϴ�.");
		
	    msg = (val1 % 2 == 0) ? "¦��" : "Ȧ��";
	    System.out.println(val1 + "��" + msg + "�Դϴ�.");
	}
}
