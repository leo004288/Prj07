package ex01;

import java.util.Iterator;
import java.util.Objects;

class Member {
//	field
	private int    num;
	private String name;
	private String tel;
	
//	constructor
	public Member() {}

	public Member(int num, String name, String tel) {
		this.num = num;
		this.name = name;
		this.tel = tel;
	}

//	method 
	//toString
	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", tel=" + tel + "]";
	}

	//hashCode
	@Override
	public int hashCode() {
		return Objects.hash(name, num, tel);
	}

	//equals
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Member other = (Member) obj;
		return num == other.num;
//				&& Objects.equals(name, other.name);
	}
	
	
} //

public class TestMemeberArray {

	public static void main(String[] args) {
//		여러명의 정보를 입력받아 검색객체를 만들어 해당맴버를 찾기
		
//		Member m1 = new Member(1,"민지","010-1234-5678");
//		Member m2 = new Member(2,"하니","010-2345-6789");
//		Member m3 = new Member(3,"해린","010-9876-5432");
//		Member m4 = new Member(4,"혜인","");     // 빈문자
//		Member m5 = new Member(5,"다니엘","010-5959-1212");
//		Member m6 = new Member(6,"닝닝",null);   // null
		   
//		System.out.println(m1);
//		System.out.println(m2);
//		System.out.println(m3);
//		System.out.println(m4);
//		System.out.println(m5);
//		System.out.println(m6);
		
		Member [] mArr = new Member[6];
		mArr[0] = new Member(1,"민지","010-1234-5678");
		mArr[1] = new Member(2,"하니","010-2345-6789");
		mArr[2] = new Member(3,"해린","010-9876-5432");
		mArr[3] = new Member(4,"혜인","");    
		mArr[4] = new Member(5,"다니엘","010-5959-1212");
		mArr[5] = new Member(6,"닝닝",null);  
		
		for (Member member : mArr) {
			System.out.println(member);
		}
		System.out.println("---------------");
//		찾을 사람정보
		Member mem = new Member(7,null,null);
		
		boolean isFound = false;
		// == : 주소비교 -> .equals 재정의
		for (int i = 0; i < mArr.length; i++) {
			Member member = mArr[i];
//			System.out.println(member);	
//			System.out.println(mem);	
			if( member.equals(mem) ) {
				System.out.println(member);	
				isFound = true;
				break;
			}
		}
		if (isFound == false)
			System.out.println("X");
		
	} 

	
} //