package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {

		User[] info = new User[3];

		User uc01 = new Customer("jws", "j1234", "정우성", 1000);
		User uc02 = new Customer("yjs", "y2345", "이효리", 2000);
		User ue01 = new Employee("marster", "m7788", "운영자", 5000000);

		info[0] = uc01;
		info[1] = uc02;
		info[2] = ue01;

		for (int i = 0; i < info.length; i++) {
			info[i].showInfo();
		}

		System.out.println(info[2].getName() + "의 월급은 " + ((Employee) info[2]).getSalary() + "원 입니다.");
	}

}
