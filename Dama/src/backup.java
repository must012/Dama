
public class backup {
	/*public void playchic() {
	System.out.println("¥��! �˿��� ���� �¾� �����ϴ�!");
	System.out.println(name + " ��(��) �� Ű���ּ���!");
		
while(die!=1) {
		try{Thread.sleep(1000);}
		catch(InterruptedException e){}					//�ൿ �ѹ� ��� �� 1�� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n" + "ü�� : " + health + " \\" + " ������ : " + hungry + " \\" + " ��� : " + emot + " \\"
		+  " ��� : " + luck + " \\" + " ��¥ : " + day + " �� ° " + growth);
		System.out.println("------------------------------------------------------------");
		System.out.println("1 : �		 	  2 : ���ֱ�		  3 : ����ֱ�" + "\n\n\n\n");
		System.out.println(" ��" + "\n" + "��" + "\n" + "��" + "\n");
		System.out.println("4 : ����!		 				  5 : ���º���");
		System.out.println("------------------------------------------------------------");
		System.out.printf("������ �ұ��? ");
		action = sc.nextInt();
		
		System.out.println("");
		
//------------------------------ �ൿ ����ġ ���� -----------------------------------------------------------------------------------

	switch(action) {
	case 1:		{			// ---------�
	score += 10;
	dice += (int)(ran.nextInt(100)) - luck;
	if(dice<70) {
	if (health<=150){
		if (hungry >= 30 && emot >= 30) {
			
			health += (int)(ran.nextInt(9))+1;
			hungry -= (int)(ran.nextInt(4))+1;
			emot += (int)(ran.nextInt(2))+1;
			growth += (int)(ran.nextInt(2))+1;
		
			System.out.println("�ݢݢ�~ (" + name + "��(��) �ǰ������Ͱ���!)");}
		
		if(hungry < 30 || emot < 30) {
			
			if(hungry < 30) {
				
			health += (int)(ran.nextInt(6))+1;
			hungry -= (int)(ran.nextInt(4))+1;
			emot += (int)(ran.nextInt(1))+1;
			growth += (int)(ran.nextInt(2))+1;
			
			System.out.println(name + "�� ����ĺ��δ�");
		}	
			
			else if(emot < 30) {
			health += (int)(ran.nextInt(6))+1;
			hungry -= (int)(ran.nextInt(4))+1;
			emot += (int)(ran.nextInt(1))+1;
			growth += (int)(ran.nextInt(2))+1;
			
			System.out.println(name + "(��)�� ���� ������ �ҰͰ���...");
			}
		}					//������ �ܷο� ���� if
		
		if(hungry < 20 && emot < 20) {
			health += (int)(ran.nextInt(3))+1;
			hungry -= (int)(ran.nextInt(3))+1;
			
			System.out.println(name + "�� ���¿� �Ű��� ����...");
		}
	}						//ü�� ���� if ��
	dice = 0;}					//���̽� �� 70 ����
	
	if(dice>=70) {
		array.playran += (ran.nextInt(1));				//array Ŭ������ ������ ������ �̿��� ���� ����
		
		System.out.printf(name + "��(��) ��� �ϴµ� ");
		System.out.println(array.playSit[array.playran]);
		die = 1;
	}
	break;	}

case 2: {				//���ֱ�
	score += 10;
	dice += (int)(ran.nextInt(100)) - luck;
	if(dice<70) {
	if (hungry<=150){
		if (health >= 30 && emot >= 30) {
			
			health -= (int)(ran.nextInt(1))+1;
			hungry += (int)(ran.nextInt(9))+1;
			emot += (int)(ran.nextInt(2))+1;
			growth += (int)(ran.nextInt(2))+1;
		
		System.out.println("�ܢܢ�~ (" + name +"��(��) �����Ѵ�!)");	}
		
		if(health < 30 || emot < 30) {					
			if(health < 30) {
			health -= (int)(ran.nextInt(2))+1;
			hungry += (int)(ran.nextInt(9))+1;
			emot += (int)(ran.nextInt(1))+1;
			growth += (int)(ran.nextInt(2))+1;
			
			System.out.println(name + "��(��) ����� �ؿ�..");
		}	
			
			else if(emot < 30) {
			health -= (int)(ran.nextInt(2))+1;
			hungry += (int)(ran.nextInt(4))+1;
			emot += (int)(ran.nextInt(1))+1;
			growth += (int)(ran.nextInt(2))+1;
			
			System.out.println(name + "��(��) �ܷο� �ؿ�...");
			}
		}					//�ǰ� �ܷο� ����
		
		if(health < 20 && emot < 20) {
			
			health -= (int)(ran.nextInt(3))+1;
			hungry += (int)(ran.nextInt(3))+1;
			
			System.out.println(name + "�� ���¿� �Ű��� ����..");
		}
	}										//����� 150 ���� ��
	
	else if(hungry>150)	{
	System.out.println("�� �ָ� �ȵǿ�!");
	if(j<=3)	{dcnt --;}
	j ++;									//������ ���̱��� �ź� ī��Ʈ ����
	
	if(j>3)	{
		if(health >= 30 && emot >= 30)	{
			
			health -= (int)(ran.nextInt(4))+1;
			hungry += (int)(ran.nextInt(2))+1;
			emot -= (int)(ran.nextInt(3))+1;
			growth -= (int)(ran.nextInt(2))+1;
		
		System.out.println("(--;) (������ ����� " + name + "��(��) �Ⱦ��Ѵ�...)");
		
		j --;	}				// ������ ��ġ�� ������ �� ������ ���̱�
						
		if(health < 30|| emot < 30) {
			if(health>=20 || emot >=20) {
				
				health -= 5;
				hungry += 1;
				emot -= 4;
				growth -= 3;
				
				System.out.println("���� ������ ���̴°ͺ��� �ٸ��� ����..");
				
				j--;	}						//ü�°� �ܷο��� ������� �� ��
			
			if(hungry < 20 || emot < 20) {
		
				health -= 6;
				emot -= 5;
				growth -= 4;
		
		System.out.println("�̷��� Ű��� "+ name + "��(��) �������� �𸥴�..");
		j--;	}				//�ź� ī��Ʈ
	}							//������ ���� else if
	}
dice = 0;}						//���̽� 70 �̸�
	
	if(dice>=70) {
		System.out.println(name + "��(��) ���� �Դ� �׸�...");
		die = 1;	}
	break;	}
	}

case 3:{											// ����ֱ�
	
	score += 10;
	dice += (int)(ran.nextInt(100)) - luck;
	if(dice<70) {
	if(health > 30 && hungry > 30) {				//ü���̳� ������� �����ϸ� ���尪�� ����
		
		emot += (int)(ran.nextInt(9))+1;
		hungry -= (int)(ran.nextInt(4))+1;
		health += (int)(ran.nextInt(4))+1;
		growth += (int)(ran.nextInt(2))+1;
					
		System.out.println("�ۢۢ�~ (" + name + "��(��) �⻵�ϴ� �� ����!)"); }
	
	if(health <= 30 || hungry<=30) {
		if(health <= 30) {
			hungry -= (int)(ran.nextInt(6))+1;
			emot += (int)(ran.nextInt(7))+1;
			health += (int)(ran.nextInt(3))+1;
			growth += (int)(ran.nextInt(1))+1;
		
		System.out.println("��� �ʿ��Ѱ� ������..");		}
		
		if(hungry <= 30) {
			hungry -= (int)(ran.nextInt(6))+1;
			emot += (int)(ran.nextInt(7))+1;
			health += (int)(ran.nextInt(3))+1;
			growth += (int)(ran.nextInt(1))+1;
			
		System.out.println("�� ���� ����Ұ� ������..");	}
	}					//���� ������ ���� if
	dice = 0;	}		//dice �� 70 �̸�
	
	if(dice>=70) {
		System.out.println(name + "��(��) ��ٰ� �׸�...");
		die = 1;	}
	
	break;	}					//����ġ 3��(���) ��

case 4 : {			// ���� ���� ��
	System.out.println("������ �̻��� ��� : ���� �̱�� ����� �÷��帮�ڽ��ϴ�!");
	System.out.println("1�� ����, 2�� ����, 3�� �� �Դϴ�!");
	System.out.println("�غ��Ͻð�...");
	rsp = (int)(ran.nextInt(2));
	
	for(l=0;l<3;l++) {
	try{Thread.sleep(1000);}
	catch(InterruptedException e){}
	
	if(l==0) {
		System.out.print("����!");	}
	if(l==1) {
		System.out.print("����!");	}
	if(l==2) {
		System.out.println("��!");
		rspAn = sc.nextInt();	}
	}
		
	
	if(rsp==0) {
		if(rspAn==2) {
			System.out.println("�����մϴ�!! �̱�̳׿�!");
			System.out.println("(����� ����� 1 �ö���!)");
			luck ++;}
		if(rspAn!=2) {
			System.out.println("�ƽ��� ���׿�... ������ �ٽ� ���ּ���!");	}
				}
	
	if(rsp==1) {
		if(rspAn==3) {
			System.out.println("�����մϴ�!! �̱�̳׿�!");
			System.out.println("(����� ����� 1�ö���!)");
			luck ++;}
		if(rspAn!=3) {
			System.out.println("�ƽ��� ���׿�... ������ �ٽ� ���ּ���!");	}
			}
	
	if(rsp==2) {
		if(rspAn==1) {
			System.out.println("�����մϴ�!! �̱�̳׿�!");
			System.out.println("(����� ����� 1 �ö���!)");	
			luck ++;	}
			
		if(rspAn!=1) {
			System.out.println("�ƽ��� ���׿�... ������ �ٽ� ���ּ���!");	}
			}
	health -= (int)(ran.nextInt(2));
	hungry -= (int)(ran.nextInt(2));
	emot -= (int)(ran.nextInt(2));
	
	break;	} // case 4 ��
	
case 5 : {						//���� Ȯ��
	
	System.out.println(array.chicLvl[glvl] + "�� �ܰ��� " + name);
	
	if(health>100) {			//ü���� 100���� ���� �� ���
		System.out.println("�ǰ� : ���°����� �ǰ��ϴ�!");				}
	
	else if(health>=50 || health<=100) {	// ü���� ���� ������ �� ���
		System.out.println("�ǰ� : �׳����� ������ ���δ�");				}
	
	else if(health<50) {					//ü���� ���� �� ���
		System.out.println("�ǰ� : �ʹ� ���غ��δ�...");			}
	
	if(hungry>100) {
		System.out.println("������ : ��ҷ� ���δ�!");			}
	
	else if(hungry>=50 || hungry<=100)
		System.out.println("������ : ������ ���δ�");
	
	else if(health<50) {					//�������� ���� �� ���
		System.out.println("������ : ������Ѵ�...");			}
	
	if(emot>100) {						//�ܷο��� ���� �� ���
		System.out.println("��� : ����� ���� ���δ�!");
		System.out.println("--------------------");} 
	
	else if(emot>=50 || emot<=100) {	//�ܷο��� ������ �� ���
	System.out.println("��� : �ణ ������ ���δ�");
	System.out.println("--------------------");}
		
	else if(emot<50) {					//�ܷο��� ���� �� ���
	System.out.println("��� : ������ ȭ�� ���δ�...");
	System.out.println("--------------------");}
	dcnt --;
	break;	}

	default :	{ 
	dcnt --;
	System.out.println("�ٽ� ���� ���ּ���.");
	break;	}		// ����Ʈ ��
	}				//����ġ ��
		
	/*try{Thread.sleep(1000);}
	catch(InterruptedException e){}*/
		/*if(hungry<=0) {
			growth -= 5;
			
			System.out.println(name + "�� �ٽ� �����־��..");
		}
		if(health<=0) {
			growth -= 5;
			
			System.out.println(name + "�� �ʹ� �ӻ��ؿ�..");
		} 		// Ư�� ��¥�� ������ �� ġŲ�� ���¸� ǥ�� ������ ���Ǵٰų� �����ٰų� �ʿ��ϴٸ� �̰� ������ ����		
		
dcnt ++;
if(dcnt==5) {
	day ++;
	dcnt = 0;
	emot -= 10;
	health -= 10;
	hungry -= 10;
	
	System.out.println("�Ϸ簡 �������!");	}

if(growth>=100) {									// ���� ����ġ�� �޼� �� ����ġ �ʱ�ȭ
System.out.println(name + "��(��) Ŀ�����!");
glvl ++;
j=0;			}

if (hungry<=0 || growth<=-1 || health<=0) {			// ���ӿ���
	die = 1;
	if(hungry<=0) {
		System.out.println(name + "�� ���� �׾����...");}
	if(growth<=-1) {
		System.out.println(name + "�� ������ ���ؼ� �׾����...");}
	if(health<=0) {
		System.out.print(name + "�� ��ġ���� �ɷ��� �׾����...");}
	}		//�״� if ��
	
}			//��ü while �ݺ� ��

System.out.println("\n" + "������ : 8�� �̼��� ������ ������");
System.out.println("�����մϴ�!");
}				//�޼ҵ� ��	 */

}
