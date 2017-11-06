import java.util.*;
public class Playdama {
	
	// 성장과 관련된 직접적 수치
	static int health = 100;	// 건강 지수
	static int hungry = 100;	// 배고픔 지수
	static int emotion = 100;	// 감정 지수
	static int luck = 0;		// 행운 지수
	static int growth = 0;		// 성장 지수
	static int growthLvl = 0; 	// 성장 레벨 
	static int day = 0;			// 날짜
	static int dayCount = 0;	// 피로도 카운터
	static int score = 0;		// 마지막에 표시 할 점수
	
	// 객체의 제어, 분기, 조건 등의 처리를 위한 변수
	int nameCho;					// 이름 Y/N 선택
	int animal;						// 동물 선택 질문의 합을 담을 변수
	int tur=0, pig=0, pen=0;  		// 각각 거북이,돼지,펭귄의 스택을 쌓을 변수
	static int action;				// 어떤 행동을 할지 행동 값 받는 변수
	static int dice = 0;			// 매번 행동 할 때 사고가 발생할지 안할지 값을 받을 변수
	static int die;					// 죽었을 때 받을 값
	static int repetiton=0;		// 동물 태어날 때 슬립함수 반복 카운터, 각 행동 실행시 반복 카운터
	static int eatDeny=0;			// 밥먹이기 거부 카운트
	static String name;				// 이름
	
	//가위바위보
	static int rsp = 0;				//가위바위보 값 입력 변수
	static int myRsp = 0;			//나의 가위바위보 값 입력
	static int l = 0;				//가위바위보 출력할 때 스레드(슬립) 반복 변수
	static int rspEnd = 0;			//가위바위보 종료 값 변수
	
	Scanner sca = new Scanner(System.in);
	Random ran = new Random();
	
	public void name() {		//이름 받기
		while(nameCho != 1)	{
			System.out.println("??? : 안녕하세요 주인님! 제 이름을 정해주세요!");
			name = sca.next();
			System.out.println("이 이름으로 할까요?" + "\n" + "1. 네! 2. 다시 정할래요!");		//이름 확인
			nameCho = sca.nextInt();
		
		switch(nameCho)	{				//선택에 따른 분기
			case 1 : break;
		
			case 2 : break;
			default : {
				while(nameCho != 1 && nameCho != 2) {
					System.out.println("제대로 번호를 선택해 주세요..");
					System.out.println("이 이름으로 할까요?" + "\n" + "1. 네! 2. 다시 정할래요!");
					nameCho = sca.nextInt();}
			break;	}
			}
		}				//while 끝
	}					// scanner 에서 next와 nextint의 매소드 처리방식이 다름
	
	public int animal(int a) {							//동물 종류 질문
		
		System.out.println("? : 주인님은 오늘 어떤 메뉴가 드시고 싶으신가요?" + "\n" + "1. 해물찜 2. 돼지갈비 3. 치킨");
		animal = sca.nextInt();
			if(animal==1)
				tur++;
			if(animal==2)
				pig++;
			if(animal==3)
				pen++;
		animal=0;
		
		System.out.println("? : 키우는 동물의 100일날 어떤 케익을 주고 싶으세요?" + "\n" + "1. 지렁이케익 2. 물고기케익 3. 당근케익");
		
		animal = sca.nextInt();
			if(animal==1)
				pen++;
			if(animal==2)
				tur++;
			if(animal==3)
				pig++;
		animal=0;
		
		System.out.println("? : 동물 하면 떠오르는 부위는?" + "\n" + "1. 말려있는 꼬리 2. 앙증맞은 부리 3. 단단한 껍질");
		animal = sca.nextInt();
			if(animal==1)
				pig++;
			if(animal==2)
				pen++;
			if(animal==3)
				tur++;

			for(repetiton=0;repetiton<3;repetiton++) {
				try{Thread.sleep(1000);}
				catch(InterruptedException e){}
					System.out.println("...");}
		
		repetiton = 0;
		
			if(tur>=2) 
				a+=1;	
		
			if(pen>=2) 
				a+=2;	
		
			if(pig>=2)
				a+=3;
		
			if(tur==1&&pen==1&&pig==1) {
				a  += (int)(ran.nextInt(2))+1;	}			//만약 질문이 동물값을 1개씩 저장하게 선택된다면 랜덤실행
		
		return a;									//호출한 곳에 a값을 돌려줌
	}
	
}
