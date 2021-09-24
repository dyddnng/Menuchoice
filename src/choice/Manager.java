package choice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
	List<Food> list;
	Scanner sc = new Scanner(System.in);

	public Manager() {
		list = new ArrayList<Food>();
	}

	// 메뉴추가
	public void addmenu() {
		System.out.println("메뉴를 추가하겠습니다.");
		System.out.println("음식명을 입력하세요");
		String name = sc.nextLine();
		System.out.println("맛을 추가하세요");
		String flavor = sc.nextLine();
		System.out.println("사이즈를 추가하세요");
		String size = sc.nextLine();
		System.out.println("음식번호를 입력하세요");
		int num = sc.nextInt();
		sc.nextLine();

		list.add(new Food(name, flavor, size, num));
	}

	// 메뉴삭제
	public void deletemenu() {
		System.out.println("메뉴를 삭제하겠습니다");
		System.out.println("음식명을 입력하세요");
		String name = sc.nextLine();
		System.out.println("맛을 입력하세요");
		String flavor = sc.nextLine();
		int idx = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name) && list.get(i).getFlavor().equals(flavor)) {
				list.remove(i);
				idx = i;
				System.out.println("메뉴삭제 성공");
				break;
			}

		}

		if (idx == -1) {
			System.out.println("메뉴삭제가 되지 않았습니다.");
		}
	}

	// 메뉴 목록
	public void allmenu() {
		System.out.println("메뉴 목록 모두 출력");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

	// 메뉴 랜덤으로 추첨 //아오~~~~~~~~!!!!!!!!!!!!!!!
	public void randommenu() {
		System.out.println("랜덤으로 메뉴 출력");
		int randomNum = (int) (Math.random() * list.size());
		System.out.println(list.get(randomNum).toString());

	}

}
