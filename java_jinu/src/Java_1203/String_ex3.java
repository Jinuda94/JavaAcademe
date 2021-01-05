package Java_1203;

import java.util.Scanner;
import java.util.Random;

public class String_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int monster_hp = 100;
		int Human_hp = 100;
	
		while(true){
		System.out.println("직업을 선택하세요.");
		System.out.println("1:전사 2:엘프 3:마법사");
		int job_num = sc.nextInt();
		System.out.println("무기를 선택하세요.");
		System.out.println("1:Sword 2:Axe 3:Hammer");
		int weapon_num = sc.nextInt();
		System.out.println("독을 바르시겠습니다? 1:바른다. 2:안바른다.");
		int poison_num = sc.nextInt();
		String weapon = "";
		int Attk = 0;
		int str = 0;
		
		switch(job_num) {
		case 1: str = 10; break;
		case 2: str = 8; break;
		case 3: str = 6; break;
		}//직업당 str 수치 부여
		
		Attk= Attk+str/2; //직업당 공격력 추가
		
		if(poison_num==1) {
			Attk = Attk+2;
		}//독 데미지 추가

		if (weapon_num == 1) {
			weapon = "Sword";
			Attk = Attk+10;
		} else if (weapon_num == 2) {
			weapon = "Axe";
			Attk = Attk+12;
		} else if (weapon_num == 3) {
			weapon = "Hammer";
			Attk = Attk+15;
		}//무기 데미지 추가
		
		System.out.println("현재 총 공격력은: "+Attk+"입니다.");
		
		System.out.println("1:공격 2:방어");
		int AorG_num = sc.nextInt();
		
		double h_miss = Math.random();
		double m_miss = Math.random();
		double Guard = Math.random();
		
		String a = "Sword";
		String b = "Axe";
		String c = "Hammer";
			
		if(AorG_num==1) {
			if(m_miss>0.6) {
				Human_hp = Human_hp - 10;
			}
			if (weapon.equals(a)) {
				if(h_miss>0.2){
					monster_hp = monster_hp - Attk;
					System.out.println("공격이 성공하셨습니다.");
				} else {
				monster_hp = monster_hp - 0;
				System.out.println("공격이 실패하셨습니다.");
				}
			} else if (weapon.equals(b)) {
				if(h_miss>0.4){
					monster_hp = monster_hp - Attk;
					System.out.println("공격이 성공하셨습니다.");
				} else {
					monster_hp = monster_hp - 0;
					System.out.println("공격이 실패하셨습니다.");
				}
			} else if (weapon.equals(c)) {
				if(h_miss>0.7){
					monster_hp = monster_hp - Attk;
					System.out.println("공격이 성공하셨습니다.");
				} else {
					monster_hp = monster_hp - 0;
					System.out.println("공격이 실패하셨습니다.");
				}
			}
		}
		
		if(AorG_num==2) {
			if(m_miss>0.6||Guard>0.2) {
				Human_hp = Human_hp - 0;
				System.out.println("방어가 성공하셨습니다.");
			} else {
				Human_hp = Human_hp - 10;
				System.out.println("방어가 실패하셨습니다.");
			}
			
			}
		
		
		System.out.println("현재 몬스터의 hp는 "+monster_hp);
		System.out.println("현재 나의 hp는 "+Human_hp);
		
		if(monster_hp<=0) {
			System.out.println("몬스터가 쓰러졌습니다.");
			break;
		} else if(Human_hp<=0) {
			System.out.println("몬스터에게 패배하셨습니다.");
			break;
		}
		
	}
  }

}
