import java.util.*;

public class Playpenguin {				
	
	public void playpen() {
		Penguinpic penpic = new Penguinpic();	//��� ������ �޾ƿ� ��ü ����	
		
		Scanner scan = new Scanner(System.in);				
		Random ran = new Random();
		
		System.out.println("¥��! �˿��� ���� ����� �¾� �����ϴ�!");
		System.out.println(Playdama.name + " ��(��) �� Ű���ּ���!");
			
	while(Playdama.die==0&&Playdama.growthLvl!=3) {				//die��ġ�� 0 �̰ų� growthLvl(���巹��)�� 3�� �ƴѵ��� �ݺ�)
		
		try{Thread.sleep(1000);}
		catch(InterruptedException e){}					//�ൿ �ѹ� ��� �� 1�� ����
			
		System.out.println("\n" + "ü�� : " + Playdama.health + "   ������ : " + Playdama.hungry + "   ��� : " + Playdama.emotion +
		"   ��� : " + Playdama.luck + "   ��¥ : " + Playdama.day + " �� ° " + Playdama.growth);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("1 : �		   2 : ���ֱ�		  	 3 : ����ֱ�");
			
		if(Playdama.growthLvl == 0){					//���� 1�ܰ��� �� ��µ� �׸�
			if(Playdama.emotion >= 120)			//����� ������ ����
				penpic.level1Happy();
			else if(Playdama.emotion >= 50 && Playdama.hungry < 50)		//����� �������� �谡������ ��׸�
				penpic.level1Hungry();
			else if(Playdama.emotion >= 50 && Playdama.hungry >= 50)		//����� �����̸� ���
				penpic.level1Normal();
			else if(Playdama.emotion <= 50)
				penpic.level1Angry();				//����� ������ �ޱ׸�
		
			}
		
		if(Playdama.growthLvl == 1){					//���� 2�ܰ��� �� ��µ� �׸�
			if(Playdama.emotion >= 120)
				penpic.level2Happy();
			else if(Playdama.emotion >= 50 && Playdama.hungry < 50)
				penpic.level2Hungry();
			else if(Playdama.emotion >= 50 && Playdama.hungry >= 50)
				penpic.level2Normal();
			else if(Playdama.emotion <= 50)
				penpic.level2Angry();				
		}
		
		if(Playdama.growthLvl == 2){					//���� 3�ܰ��� �� ��µ� �׸�
			if(Playdama.emotion >= 120)
				penpic.level3Happy();
			else if(Playdama.emotion >= 50 && Playdama.hungry < 50)
				penpic.level3Hungry();
			else if(Playdama.emotion >= 50 && Playdama.hungry >= 50)
				penpic.level3Normal();
			else if(Playdama.emotion <= 50)
				penpic.level3Angry();				
		}
		
		System.out.println("4 : ����!		 				 5 : ���º���");
		System.out.println("---------------------------------------------------------------------");
		System.out.printf("������ �ұ��? ");
		
		Playdama.action = scan.nextInt();
		
		System.out.println("");
			
		if(Playdama.emotion<=20) {
			Playdama.action=0;
			Playdama.action += (int)(ran.nextInt(3)+1);
			System.out.println("��! "+ Playdama.name + "�� ����� ������ ������� �ൿ�ߴ�!");
		}
		
//------------------------------ �ൿ ����ġ ���� -----------------------------------------------------------------------------------
		switch(Playdama.action) {
			case 1:		{				// ---------�
				Playdama.score += 10;
				Playdama.dice += (int)(ran.nextInt(100)) - Playdama.luck;	//���̽� �� �ֱ�
			
				Situationpic.health();	//Situation Ŭ������ ��ϴ� �׸� ���
				
				if(Playdama.dice<80) {		//���̽� ���� ���� ���
		 
					if (Playdama.health<=150){
			
						if (Playdama.hungry >= 30 && Playdama.emotion >= 30) {
				
							Playdama.health += (int)(ran.nextInt(9))+1;
							Playdama.hungry -= (int)(ran.nextInt(4))+1;
							Playdama.emotion += (int)(ran.nextInt(2))+1;
							Playdama.growth += (int)(ran.nextInt(2))+1;
			
							System.out.println("�ݢݢ�~ (" + Playdama.name + "��(��) �ǰ������Ͱ���!)");}
			
						if(Playdama.hungry < 30 || Playdama.emotion < 30) {
				
							if(Playdama.hungry < 30) {
					
								Playdama.health += (int)(ran.nextInt(6))+1;
								Playdama.hungry -= (int)(ran.nextInt(4))+1;
								Playdama.emotion += (int)(ran.nextInt(1))+1;
								Playdama.growth += (int)(ran.nextInt(2))+1;
				
								System.out.println(Playdama.name + "�� ����ĺ��δ�");	}	
				
							else if(Playdama.emotion < 30) {
								Playdama.health += (int)(ran.nextInt(6))+1;
								Playdama.hungry -= (int)(ran.nextInt(4))+1;
								Playdama.emotion += (int)(ran.nextInt(1))+1;
								Playdama.growth += (int)(ran.nextInt(2))+1;
				
								System.out.println(Playdama.name + "(��)�� ���� ������ �ҰͰ���...");	}
							}					//������ �ܷο� ���� if ��
			
						if(Playdama.hungry < 20 && Playdama.emotion < 20) {
							
							Playdama.health += (int)(ran.nextInt(3))+1;
							Playdama.hungry -= (int)(ran.nextInt(3))+1;
				
							System.out.println(Playdama.name + "�� ���¿� �Ű��� ����...");		}
						}								//ü�� ���� if ��
						Playdama.dice = 0;	}			//���̽� �� 80 ���� ��
		
				if(Playdama.dice>=80) {
					Array.healthRan += (ran.nextInt(2));				//array Ŭ������ ������ ������ �̿��� ��µǴ� ���� ����
			
					System.out.printf(Playdama.name + "��(��) ��� �ϴµ� ");
					System.out.println(Array.healthSituation[Array.healthRan]);
					Playdama.die = 1;	}							//�ݺ��� Ż��
				break;	}
	
	case 2: {				//���ֱ�
		Playdama.score += 10;
		Playdama.dice += (int)(ran.nextInt(100)) - Playdama.luck;	//���̽� �� ����
		
		Situationpic.eat();		//Situationpic �� �Դ� ��� ���
		
		if (Playdama.dice<80) {
			
			if (Playdama.hungry<=150){
				
				if (Playdama.health >= 30 && Playdama.emotion >= 30) {
				
					Playdama.health -= (int)(ran.nextInt(1))+1;
					Playdama.hungry += (int)(ran.nextInt(9))+1;
					Playdama.emotion += (int)(ran.nextInt(2))+1;
					Playdama.growth += (int)(ran.nextInt(2))+1;
			
					System.out.println("�ܢܢ�~ (" + Playdama.name +"��(��) ���ְ� �Ծ���!)");	}
			
				if (Playdama.health < 30 || Playdama.emotion < 30) {					
					
					if (Playdama.health < 30) {
						Playdama.health -= (int)(ran.nextInt(2))+1;
						Playdama.hungry += (int)(ran.nextInt(9))+1;
						Playdama.emotion += (int)(ran.nextInt(1))+1;
						Playdama.growth += (int)(ran.nextInt(2))+1;
				
						System.out.println(Playdama.name + "(��)���� ���� �� ��߰ڴ�...");	}	
				 
					else if(Playdama.emotion < 30) {

						Playdama.health -= (int)(ran.nextInt(2))+1;
						Playdama.hungry += (int)(ran.nextInt(4))+1;
						Playdama.emotion += (int)(ran.nextInt(1))+1;
						Playdama.growth += (int)(ran.nextInt(2))+1;
				
						System.out.println(Playdama.name + "��(��) �ܷο� �ؿ�...");	}
					}					//�ǰ� �ܷο� ���� if ��
			
				if(Playdama.health < 20 && Playdama.emotion < 20) {
				
					Playdama.health -= (int)(ran.nextInt(3))+1;
					Playdama.hungry += (int)(ran.nextInt(3))+1;
				
					System.out.println(Playdama.name + "�� ���¿� �Ű��� ����..");	}
				}										//����� 150 ���� ��
		
			else if(Playdama.hungry>150)	{
			
				System.out.println("�� �ָ� �ȵſ�!");
		
				if(Playdama.eatDeny<=3)	{Playdama.dayCount --;}
				
				Playdama.eatDeny ++;								//������ ���̱��� �ź� ī��Ʈ ����
		
	
				if(Playdama.eatDeny>3)	{
			
					if(Playdama.health >= 30 && Playdama.emotion >= 30)	{
				
						Playdama.health -= (int)(ran.nextInt(4))+1;
						Playdama.hungry += (int)(ran.nextInt(2))+1;
						Playdama.emotion -= (int)(ran.nextInt(3))+1;
						Playdama.growth -= (int)(ran.nextInt(2))+1;
						
						System.out.println("(--;) (������ ����� " + Playdama.name + "��(��) �Ⱦ��Ѵ�...)");
			
						Playdama.eatDeny --;	}				// ������ ��ġ�� ������ �� ������ ���̱�
							
					if(Playdama.health < 30|| Playdama.emotion < 30) {
				
						if(Playdama.health>=20 || Playdama.emotion >=20) {
					
							Playdama.health -= 5;
							Playdama.hungry += 1;
							Playdama.emotion -= 4;
							Playdama.growth -= 3;
					
							System.out.println("���� ������ ���̴°ͺ��� �ٸ��� ����..");
					
							Playdama.eatDeny--;	}						//ü�°� �ܷο��� ������� �� ��
				
						if(Playdama.hungry < 20 || Playdama.emotion < 20) {
							
							Playdama.health -= 6;
							Playdama.emotion -= 5;
							Playdama.growth -= 4;
			
							System.out.println("�̷��� Ű��� "+ Playdama.name + "��(��) �������� �𸥴�..");
							Playdama.eatDeny--;	}				//�ź� ī��Ʈ
					}										//������ ���� else if
				}
			}
			Playdama.dice = 0;		//���̽� 80 �̸� ��
		}
		
			if(Playdama.dice>=80) {				
				
				Array.eatRan += (ran.nextInt(2));				//array Ŭ������ ������ ������ �̿��� ���� ȣ��
			
				System.out.printf(Playdama.name + "��(��) ���� �Դµ� ");
				System.out.println(Array.eatSituation[Array.eatRan]);
				Playdama.die = 1;	}
			break;	}	//��ü �ݺ��� ����
		
	
	case 3:{											// ����ֱ�
		
		Playdama.score += 10;
		Playdama.dice += (int)(ran.nextInt(100)) - Playdama.luck;
		
		Situationpic.play();		//Situationpic �� �Դ� ��� ���
		
		if (Playdama.dice<80) {
			
			if (Playdama.health > 30 && Playdama.hungry > 30) {				//ü���̳� ������� �����ϸ� ���尪�� ����
			
				Playdama.emotion += (int)(ran.nextInt(9))+1;
				Playdama.hungry -= (int)(ran.nextInt(4))+1;
				Playdama.health += (int)(ran.nextInt(4))+1;
				Playdama.growth += (int)(ran.nextInt(2))+1;
						
				System.out.println("�ۢۢ�~ (" + Playdama.name + "��(��) �⻵�ϴ� �� ����!)"); }
		
			if(Playdama.health <= 30 || Playdama.hungry<=30) {
				
				if(Playdama.health <= 30) {
					
					Playdama.hungry -= (int)(ran.nextInt(6))+1;
					Playdama.emotion += (int)(ran.nextInt(7))+1;
					Playdama.health += (int)(ran.nextInt(3))+1;
					Playdama.growth += (int)(ran.nextInt(1))+1;
			
					System.out.println("��� �ʿ��Ѱ� ������..");		}
			
				if(Playdama.hungry <= 30) {
				
					Playdama.hungry -= (int)(ran.nextInt(6))+1;
					Playdama.emotion += (int)(ran.nextInt(7))+1;
					Playdama.health += (int)(ran.nextInt(3))+1;
					Playdama.growth += (int)(ran.nextInt(1))+1;
				
					
					System.out.println("�� ���� ����Ұ� ������..");	}
				}							//���� ������ ���� if
			
			Playdama.dice = 0;	}		//dice �� 80 �̸� ��
		
		if(Playdama.dice>=80) {							//���̽� 80 �̸�
			
			Array.eatRan += (ran.nextInt(2));				//array Ŭ������ ������ ������ �̿��� ���� ȣ��
		
			System.out.printf(Playdama.name + "(��)�� �Բ� ��µ� ");
			System.out.println(Array.playSituation[Array.playRan]);
			Playdama.die = 1;	}
		
		break;	}					//����ġ 3��(���) ��

	case 4 : {			// ���� ���� ��
		
		System.out.println("������ �̻��� ��� : ���� �̱�� ����� �÷��帮�ڽ��ϴ�!");
		System.out.println("1�� ����, 2�� ����, 3�� �� �Դϴ�!");
		System.out.println("�غ��Ͻð�...");
		
		while(Playdama.rspEnd == 0) {
			Playdama.rsp = 0;
			Playdama.rsp = (int)(ran.nextInt(3)+1);
		for(Playdama.l=0;Playdama.l<3;Playdama.l++) {
			
			try{Thread.sleep(1000);}			//���� ���� �� �� ��¿� �����̸� �ִ� ����
			catch(InterruptedException e){}
		
		if(Playdama.l==0)
			System.out.print("����!");
		
		if(Playdama.l==1)
			System.out.print("����!");
		
		if(Playdama.l==2)
			System.out.println("��!");
		
			Playdama.myRsp = scan.nextInt();	
		}
										
		if(Playdama.rsp==1) {			//��ǻ���� ���� = 1, ���� = 2, �� = 3
			if(Playdama.myRsp==2) {
				System.out.println("�����մϴ�!! �̱�̳׿�!");
				System.out.println("(����� ����� 1 �ö���!)");
				Playdama.luck ++;
				Playdama.rspEnd= 1;	} 
			
			if(Playdama.myRsp==1) {
				System.out.println("������� �ٽ�!");	
				Playdama.rspEnd= 0;	}
				
			if(Playdama.myRsp==3) {
				System.out.println("�ƽ��� ���׿�... ������ �ٽ� ���ּ���!");	
				Playdama.rspEnd= 1;	}
		}							//���������� IF ��
		
		if(Playdama.rsp==2) {			//��ǻ���� ���� = 1, ���� = 2, �� = 3
			if(Playdama.myRsp == 3) {
				System.out.println("�����մϴ�!! �̱�̳׿�!");
				System.out.println("(����� ����� 1�ö���!)");
				Playdama.luck ++;
				Playdama.rspEnd= 1;	}
			
			if(Playdama.myRsp == 2) {
				System.out.println("������� �ٽ�!");	
				Playdama.rspEnd= 0;	}
			
			if(Playdama.myRsp == 1) {
				System.out.println("�ƽ��� ���׿�... ������ �ٽ� ���ּ���!");
				Playdama.rspEnd= 1;	}
		}
	
		if(Playdama.rsp==3) {			//��ǻ���� ���� = 1, ���� = 2, �� = 3
			if(Playdama.myRsp==1) {
				System.out.println("�����մϴ�!! �̱�̳׿�!");
				System.out.println("(����� ����� 1 �ö���!)");	
				Playdama.luck ++;
				Playdama.rspEnd= 1;	}
				
			if(Playdama.myRsp!=2) {
				System.out.println("�ƽ��� ���׿�... ������ �ٽ� ���ּ���!");	
				Playdama.rspEnd= 1;	}
		
			if(Playdama.myRsp!=3) {
				System.out.println("(������� �ٽ�!)");	
				Playdama.rspEnd= 0;	}
			}	
		}								//WHILE �� ��
		
		Playdama.health -= (int)(ran.nextInt(5)+1);
		Playdama.hungry -= (int)(ran.nextInt(5)+1);
		Playdama.emotion -= (int)(ran.nextInt(5)+1);
		Playdama.rspEnd= 0;			//���� ���� ���� ���� ���� �� �ʱ�ȭ
		break;	}	// case 4 ��
		
case 5 : {						//���� Ȯ��
		
		System.out.println(Array.penLvl[Playdama.growthLvl] + "�� �ܰ��� " + Playdama.name);
		
		if(Playdama.health>100) {			//ü���� 100���� ���� �� ���
			System.out.println("�ǰ� : ���°����� �ǰ��ϴ�!");				}
		
		else if(Playdama.health>=50 || Playdama.health<=100) {	// ü���� ���� ������ �� ���
			System.out.println("�ǰ� : �׳����� ������ ���δ�");				}
		
		else if(Playdama.health<50) {					//ü���� ���� �� ���
			System.out.println("�ǰ� : �ʹ� ���غ��δ�...");			}
		
		if(Playdama.hungry>100) {
			System.out.println("������ : ��ҷ� ���δ�!");			}
		
		else if(Playdama.hungry>=50 || Playdama.hungry<=100)
			System.out.println("������ : ������ ���δ�");
		
		else if(Playdama.health<50) {					//�������� ���� �� ���
			System.out.println("������ : ������Ѵ�...");			}
		
		if(Playdama.emotion>100) {						//�ܷο��� ���� �� ���
			System.out.println("��� : ����� ���� ���δ�!");
			System.out.println("--------------------");} 
		
		else if(Playdama.emotion>=50 || Playdama.emotion<=100) {	//�ܷο��� ������ �� ���
			System.out.println("��� : �ణ ������ ���δ�");
			System.out.println("--------------------");}
			
		else if(Playdama.emotion<50) {					//�ܷο��� ���� �� ���
			System.out.println("��� : ������ ȭ�� ���δ�...");
			System.out.println("--------------------");}
			Playdama.dayCount --;
		break;	}

		default :	{ 
			Playdama.dayCount --;
		System.out.println("�ٽ� ���� ���ּ���.");
		break;	}		// ����Ʈ ��
		}				//����ġ ��
			
		Playdama.dayCount ++;		//�ൿ�� ���� ������ ����ī��Ʈ ����
		
	if(Playdama.dayCount==5) {		//����ī��Ʈ�� 5�� �� ������ �Ϸ簡 ������ ��ġ�� ����
		
		Playdama.day ++;
		Playdama.dayCount = 0;	
		Playdama.emotion -= 10;
		Playdama.health -= 10;
		Playdama.hungry -= 10;
		
		System.out.println("���� �� �ð��̿���! �ȳ��� �ֹ�����...");
		Situationpic.sleep();		//Situationpic �� �ڴ� ��� ���
		}
	
	if (Playdama.growth>=((Playdama.growthLvl+1)*100)) {									// ���� ����ġ�� �޼� �� ����ġ �ʱ�ȭ
		
		System.out.println(Playdama.name + "��(��) Ŀ�����!");
		Playdama.growthLvl++;
		Playdama.eatDeny=0;
		Playdama.score+=1000; }	//���� ����ġ�� �޼��� �� ���� ���嵵 ���� �� ���� �߰�
	
	if (Playdama.hungry<=0 || Playdama.growth<=-1 || Playdama.health<=0) {			// ���� ����
		
		Playdama.die = 1;
			if(Playdama.hungry<=0) {
				System.out.println(Playdama.name + "�� ��� �׸�...");	}
			if(Playdama.growth<=-1) {
				System.out.println(Playdama.name + "���� �Ű��� ���Ἥ �׸�...");	}
			if(Playdama.health<=0) {
				System.out.print(Playdama.name + "�� ��ġ���� �ɷ��� �׸�...");	}
	}		//�״� if ��
	
	if (Playdama.growthLvl==3) {	//���嵵�� �޼����� ���� ��
		System.out.println("���ϵ帳�ϴ�!" + Playdama.name + "�� ������ �� Ŀ�� ������ �߾��!");
		System.out.println(Playdama.name + ": ���� �� ���δ� ���� �ǰ�;��! \n" + "�׵��� �����߽��ϴ�..�Ф�");	} //�� ���� if ��
	}			//��ü while �ݺ� ��
	}				//�޼ҵ� ��
}
