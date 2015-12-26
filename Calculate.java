import java.awt.*;
import java.awt.event.*;

public class Calculate {
	public static void main(String[] args) {
		TFFrame tf = new TFFrame();
		tf.launch();
	}
}

//�ڲ���  frame
class TFFrame extends Frame {
	
	TextField num1, num2, num3;
	String symble = "+";
	Button button1, button2;
	int index = 0;
	//���з���������һ��frame
	public void launch() {
		num1 = new TextField(5);	//�����	��һ������
		num2 = new TextField(5);	//�����	�ڶ�������
		num3 = new TextField(7);	//�����	���
		//Label l1 = new Label("+");
		button1 = new Button(symble);	//��һ����ť
		button2 = new Button("=");		//�ڶ�����ť
		
		//���Ͻǲ�ŵ���¼�
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
		button1.addActionListener(new B1Monitor());	//��ӵ�һ����ť�ĵ���¼�
		button2.addActionListener(new B2Monitor());	//��ӵڶ�����ť�ĵ���¼�
		
		//�����ļ�	��ť�����������Բ���(����һ��ֱ��)
		setLayout(new FlowLayout());
		add(num1);
		add(button1);
		add(num2);
		add(button2);
		add(num3);
		pack();		//frame�߿��Χ���еĶ�����ע�͵�frame���󣬿����Լ��ֶ�������С
		setVisible(true);
	}
	//��һ����ť�ĵ���¼�
	class B1Monitor implements ActionListener {
			
		public void actionPerformed(ActionEvent e){
			if(index >= 4){
				index = 0;
				setSymble();
				button1.setLabel(symble);
				index++;
			} else {
				setSymble();
				button1.setLabel(symble);
				index ++;
			}
		}
		
	}
	//�ڶ�����ť�ĵ���¼�
	class B2Monitor implements ActionListener {
			
		public void actionPerformed(ActionEvent e){
			
			if (symble.equals("+")) {
				double n1 = Double.parseDouble(num1.getText());
				double n2 = Double.parseDouble(num2.getText());
				num3.setText("" + (n1+n2));
			}
			if (symble.equals("-")) {
				double n1 = Double.parseDouble(num1.getText());
				double n2 = Double.parseDouble(num2.getText());
				num3.setText("" + (n1-n2));
			}
			if (symble.equals("*")) {
				double n1 = Double.parseDouble(num1.getText());
				double n2 = Double.parseDouble(num2.getText());
				num3.setText("" + (n1*n2));
			}
			if (symble.equals("/")) {
				double n1 = Double.parseDouble(num1.getText());
				double n2 = Double.parseDouble(num2.getText());
				num3.setText("" + (n1/n2));
			}
			
		}
	}
	//���õ�һ����ť������ʾ�Ķ���
	public void setSymble() {
		if(index == 0) {
			symble = "-";
		} else if (index == 1) {
			symble = "*";
		} else if (index == 2) {
			symble = "/";
		} else if (index == 3) {
			symble = "+";
		}
	}
	
}


/*
class Monitor implements ActionListener {
	TextField t1, t2, t3;
	
	public Monitor(TextField t1, TextField t2, TextField t3) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	
	public void actionPerformed(ActionEvent e){
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		t3.setText("" + (n1+n2));
//System.out.println("ok");
	}
}

*/