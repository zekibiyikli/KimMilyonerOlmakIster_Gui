import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;


public class Main {
	static JFrame frame;
	static JPanel panel;
	static JLabel isim1l,isim2l,isim3l,soru,paraagac,label1,label2,result;
	static JTextField isim1tf,isim2tf,isim3tf;
	static JButton start,cevapa,cevapb,cevapc,cevapd,joker1,joker2,joker3,joker4,jj1,jj2,jj3,retbut,restart;
	static String jisim1,jisim2,jisim3;
	public static String[][] sorular=Sorular.Soru();
	static Random random=new Random();
	static int seviye=0;
	static String[] sorus= {"","","","","",""};
	static int Para[]={0,500,1000,2500,5000,7500,15000,25000,50000,10000,250000,500000,1000000};
	static int JokerSecim[]= {0,0,0,0};
	static String joker1cevap;

	public static void main(String[] args) {
		MainScreen();
	}
	
	public static void MainScreen() {
		frame=new JFrame("Kim Milyoner Olmak Ýster");
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setSize(600,600);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		
		isim1l=new JLabel("1. Ýsim:");
		isim1l.setSize(50,50);
		isim1l.setLocation(50,50);
		panel.add(isim1l);
		
		isim2l=new JLabel("2. Ýsim:");
		isim2l.setSize(50,50);
		isim2l.setLocation(50,100);
		panel.add(isim2l);
		
		isim3l=new JLabel("3. Ýsim:");
		isim3l.setSize(50,50);
		isim3l.setLocation(50,150);
		panel.add(isim3l);
		
		isim1tf=new JTextField();
		isim1tf.setSize(100,30);
		isim1tf.setLocation(100,60);
		panel.add(isim1tf);
		
		isim2tf=new JTextField();
		isim2tf.setSize(100,30);
		isim2tf.setLocation(100,110);
		panel.add(isim2tf);
		
		isim3tf=new JTextField();
		isim3tf.setSize(100,30);
		isim3tf.setLocation(100,160);
		panel.add(isim3tf);
		
		start=new JButton("Baþla");
		start.setSize(200, 45);
		start.setLocation(200,450);
		start.addActionListener(new Action());
		panel.add(start);
		
		
		frame.add(panel);
		frame.repaint();
	}
	
	public static void start() {
		System.out.println(sorus[5]+seviye);
		frame=new JFrame("Kim Milyoner Olmak Ýster");
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setSize(600,600);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		
		for(int i=0;i<Para.length;i++) {
			if(i==seviye) {
				paraagac=new JLabel(Para[i]+"***");
				paraagac.setSize(200,30);
				paraagac.setLocation(600,i*20);
				panel.add(paraagac);
			}
			else {
				paraagac=new JLabel(""+Para[i]);
				paraagac.setSize(200,30);
				paraagac.setLocation(600,i*20);
				panel.add(paraagac);
			}
			
		}
		
		soru=new JLabel(sorus[0]);
		soru.setSize(500,50);
		soru.setLocation(200,300);
		panel.add(soru);
		
		cevapa=new JButton("A) "+sorus[1]);
		cevapa.setSize(200, 45);
		cevapa.setLocation(200,350);
		cevapa.addActionListener(new Action());
		panel.add(cevapa);
		
		cevapb=new JButton("B) "+sorus[2]);
		cevapb.setSize(200, 45);
		cevapb.setLocation(400,350);
		cevapb.addActionListener(new Action());
		panel.add(cevapb);
		
		cevapc=new JButton("C) "+sorus[3]);
		cevapc.setSize(200, 45);
		cevapc.setLocation(200,400);
		cevapc.addActionListener(new Action());
		panel.add(cevapc);
		
		cevapd=new JButton("D) "+sorus[4]);
		cevapd.setSize(200, 45);
		cevapd.setLocation(400,400);
		cevapd.addActionListener(new Action());
		panel.add(cevapd);
		
		
		if(JokerSecim[0]==0) {
			joker1=new JButton("Arama Jokeri");
			joker1.setSize(200, 50);
			joker1.setLocation(50,50);
			joker1.addActionListener(new Action());
			panel.add(joker1);
		}
		else {
			joker1=new JButton("Arama Jokeri ***");
			joker1.setSize(200, 50);
			joker1.setLocation(50,50);
			joker1.addActionListener(new Action());
			panel.add(joker1);
		}
		
		if(JokerSecim[1]==0) {
			joker2=new JButton("%50 Jokeri");
			joker2.setSize(200, 50);
			joker2.setLocation(50,100);
			joker2.addActionListener(new Action());
			panel.add(joker2);
		}
		else {
			joker2=new JButton("%50 Jokeri ***");
			joker2.setSize(200, 50);
			joker2.setLocation(50,100);
			joker2.addActionListener(new Action());
			panel.add(joker2);
		}

		if(JokerSecim[2]==0) {
			joker3=new JButton("Seyirciye Sorma");
			joker3.setSize(200, 50);
			joker3.setLocation(50,150);
			joker3.addActionListener(new Action());
			panel.add(joker3);
		}
		else {
			joker3=new JButton("Seyirciye Sorma ***");
			joker3.setSize(200, 50);
			joker3.setLocation(50,150);
			joker3.addActionListener(new Action());
			panel.add(joker3);
		}
		
		frame.add(panel);
		frame.repaint();

	}
	
	public static void aramaJoker() {
		
		frame=new JFrame("Kim Milyoner Olmak Ýster");
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setSize(600,600);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		
		label1=new JLabel("Soruyu Kime Sormak Ýstiyorsun.");
		label1.setSize(200,50);
		label1.setLocation(50,50);
		panel.add(label1);
		
		jj1=new JButton(jisim1);
		jj1.setSize(200, 45);
		jj1.setLocation(100,100);
		jj1.addActionListener(new Action());
		panel.add(jj1);
		
		jj2=new JButton(jisim2);
		jj2.setSize(200, 45);
		jj2.setLocation(100,150);
		jj2.addActionListener(new Action());
		panel.add(jj2);
	
		jj3=new JButton(jisim3);
		jj3.setSize(200, 45);
		jj3.setLocation(100,200);
		jj3.addActionListener(new Action());
		panel.add(jj3);
		
		retbut=new JButton("Soruya Dön");
		retbut.setSize(200, 45);
		retbut.setLocation(200,250);
		retbut.addActionListener(new Action());
		panel.add(retbut);
		
		label2=new JLabel(joker1cevap);
		label2.setSize(200,50);
		label2.setLocation(300,300);
		panel.add(label2);
		
		
		frame.add(panel);
		frame.repaint();
	}
	
	public static void finish() {
		frame=new JFrame("Kim Milyoner Olmak Ýster");
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setSize(600,600);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		
		for(int i=0;i<Para.length;i++) {
			if(i==seviye) {
				paraagac=new JLabel(Para[i]+"***");
				paraagac.setSize(200,30);
				paraagac.setLocation(600,i*20);
				panel.add(paraagac);
			}
			else {
				paraagac=new JLabel(""+Para[i]);
				paraagac.setSize(200,30);
				paraagac.setLocation(600,i*20);
				panel.add(paraagac);
			}
			
		}
		
		result=new JLabel("Kazanýlan Para: "+Para[seviye]);
		result.setSize(200,30);
		result.setLocation(600,400);
		panel.add(result);
		
		
		
		frame.add(panel);
		frame.repaint();
	}
	
	public static void joker50() {
		if(sorus[5].equals("A")) {
			sorus[2]="-";
			sorus[4]="-";
		}
		else if(sorus[5].equals("B")) {
			sorus[1]="-";
			sorus[4]="-";
		}
		else if(sorus[5].equals("C")) {
			sorus[1]="-";
			sorus[2]="-";
		}
		else if(sorus[5].equals("D")) {
			sorus[1]="-";
			sorus[3]="-";
		}
		start();
	}
	public static void seyircisor() {
		frame=new JFrame("Kim Milyoner Olmak Ýster");
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setSize(600,600);
		panel.setLocation(0, 0);
		panel.setLayout(null);

		retbut=new JButton("Soruya Dön");
		retbut.setSize(200, 45);
		retbut.setLocation(200,250);
		retbut.addActionListener(new Action());
		panel.add(retbut);
		
		if(sorus[5].equals("A")) {
			label2=new JLabel("A) %80  B) %5  C) %8  D)7");
			label2.setSize(200,50);
			label2.setLocation(300,300);
			panel.add(label2);
		}
		else if(sorus[5].equals("B")) {
			label2=new JLabel("A) %20  B) %70  C) %3  D)7");
			label2.setSize(200,50);
			label2.setLocation(300,300);
			panel.add(label2);
		}
		else if(sorus[5].equals("B")) {
			label2=new JLabel("A) %5  B) %15  C) %75  D)5");
			label2.setSize(200,50);
			label2.setLocation(300,300);
			panel.add(label2);
		}
		else if(sorus[5].equals("B")) {
			label2=new JLabel("A) %4  B) %16  C) %3  D)77");
			label2.setSize(200,50);
			label2.setLocation(300,300);
			panel.add(label2);
		}
		
		frame.add(panel);
		frame.repaint();
	}
	
	static class Action implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==start){
				 jisim1=isim1tf.getText().toUpperCase();
				 jisim2=isim2tf.getText().toUpperCase();
				 jisim3=isim3tf.getText().toUpperCase();
				 
					int randnum=random.nextInt(sorular.length);

					for(int i=0;i<sorus.length;i++) {
						sorus[i]=sorular[randnum][i];
					}
				 frame.dispose();
				 start();
			}
			else if(e.getSource()==cevapa) {
				if(sorus[5].equals("A") && seviye<11) {
					int randnum=random.nextInt(sorular.length);
					for(int i=0;i<sorus.length;i++) {
						sorus[i]=sorular[randnum][i];
					}
					seviye++;
					frame.dispose();
					start();
				}
				else {
					frame.dispose();
					finish();
					System.out.println(sorus[5]);
				}
			}
			else if(e.getSource()==cevapb) {
				if(sorus[5].equals("B") && seviye<11) {
					int randnum=random.nextInt(sorular.length);
					for(int i=0;i<sorus.length;i++) {
						sorus[i]=sorular[randnum][i];
					}
					seviye++;
					frame.dispose();
					start();
				}
				else {
					finish();
					System.out.println(sorus[5]);

				}
			}
			else if(e.getSource()==cevapc) {
				if(sorus[5].equals("C") && seviye<11) {
					int randnum=random.nextInt(sorular.length);
					for(int i=0;i<sorus.length;i++) {
						sorus[i]=sorular[randnum][i];
					}
					seviye++;
					frame.dispose();
					start();
				}
				else {
					finish();
					System.out.println(sorus[5]);

				}
			}
			else if(e.getSource()==cevapd) {
				if(sorus[5].equals("D") && seviye<11) {
					int randnum=random.nextInt(sorular.length);
					for(int i=0;i<sorus.length;i++) {
						sorus[i]=sorular[randnum][i];
					}
					seviye++;
					frame.dispose();
					start();
				}
				else {
					finish();
					System.out.println(sorus[5]);

				}
			}
			else if(e.getSource()==joker1) {
				if(JokerSecim[0]!=1) {
					JokerSecim[0]=1;
					
					frame.dispose();
					aramaJoker();
				}
				
			}
			else if(e.getSource()==joker2) {
				if(JokerSecim[1]!=1) {
					JokerSecim[1]=1;
					
					frame.dispose();
					joker50();
				}			}
			else if(e.getSource()==joker3) {
				if(JokerSecim[2]!=1) {
					JokerSecim[2]=1;
					
					frame.dispose();
					seyircisor();
				}			}
			else if(e.getSource()==joker4) {
				if(JokerSecim[3]!=1) {
					JokerSecim[3]=1;
					
					frame.dispose();
					aramaJoker();
				}			}
			else if(e.getSource()==retbut) {
				frame.dispose();
				start();
			}
			
			else if(e.getSource()==jj1) {
				if(sorus[5]=="A") {
					joker1cevap=jisim1+": Doðru Cevap Bence A.";
				}
				else if(sorus[5]=="B") {
					joker1cevap=jisim1+": Doðru Cevap Bence B.";
				}
				else if(sorus[5]=="C") {
					joker1cevap=jisim1+": Doðru Cevap Bence C.";
				}
				else if(sorus[5]=="D") {
					joker1cevap=jisim1+": Doðru Cevap Bence D.";
				}
				frame.dispose();
				aramaJoker();
			}
			else if(e.getSource()==jj2) {
				if(sorus[5]=="A") {
					joker1cevap=jisim2+": Doðru Cevap Bence A.";
				}
				else if(sorus[5]=="B") {
					joker1cevap=jisim2+": Doðru Cevap Bence B.";
				}
				else if(sorus[5]=="C") {
					joker1cevap=jisim2+": Doðru Cevap Bence C.";
				}
				else if(sorus[5]=="D") {
					joker1cevap=jisim2+": Doðru Cevap Bence D.";
				}
				frame.dispose();
				aramaJoker();
			}
			else if(e.getSource()==jj3) {
				if(sorus[5]=="A") {
					joker1cevap=jisim3+": Doðru Cevap Bence A.";
				}
				else if(sorus[5]=="B") {
					joker1cevap=jisim3+": Doðru Cevap Bence B.";

				}
				else if(sorus[5]=="C") {
					joker1cevap=jisim3+": Doðru Cevap Bence C.";

				}
				else if(sorus[5]=="D") {
					joker1cevap=jisim3+": Doðru Cevap Bence D.";
				}
				frame.dispose();
				aramaJoker();
			}
		}
	}

}
