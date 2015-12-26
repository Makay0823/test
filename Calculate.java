import java.awt.*;
import java.awt.event.*;

public class Calculate {
	public static void main(String[] args) {
		TFFrame tf = new TFFrame();
		tf.launch();
	}
}

//内部类  frame
class TFFrame extends Frame {
	
	TextField num1, num2, num3;
	String symble = "+";
	Button button1, button2;
	int index = 0;
	//运行方法，构造一个frame
	public void launch() {
		num1 = new TextField(5);	//输入框	第一个数字
		num2 = new TextField(5);	//输入框	第二个数字
		num3 = new TextField(7);	//输入框	结果
		//Label l1 = new Label("+");
		button1 = new Button(symble);	//第一个按钮
		button2 = new Button("=");		//第二个按钮
		
		//右上角叉号点击事件
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
		button1.addActionListener(new B1Monitor());	//添加第一个按钮的点击事件
		button2.addActionListener(new B2Monitor());	//添加第二个按钮的点击事件
		
		//布局文件	按钮和输入框成线性布局(就是一条直线)
		setLayout(new FlowLayout());
		add(num1);
		add(button1);
		add(num2);
		add(button2);
		add(num3);
		pack();		//frame边框包围所有的东西，注释掉frame会变大，可以自己手动调整大小
		setVisible(true);
	}
	//第一个按钮的点击事件
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
	//第二个按钮的点击事件
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
	//设置第一个按钮上面显示的东西
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