import java.util.*;
public class Playdama {
	
	// ����� ���õ� ������ ��ġ
	static int health = 100;	// �ǰ� ����
	static int hungry = 100;	// ����� ����
	static int emotion = 100;	// ���� ����
	static int luck = 0;		// ��� ����
	static int growth = 0;		// ���� ����
	static int growthLvl = 0; 	// ���� ���� 
	static int day = 0;			// ��¥
	static int dayCount = 0;	// �Ƿε� ī����
	static int score = 0;		// �������� ǥ�� �� ����
	
	// ��ü�� ����, �б�, ���� ���� ó���� ���� ����
	int nameCho;					// �̸� Y/N ����
	int animal;						// ���� ���� ������ ���� ���� ����
	int tur=0, pig=0, pen=0;  		// ���� �ź���,����,����� ������ ���� ����
	static int action;				// � �ൿ�� ���� �ൿ �� �޴� ����
	static int dice = 0;			// �Ź� �ൿ �� �� ��� �߻����� ������ ���� ���� ����
	static int die;					// �׾��� �� ���� ��
	static int repetiton=0;		// ���� �¾ �� �����Լ� �ݺ� ī����, �� �ൿ ����� �ݺ� ī����
	static int eatDeny=0;			// ����̱� �ź� ī��Ʈ
	static String name;				// �̸�
	
	//����������
	static int rsp = 0;				//���������� �� �Է� ����
	static int myRsp = 0;			//���� ���������� �� �Է�
	static int l = 0;				//���������� ����� �� ������(����) �ݺ� ����
	static int rspEnd = 0;			//���������� ���� �� ����
	
	Scanner sca = new Scanner(System.in);
	Random ran = new Random();
	
	public void name() {		//�̸� �ޱ�
		while(nameCho != 1)	{
			System.out.println("??? : �ȳ��ϼ��� ���δ�! �� �̸��� �����ּ���!");
			name = sca.next();
			System.out.println("�� �̸����� �ұ��?" + "\n" + "1. ��! 2. �ٽ� ���ҷ���!");		//�̸� Ȯ��
			nameCho = sca.nextInt();
		
		switch(nameCho)	{				//���ÿ� ���� �б�
			case 1 : break;
		
			case 2 : break;
			default : {
				while(nameCho != 1 && nameCho != 2) {
					System.out.println("����� ��ȣ�� ������ �ּ���..");
					System.out.println("�� �̸����� �ұ��?" + "\n" + "1. ��! 2. �ٽ� ���ҷ���!");
					nameCho = sca.nextInt();}
			break;	}
			}
		}				//while ��
	}					// scanner ���� next�� nextint�� �żҵ� ó������� �ٸ�
	
	public int animal(int a) {							//���� ���� ����
		
		System.out.println("? : ���δ��� ���� � �޴��� ��ð� �����Ű���?" + "\n" + "1. �ع��� 2. �������� 3. ġŲ");
		animal = sca.nextInt();
			if(animal==1)
				tur++;
			if(animal==2)
				pig++;
			if(animal==3)
				pen++;
		animal=0;
		
		System.out.println("? : Ű��� ������ 100�ϳ� � ������ �ְ� ��������?" + "\n" + "1. ���������� 2. ��������� 3. �������");
		
		animal = sca.nextInt();
			if(animal==1)
				pen++;
			if(animal==2)
				tur++;
			if(animal==3)
				pig++;
		animal=0;
		
		System.out.println("? : ���� �ϸ� �������� ������?" + "\n" + "1. �����ִ� ���� 2. �������� �θ� 3. �ܴ��� ����");
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
				a  += (int)(ran.nextInt(2))+1;	}			//���� ������ �������� 1���� �����ϰ� ���õȴٸ� ��������
		
		return a;									//ȣ���� ���� a���� ������
	}
	
}
