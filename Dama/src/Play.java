/**
 * �ٸ���ġ �����
 * @version 0.9 2017-10-18
 * ���� �̼���
 * ���� ������ ������
 */

public class Play {
	
	public static void main(String[] args) {
		
		Playdama dama = new Playdama();					//�̸��� ���� ��ü ����
		Playpenguin pen = new Playpenguin();			//��� ��ü ����
		PlayPig pig = new PlayPig();					//���� ��ü ����
		Playturtle tur = new Playturtle();				//�ź��� ��ü ����
		Situationpic situation = new Situationpic();	//��Ȳ �׸��� ���� ��ü ����

		int animal;										//�������ð��� ���� ����
		int i;
		
		for(i=0;i<4;i++) {
		try{Thread.sleep(1500);}
		
		catch(InterruptedException e){}
			if(i==0) {
				System.out.println("�ǰ��� ���θ� ��ġ�� ���� ���� ��");
			}
			if(i==1) {
				System.out.println("���տ� �� ���ڰ� �ϳ� �־���");
			}
			if(i==2) {
				System.out.println("�� �ȿ��� ���� �� ���� �ϳ� �־���");
			}
			if(i==3) {
				System.out.println("�̰� ���� �ϰ� �װ� ��� �÷��� ��...");
			}
		}
		
		dama.name();									// �̸� ���ϱ�
		
		animal = dama.animal(0);						//��ȯ���� animal�� ����
		
		try{Thread.sleep(1000);}
			catch(InterruptedException e){}
		
		if(animal==1)
			tur.playtur();								//animal �� ���� ���� �ź���/���/���� ����
		
		if(animal==2)
			pen.playpen();
		
		if(animal==3)
			pig.playpig();			
			
		System.out.println("\n" + "������ : 8�� �̼��� ������ ������");
		System.out.println("�޼��� " + Playdama.name + "�� �ִ� �ܰ� = " + Playdama.growthLvl);
		System.out.println("�̹� ���ӿ��� ȹ���� ���� = " + Playdama.score);
		System.out.println("�����մϴ�!");
 }
}