package com.iu.s1.same;

public class Square {
	
	int garo;
	int sero;
	
	
	public boolean same(Square s) {
		 if(this.garo==s.garo && this.sero==s.sero) {
			 return true;
		 }else {
			 return false;
		 }
		//멤버변수 garo랑 매개변수로 받은 객체의 garo같고
		//멤버변수 sero랑 매개변수로 받은 객체의 sero같으면 true 리턴
		//하나라도 틀리면 false를 리턴
		//this
	}

}

