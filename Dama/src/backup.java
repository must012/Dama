
public class backup {
	/*public void playchic() {
	System.out.println("짜잔! 알에서 닭이 태어 났습니다!");
	System.out.println(name + " 을(를) 잘 키워주세요!");
		
while(die!=1) {
		try{Thread.sleep(1000);}
		catch(InterruptedException e){}					//행동 한번 출력 후 1초 지연
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n" + "체력 : " + health + " \\" + " 포만감 : " + hungry + " \\" + " 기분 : " + emot + " \\"
		+  " 행운 : " + luck + " \\" + " 날짜 : " + day + " 일 째 " + growth);
		System.out.println("------------------------------------------------------------");
		System.out.println("1 : 운동		 	  2 : 밥주기		  3 : 놀아주기" + "\n\n\n\n");
		System.out.println(" 새" + "\n" + "모" + "\n" + "양" + "\n");
		System.out.println("4 : 도전!		 				  5 : 상태보기");
		System.out.println("------------------------------------------------------------");
		System.out.printf("무엇을 할까요? ");
		action = sc.nextInt();
		
		System.out.println("");
		
//------------------------------ 행동 스위치 시작 -----------------------------------------------------------------------------------

	switch(action) {
	case 1:		{			// ---------운동
	score += 10;
	dice += (int)(ran.nextInt(100)) - luck;
	if(dice<70) {
	if (health<=150){
		if (hungry >= 30 && emot >= 30) {
			
			health += (int)(ran.nextInt(9))+1;
			hungry -= (int)(ran.nextInt(4))+1;
			emot += (int)(ran.nextInt(2))+1;
			growth += (int)(ran.nextInt(2))+1;
		
			System.out.println("♬♬♬~ (" + name + "이(가) 건강해진것같다!)");}
		
		if(hungry < 30 || emot < 30) {
			
			if(hungry < 30) {
				
			health += (int)(ran.nextInt(6))+1;
			hungry -= (int)(ran.nextInt(4))+1;
			emot += (int)(ran.nextInt(1))+1;
			growth += (int)(ran.nextInt(2))+1;
			
			System.out.println(name + "가 배고파보인다");
		}	
			
			else if(emot < 30) {
			health += (int)(ran.nextInt(6))+1;
			hungry -= (int)(ran.nextInt(4))+1;
			emot += (int)(ran.nextInt(1))+1;
			growth += (int)(ran.nextInt(2))+1;
			
			System.out.println(name + "(이)랑 먼저 놀아줘야 할것같다...");
			}
		}					//포만감 외로움 낮음 if
		
		if(hungry < 20 && emot < 20) {
			health += (int)(ran.nextInt(3))+1;
			hungry -= (int)(ran.nextInt(3))+1;
			
			System.out.println(name + "의 상태에 신경을 쓰자...");
		}
	}						//체력 정상 if 끝
	dice = 0;}					//다이스 값 70 이하
	
	if(dice>=70) {
		array.playran += (ran.nextInt(1));				//array 클래스의 변수를 랜덤을 이용해 값을 지정
		
		System.out.printf(name + "이(가) 운동을 하는데 ");
		System.out.println(array.playSit[array.playran]);
		die = 1;
	}
	break;	}

case 2: {				//밥주기
	score += 10;
	dice += (int)(ran.nextInt(100)) - luck;
	if(dice<70) {
	if (hungry<=150){
		if (health >= 30 && emot >= 30) {
			
			health -= (int)(ran.nextInt(1))+1;
			hungry += (int)(ran.nextInt(9))+1;
			emot += (int)(ran.nextInt(2))+1;
			growth += (int)(ran.nextInt(2))+1;
		
		System.out.println("♪♪♪~ (" + name +"이(가) 좋아한다!)");	}
		
		if(health < 30 || emot < 30) {					
			if(health < 30) {
			health -= (int)(ran.nextInt(2))+1;
			hungry += (int)(ran.nextInt(9))+1;
			emot += (int)(ran.nextInt(1))+1;
			growth += (int)(ran.nextInt(2))+1;
			
			System.out.println(name + "이(가) 배고파 해요..");
		}	
			
			else if(emot < 30) {
			health -= (int)(ran.nextInt(2))+1;
			hungry += (int)(ran.nextInt(4))+1;
			emot += (int)(ran.nextInt(1))+1;
			growth += (int)(ran.nextInt(2))+1;
			
			System.out.println(name + "이(가) 외로워 해요...");
			}
		}					//건강 외로움 낮음
		
		if(health < 20 && emot < 20) {
			
			health -= (int)(ran.nextInt(3))+1;
			hungry += (int)(ran.nextInt(3))+1;
			
			System.out.println(name + "의 상태에 신경을 쓰자..");
		}
	}										//배고픔 150 이하 끝
	
	else if(hungry>150)	{
	System.out.println("더 주면 안되요!");
	if(j<=3)	{dcnt --;}
	j ++;									//강제로 먹이기의 거부 카운트 증가
	
	if(j>3)	{
		if(health >= 30 && emot >= 30)	{
			
			health -= (int)(ran.nextInt(4))+1;
			hungry += (int)(ran.nextInt(2))+1;
			emot -= (int)(ran.nextInt(3))+1;
			growth -= (int)(ran.nextInt(2))+1;
		
		System.out.println("(--;) (억지로 줬더니 " + name + "이(가) 싫어한다...)");
		
		j --;	}				// 나머지 수치가 정상일 때 억지로 먹이기
						
		if(health < 30|| emot < 30) {
			if(health>=20 || emot >=20) {
				
				health -= 5;
				hungry += 1;
				emot -= 4;
				growth -= 3;
				
				System.out.println("밥을 억지로 먹이는것보다 다른걸 먼저..");
				
				j--;	}						//체력과 외로움이 어느정도 될 때
			
			if(hungry < 20 || emot < 20) {
		
				health -= 6;
				emot -= 5;
				growth -= 4;
		
		System.out.println("이렇게 키우면 "+ name + "이(가) 죽을지도 모른다..");
		j--;	}				//거부 카운트
	}							//포만감 과다 else if
	}
dice = 0;}						//다이스 70 미만
	
	if(dice>=70) {
		System.out.println(name + "이(가) 밥을 먹다 그만...");
		die = 1;	}
	break;	}
	}

case 3:{											// 놀아주기
	
	score += 10;
	dice += (int)(ran.nextInt(100)) - luck;
	if(dice<70) {
	if(health > 30 && hungry > 30) {				//체력이나 배고픔이 부족하면 성장값이 적음
		
		emot += (int)(ran.nextInt(9))+1;
		hungry -= (int)(ran.nextInt(4))+1;
		health += (int)(ran.nextInt(4))+1;
		growth += (int)(ran.nextInt(2))+1;
					
		System.out.println("♩♩♩~ (" + name + "이(가) 기뻐하는 것 같다!)"); }
	
	if(health <= 30 || hungry<=30) {
		if(health <= 30) {
			hungry -= (int)(ran.nextInt(6))+1;
			emot += (int)(ran.nextInt(7))+1;
			health += (int)(ran.nextInt(3))+1;
			growth += (int)(ran.nextInt(1))+1;
		
		System.out.println("운동이 필요한것 같은데..");		}
		
		if(hungry <= 30) {
			hungry -= (int)(ran.nextInt(6))+1;
			emot += (int)(ran.nextInt(7))+1;
			health += (int)(ran.nextInt(3))+1;
			growth += (int)(ran.nextInt(1))+1;
			
		System.out.println("밥 먼저 줘야할것 같은데..");	}
	}					//영양 포만감 낮음 if
	dice = 0;	}		//dice 값 70 미만
	
	if(dice>=70) {
		System.out.println(name + "이(가) 놀다가 그만...");
		die = 1;	}
	
	break;	}					//스위치 3번(놀기) 끝

case 4 : {			// 가위 바위 보
	System.out.println("구석의 이상한 기계 : 제게 이기면 행운을 올려드리겠습니다!");
	System.out.println("1은 가위, 2는 바위, 3은 보 입니다!");
	System.out.println("준비하시고...");
	rsp = (int)(ran.nextInt(2));
	
	for(l=0;l<3;l++) {
	try{Thread.sleep(1000);}
	catch(InterruptedException e){}
	
	if(l==0) {
		System.out.print("가위!");	}
	if(l==1) {
		System.out.print("바위!");	}
	if(l==2) {
		System.out.println("보!");
		rspAn = sc.nextInt();	}
	}
		
	
	if(rsp==0) {
		if(rspAn==2) {
			System.out.println("축하합니다!! 이기셨네요!");
			System.out.println("(당신의 행운이 1 올랐다!)");
			luck ++;}
		if(rspAn!=2) {
			System.out.println("아쉽게 졌네요... 다음에 다시 해주세요!");	}
				}
	
	if(rsp==1) {
		if(rspAn==3) {
			System.out.println("축하합니다!! 이기셨네요!");
			System.out.println("(당신의 행운이 1올랐다!)");
			luck ++;}
		if(rspAn!=3) {
			System.out.println("아쉽게 졌네요... 다음에 다시 해주세요!");	}
			}
	
	if(rsp==2) {
		if(rspAn==1) {
			System.out.println("축하합니다!! 이기셨네요!");
			System.out.println("(당신의 행운이 1 올랐다!)");	
			luck ++;	}
			
		if(rspAn!=1) {
			System.out.println("아쉽게 졌네요... 다음에 다시 해주세요!");	}
			}
	health -= (int)(ran.nextInt(2));
	hungry -= (int)(ran.nextInt(2));
	emot -= (int)(ran.nextInt(2));
	
	break;	} // case 4 끝
	
case 5 : {						//스탯 확인
	
	System.out.println(array.chicLvl[glvl] + "의 단계인 " + name);
	
	if(health>100) {			//체력이 100보다 많을 때 출력
		System.out.println("건강 : 아픈곳없이 건강하다!");				}
	
	else if(health>=50 || health<=100) {	// 체력이 보통 상태일 때 출력
		System.out.println("건강 : 그냥저냥 괜찮아 보인다");				}
	
	else if(health<50) {					//체력이 적을 때 출력
		System.out.println("건강 : 너무 약해보인다...");			}
	
	if(hungry>100) {
		System.out.println("포만감 : 배불러 보인다!");			}
	
	else if(hungry>=50 || hungry<=100)
		System.out.println("포만감 : 괜찮아 보인다");
	
	else if(health<50) {					//포만감이 낮을 때 출력
		System.out.println("포만감 : 배고파한다...");			}
	
	if(emot>100) {						//외로움이 좋을 때 출력
		System.out.println("기분 : 기분이 좋아 보인다!");
		System.out.println("--------------------");} 
	
	else if(emot>=50 || emot<=100) {	//외로움이 보통일 때 출력
	System.out.println("기분 : 약간 쓸쓸해 보인다");
	System.out.println("--------------------");}
		
	else if(emot<50) {					//외로움이 나쁠 때 출력
	System.out.println("기분 : 나한테 화나 보인다...");
	System.out.println("--------------------");}
	dcnt --;
	break;	}

	default :	{ 
	dcnt --;
	System.out.println("다시 선택 해주세요.");
	break;	}		// 디폴트 끝
	}				//스위치 끝
		
	/*try{Thread.sleep(1000);}
	catch(InterruptedException e){}*/
		/*if(hungry<=0) {
			growth -= 5;
			
			System.out.println(name + "가 바싹 말라있어요..");
		}
		if(health<=0) {
			growth -= 5;
			
			System.out.println(name + "가 너무 앙상해요..");
		} 		// 특정 날짜가 지났을 때 치킨의 상태를 표시 해주지 덜컸다거나 말랐다거나 필요하다면 이걸 점수에 포함		
		
dcnt ++;
if(dcnt==5) {
	day ++;
	dcnt = 0;
	emot -= 10;
	health -= 10;
	hungry -= 10;
	
	System.out.println("하루가 지났어요!");	}

if(growth>=100) {									// 닭이 성장치를 달성 및 성장치 초기화
System.out.println(name + "이(가) 커졌어요!");
glvl ++;
j=0;			}

if (hungry<=0 || growth<=-1 || health<=0) {			// 게임오버
	die = 1;
	if(hungry<=0) {
		System.out.println(name + "가 굶어 죽었어요...");}
	if(growth<=-1) {
		System.out.println(name + "가 성장을 못해서 죽었어요...");}
	if(health<=0) {
		System.out.print(name + "가 불치병에 걸려서 죽었어요...");}
	}		//죽는 if 끝
	
}			//전체 while 반복 끝

System.out.println("\n" + "만든이 : 8조 이수재 전상현 윤을동");
System.out.println("감사합니다!");
}				//메소드 끝	 */

}
