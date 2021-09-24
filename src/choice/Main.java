package choice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Manager m = new Manager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.추가 2.삭제3.목록 4.랜덤");
			String num = sc.nextLine();
			switch (num) {
			case "1":
				m.addmenu(); //메뉴추가
				break;
            case "2":
				m.deletemenu(); //메뉴삭제
				break;
            case "3":
				m.allmenu(); //메뉴목록
				break;
            case "4":
				m.randommenu(); //메뉴랜덤
				break;

			}
		}
	}

}
