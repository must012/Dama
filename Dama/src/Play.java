/**
 * 다마고치 만들기
 * @version 0.9 2017-10-18
 * 조장 이수재
 * 조원 전상현 윤을동
 */

public class Play {
	
	public static void main(String[] args) {
		
		Playdama dama = new Playdama();					//이름을 받을 객체 생성
		Playpenguin pen = new Playpenguin();			//펭귄 객체 생상
		PlayPig pig = new PlayPig();					//돼지 객체 생성
		Playturtle tur = new Playturtle();				//거북이 객체 생성
		Situationpic situation = new Situationpic();	//상황 그림을 받을 객체 생성

		int animal;										//동물선택값을 받을 변수
		int i;
		
		for(i=0;i<4;i++) {
		try{Thread.sleep(1500);}
		
		catch(InterruptedException e){}
			if(i==0) {
				System.out.println("피곤한 공부를 마치고 집에 왔을 때");
			}
			if(i==1) {
				System.out.println("문앞엔 왠 상자가 하나 있었고");
			}
			if(i==2) {
				System.out.println("그 안에는 왠지 모를 알이 하나 있었다");
			}
			if(i==3) {
				System.out.println("이게 뭔가 하고 그걸 들어 올렸을 때...");
			}
		}
		
		dama.name();									// 이름 정하기
		
		animal = dama.animal(0);						//반환값을 animal에 저장
		
		try{Thread.sleep(1000);}
			catch(InterruptedException e){}
		
		if(animal==1)
			tur.playtur();								//animal 의 값에 따라 거북이/펭귄/돼지 실행
		
		if(animal==2)
			pen.playpen();
		
		if(animal==3)
			pig.playpig();			
			
		System.out.println("\n" + "만든이 : 8조 이수재 전상현 윤을동");
		System.out.println("달성한 " + Playdama.name + "의 최대 단계 = " + Playdama.growthLvl);
		System.out.println("이번 게임에서 획득한 점수 = " + Playdama.score);
		System.out.println("감사합니다!");
 }
}