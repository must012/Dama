import java.util.*;

public class Playpenguin {				
	
	public void playpen() {
		Penguinpic penpic = new Penguinpic();	//펭귄 사진을 받아올 객체 생성	
		
		Scanner scan = new Scanner(System.in);				
		Random ran = new Random();
		
		System.out.println("짜잔! 알에서 새끼 펭귄이 태어 났습니다!");
		System.out.println(Playdama.name + " 을(를) 잘 키워주세요!");
			
	while(Playdama.die==0&&Playdama.growthLvl!=3) {				//die수치가 0 이거나 growthLvl(성장레벨)이 3이 아닌동안 반복)
		
		try{Thread.sleep(1000);}
		catch(InterruptedException e){}					//행동 한번 출력 후 1초 지연
			
		System.out.println("\n" + "체력 : " + Playdama.health + "   포만감 : " + Playdama.hungry + "   기분 : " + Playdama.emotion +
		"   행운 : " + Playdama.luck + "   날짜 : " + Playdama.day + " 일 째 " + Playdama.growth);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("1 : 운동		   2 : 밥주기		  	 3 : 놀아주기");
			
		if(Playdama.growthLvl == 0){					//성장 1단계일 때 출력될 그림
			if(Playdama.emotion >= 120)			//기분이 높으면 해피
				penpic.level1Happy();
			else if(Playdama.emotion >= 50 && Playdama.hungry < 50)		//기분은 괜찮은데 배가고프면 헝그리
				penpic.level1Hungry();
			else if(Playdama.emotion >= 50 && Playdama.hungry >= 50)		//기분이 보통이면 노발
				penpic.level1Normal();
			else if(Playdama.emotion <= 50)
				penpic.level1Angry();				//기분이 낮으면 앵그리
		
			}
		
		if(Playdama.growthLvl == 1){					//성장 2단계일 때 출력될 그림
			if(Playdama.emotion >= 120)
				penpic.level2Happy();
			else if(Playdama.emotion >= 50 && Playdama.hungry < 50)
				penpic.level2Hungry();
			else if(Playdama.emotion >= 50 && Playdama.hungry >= 50)
				penpic.level2Normal();
			else if(Playdama.emotion <= 50)
				penpic.level2Angry();				
		}
		
		if(Playdama.growthLvl == 2){					//성장 3단계일 때 출력될 그림
			if(Playdama.emotion >= 120)
				penpic.level3Happy();
			else if(Playdama.emotion >= 50 && Playdama.hungry < 50)
				penpic.level3Hungry();
			else if(Playdama.emotion >= 50 && Playdama.hungry >= 50)
				penpic.level3Normal();
			else if(Playdama.emotion <= 50)
				penpic.level3Angry();				
		}
		
		System.out.println("4 : 도전!		 				 5 : 상태보기");
		System.out.println("---------------------------------------------------------------------");
		System.out.printf("무엇을 할까요? ");
		
		Playdama.action = scan.nextInt();
		
		System.out.println("");
			
		if(Playdama.emotion<=20) {
			Playdama.action=0;
			Playdama.action += (int)(ran.nextInt(3)+1);
			System.out.println("헉! "+ Playdama.name + "의 기분이 나빠서 마음대로 행동했다!");
		}
		
//------------------------------ 행동 스위치 시작 -----------------------------------------------------------------------------------
		switch(Playdama.action) {
			case 1:		{				// ---------운동
				Playdama.score += 10;
				Playdama.dice += (int)(ran.nextInt(100)) - Playdama.luck;	//다이스 값 주기
			
				Situationpic.health();	//Situation 클래스의 운동하는 그림 출력
				
				if(Playdama.dice<80) {		//다이스 값에 따른 출력
		 
					if (Playdama.health<=150){
			
						if (Playdama.hungry >= 30 && Playdama.emotion >= 30) {
				
							Playdama.health += (int)(ran.nextInt(9))+1;
							Playdama.hungry -= (int)(ran.nextInt(4))+1;
							Playdama.emotion += (int)(ran.nextInt(2))+1;
							Playdama.growth += (int)(ran.nextInt(2))+1;
			
							System.out.println("♬♬♬~ (" + Playdama.name + "이(가) 건강해진것같다!)");}
			
						if(Playdama.hungry < 30 || Playdama.emotion < 30) {
				
							if(Playdama.hungry < 30) {
					
								Playdama.health += (int)(ran.nextInt(6))+1;
								Playdama.hungry -= (int)(ran.nextInt(4))+1;
								Playdama.emotion += (int)(ran.nextInt(1))+1;
								Playdama.growth += (int)(ran.nextInt(2))+1;
				
								System.out.println(Playdama.name + "가 배고파보인다");	}	
				
							else if(Playdama.emotion < 30) {
								Playdama.health += (int)(ran.nextInt(6))+1;
								Playdama.hungry -= (int)(ran.nextInt(4))+1;
								Playdama.emotion += (int)(ran.nextInt(1))+1;
								Playdama.growth += (int)(ran.nextInt(2))+1;
				
								System.out.println(Playdama.name + "(이)랑 먼저 놀아줘야 할것같다...");	}
							}					//포만감 외로움 낮음 if 끝
			
						if(Playdama.hungry < 20 && Playdama.emotion < 20) {
							
							Playdama.health += (int)(ran.nextInt(3))+1;
							Playdama.hungry -= (int)(ran.nextInt(3))+1;
				
							System.out.println(Playdama.name + "의 상태에 신경을 쓰자...");		}
						}								//체력 정상 if 끝
						Playdama.dice = 0;	}			//다이스 값 80 이하 끝
		
				if(Playdama.dice>=80) {
					Array.healthRan += (ran.nextInt(2));				//array 클래스의 변수를 랜덤을 이용해 출력되는 문장 설정
			
					System.out.printf(Playdama.name + "이(가) 운동을 하는데 ");
					System.out.println(Array.healthSituation[Array.healthRan]);
					Playdama.die = 1;	}							//반복문 탈출
				break;	}
	
	case 2: {				//밥주기
		Playdama.score += 10;
		Playdama.dice += (int)(ran.nextInt(100)) - Playdama.luck;	//다이스 값 지정
		
		Situationpic.eat();		//Situationpic 의 먹는 장면 출력
		
		if (Playdama.dice<80) {
			
			if (Playdama.hungry<=150){
				
				if (Playdama.health >= 30 && Playdama.emotion >= 30) {
				
					Playdama.health -= (int)(ran.nextInt(1))+1;
					Playdama.hungry += (int)(ran.nextInt(9))+1;
					Playdama.emotion += (int)(ran.nextInt(2))+1;
					Playdama.growth += (int)(ran.nextInt(2))+1;
			
					System.out.println("♪♪♪~ (" + Playdama.name +"이(가) 맛있게 먹었다!)");	}
			
				if (Playdama.health < 30 || Playdama.emotion < 30) {					
					
					if (Playdama.health < 30) {
						Playdama.health -= (int)(ran.nextInt(2))+1;
						Playdama.hungry += (int)(ran.nextInt(9))+1;
						Playdama.emotion += (int)(ran.nextInt(1))+1;
						Playdama.growth += (int)(ran.nextInt(2))+1;
				
						System.out.println(Playdama.name + "(이)에게 밥을 더 줘야겠다...");	}	
				 
					else if(Playdama.emotion < 30) {

						Playdama.health -= (int)(ran.nextInt(2))+1;
						Playdama.hungry += (int)(ran.nextInt(4))+1;
						Playdama.emotion += (int)(ran.nextInt(1))+1;
						Playdama.growth += (int)(ran.nextInt(2))+1;
				
						System.out.println(Playdama.name + "이(가) 외로워 해요...");	}
					}					//건강 외로움 낮음 if 끝
			
				if(Playdama.health < 20 && Playdama.emotion < 20) {
				
					Playdama.health -= (int)(ran.nextInt(3))+1;
					Playdama.hungry += (int)(ran.nextInt(3))+1;
				
					System.out.println(Playdama.name + "의 상태에 신경을 쓰자..");	}
				}										//배고픔 150 이하 끝
		
			else if(Playdama.hungry>150)	{
			
				System.out.println("더 주면 안돼요!");
		
				if(Playdama.eatDeny<=3)	{Playdama.dayCount --;}
				
				Playdama.eatDeny ++;								//강제로 먹이기의 거부 카운트 증가
		
	
				if(Playdama.eatDeny>3)	{
			
					if(Playdama.health >= 30 && Playdama.emotion >= 30)	{
				
						Playdama.health -= (int)(ran.nextInt(4))+1;
						Playdama.hungry += (int)(ran.nextInt(2))+1;
						Playdama.emotion -= (int)(ran.nextInt(3))+1;
						Playdama.growth -= (int)(ran.nextInt(2))+1;
						
						System.out.println("(--;) (억지로 줬더니 " + Playdama.name + "이(가) 싫어한다...)");
			
						Playdama.eatDeny --;	}				// 나머지 수치가 정상일 때 억지로 먹이기
							
					if(Playdama.health < 30|| Playdama.emotion < 30) {
				
						if(Playdama.health>=20 || Playdama.emotion >=20) {
					
							Playdama.health -= 5;
							Playdama.hungry += 1;
							Playdama.emotion -= 4;
							Playdama.growth -= 3;
					
							System.out.println("밥을 억지로 먹이는것보다 다른걸 먼저..");
					
							Playdama.eatDeny--;	}						//체력과 외로움이 어느정도 될 때
				
						if(Playdama.hungry < 20 || Playdama.emotion < 20) {
							
							Playdama.health -= 6;
							Playdama.emotion -= 5;
							Playdama.growth -= 4;
			
							System.out.println("이렇게 키우면 "+ Playdama.name + "이(가) 죽을지도 모른다..");
							Playdama.eatDeny--;	}				//거부 카운트
					}										//포만감 과다 else if
				}
			}
			Playdama.dice = 0;		//다이스 80 미만 끝
		}
		
			if(Playdama.dice>=80) {				
				
				Array.eatRan += (ran.nextInt(2));				//array 클래스의 변수를 랜덤을 이용해 값을 호출
			
				System.out.printf(Playdama.name + "이(가) 밥을 먹는데 ");
				System.out.println(Array.eatSituation[Array.eatRan]);
				Playdama.die = 1;	}
			break;	}	//전체 반복문 종료
		
	
	case 3:{											// 놀아주기
		
		Playdama.score += 10;
		Playdama.dice += (int)(ran.nextInt(100)) - Playdama.luck;
		
		Situationpic.play();		//Situationpic 의 먹는 장면 출력
		
		if (Playdama.dice<80) {
			
			if (Playdama.health > 30 && Playdama.hungry > 30) {				//체력이나 배고픔이 부족하면 성장값이 적음
			
				Playdama.emotion += (int)(ran.nextInt(9))+1;
				Playdama.hungry -= (int)(ran.nextInt(4))+1;
				Playdama.health += (int)(ran.nextInt(4))+1;
				Playdama.growth += (int)(ran.nextInt(2))+1;
						
				System.out.println("♩♩♩~ (" + Playdama.name + "이(가) 기뻐하는 것 같다!)"); }
		
			if(Playdama.health <= 30 || Playdama.hungry<=30) {
				
				if(Playdama.health <= 30) {
					
					Playdama.hungry -= (int)(ran.nextInt(6))+1;
					Playdama.emotion += (int)(ran.nextInt(7))+1;
					Playdama.health += (int)(ran.nextInt(3))+1;
					Playdama.growth += (int)(ran.nextInt(1))+1;
			
					System.out.println("운동이 필요한것 같은데..");		}
			
				if(Playdama.hungry <= 30) {
				
					Playdama.hungry -= (int)(ran.nextInt(6))+1;
					Playdama.emotion += (int)(ran.nextInt(7))+1;
					Playdama.health += (int)(ran.nextInt(3))+1;
					Playdama.growth += (int)(ran.nextInt(1))+1;
				
					
					System.out.println("밥 먼저 줘야할것 같은데..");	}
				}							//영양 포만감 낮음 if
			
			Playdama.dice = 0;	}		//dice 값 80 미만 끝
		
		if(Playdama.dice>=80) {							//다이스 80 미만
			
			Array.eatRan += (ran.nextInt(2));				//array 클래스의 변수를 랜덤을 이용해 값을 호출
		
			System.out.printf(Playdama.name + "(이)와 함께 노는데 ");
			System.out.println(Array.playSituation[Array.playRan]);
			Playdama.die = 1;	}
		
		break;	}					//스위치 3번(놀기) 끝

	case 4 : {			// 가위 바위 보
		
		System.out.println("구석의 이상한 기계 : 제게 이기면 행운을 올려드리겠습니다!");
		System.out.println("1은 가위, 2는 바위, 3은 보 입니다!");
		System.out.println("준비하시고...");
		
		while(Playdama.rspEnd == 0) {
			Playdama.rsp = 0;
			Playdama.rsp = (int)(ran.nextInt(3)+1);
		for(Playdama.l=0;Playdama.l<3;Playdama.l++) {
			
			try{Thread.sleep(1000);}			//가위 바위 보 의 출력에 딜레이를 주는 슬립
			catch(InterruptedException e){}
		
		if(Playdama.l==0)
			System.out.print("가위!");
		
		if(Playdama.l==1)
			System.out.print("바위!");
		
		if(Playdama.l==2)
			System.out.println("보!");
		
			Playdama.myRsp = scan.nextInt();	
		}
										
		if(Playdama.rsp==1) {			//컴퓨터의 가위 = 1, 바위 = 2, 보 = 3
			if(Playdama.myRsp==2) {
				System.out.println("축하합니다!! 이기셨네요!");
				System.out.println("(당신의 행운이 1 올랐다!)");
				Playdama.luck ++;
				Playdama.rspEnd= 1;	} 
			
			if(Playdama.myRsp==1) {
				System.out.println("비겼으니 다시!");	
				Playdama.rspEnd= 0;	}
				
			if(Playdama.myRsp==3) {
				System.out.println("아쉽게 졌네요... 다음에 다시 해주세요!");	
				Playdama.rspEnd= 1;	}
		}							//가위바위보 IF 끝
		
		if(Playdama.rsp==2) {			//컴퓨터의 가위 = 1, 바위 = 2, 보 = 3
			if(Playdama.myRsp == 3) {
				System.out.println("축하합니다!! 이기셨네요!");
				System.out.println("(당신의 행운이 1올랐다!)");
				Playdama.luck ++;
				Playdama.rspEnd= 1;	}
			
			if(Playdama.myRsp == 2) {
				System.out.println("비겼으니 다시!");	
				Playdama.rspEnd= 0;	}
			
			if(Playdama.myRsp == 1) {
				System.out.println("아쉽게 졌네요... 다음에 다시 해주세요!");
				Playdama.rspEnd= 1;	}
		}
	
		if(Playdama.rsp==3) {			//컴퓨터의 가위 = 1, 바위 = 2, 보 = 3
			if(Playdama.myRsp==1) {
				System.out.println("축하합니다!! 이기셨네요!");
				System.out.println("(당신의 행운이 1 올랐다!)");	
				Playdama.luck ++;
				Playdama.rspEnd= 1;	}
				
			if(Playdama.myRsp!=2) {
				System.out.println("아쉽게 졌네요... 다음에 다시 해주세요!");	
				Playdama.rspEnd= 1;	}
		
			if(Playdama.myRsp!=3) {
				System.out.println("(비겼으니 다시!)");	
				Playdama.rspEnd= 0;	}
			}	
		}								//WHILE 문 끝
		
		Playdama.health -= (int)(ran.nextInt(5)+1);
		Playdama.hungry -= (int)(ran.nextInt(5)+1);
		Playdama.emotion -= (int)(ran.nextInt(5)+1);
		Playdama.rspEnd= 0;			//다음 가위 바위 보를 위한 값 초기화
		break;	}	// case 4 끝
		
case 5 : {						//스탯 확인
		
		System.out.println(Array.penLvl[Playdama.growthLvl] + "의 단계인 " + Playdama.name);
		
		if(Playdama.health>100) {			//체력이 100보다 많을 때 출력
			System.out.println("건강 : 아픈곳없이 건강하다!");				}
		
		else if(Playdama.health>=50 || Playdama.health<=100) {	// 체력이 보통 상태일 때 출력
			System.out.println("건강 : 그냥저냥 괜찮아 보인다");				}
		
		else if(Playdama.health<50) {					//체력이 적을 때 출력
			System.out.println("건강 : 너무 약해보인다...");			}
		
		if(Playdama.hungry>100) {
			System.out.println("포만감 : 배불러 보인다!");			}
		
		else if(Playdama.hungry>=50 || Playdama.hungry<=100)
			System.out.println("포만감 : 괜찮아 보인다");
		
		else if(Playdama.health<50) {					//포만감이 낮을 때 출력
			System.out.println("포만감 : 배고파한다...");			}
		
		if(Playdama.emotion>100) {						//외로움이 좋을 때 출력
			System.out.println("기분 : 기분이 좋아 보인다!");
			System.out.println("--------------------");} 
		
		else if(Playdama.emotion>=50 || Playdama.emotion<=100) {	//외로움이 보통일 때 출력
			System.out.println("기분 : 약간 쓸쓸해 보인다");
			System.out.println("--------------------");}
			
		else if(Playdama.emotion<50) {					//외로움이 나쁠 때 출력
			System.out.println("기분 : 나한테 화나 보인다...");
			System.out.println("--------------------");}
			Playdama.dayCount --;
		break;	}

		default :	{ 
			Playdama.dayCount --;
		System.out.println("다시 선택 해주세요.");
		break;	}		// 디폴트 끝
		}				//스위치 끝
			
		Playdama.dayCount ++;		//행동을 끝날 때마다 데이카운트 증가
		
	if(Playdama.dayCount==5) {		//데이카운트가 5가 될 때마다 하루가 지나며 수치에 영향
		
		Playdama.day ++;
		Playdama.dayCount = 0;	
		Playdama.emotion -= 10;
		Playdama.health -= 10;
		Playdama.hungry -= 10;
		
		System.out.println("이제 잘 시간이에요! 안녕히 주무세요...");
		Situationpic.sleep();		//Situationpic 의 자는 장면 출력
		}
	
	if (Playdama.growth>=((Playdama.growthLvl+1)*100)) {									// 닭이 성장치를 달성 및 성장치 초기화
		
		System.out.println(Playdama.name + "이(가) 커졌어요!");
		Playdama.growthLvl++;
		Playdama.eatDeny=0;
		Playdama.score+=1000; }	//일정 성장치를 달성할 때 마다 성장도 증가 및 점수 추가
	
	if (Playdama.hungry<=0 || Playdama.growth<=-1 || Playdama.health<=0) {			// 베드 엔딩
		
		Playdama.die = 1;
			if(Playdama.hungry<=0) {
				System.out.println(Playdama.name + "가 굶어서 그만...");	}
			if(Playdama.growth<=-1) {
				System.out.println(Playdama.name + "에게 신경을 못써서 그만...");	}
			if(Playdama.health<=0) {
				System.out.print(Playdama.name + "가 불치병에 걸려서 그만...");	}
	}		//죽는 if 끝
	
	if (Playdama.growthLvl==3) {	//성장도의 달성으로 게임 끝
		System.out.println("축하드립니다!" + Playdama.name + "가 완전히 다 커서 독립을 했어요!");
		System.out.println(Playdama.name + ": 저도 꼭 주인님 같이 되고싶어요! \n" + "그동안 감사했습니다..ㅠㅠ");	} //굿 엔딩 if 끝
	}			//전체 while 반복 끝
	}				//메소드 끝
}
