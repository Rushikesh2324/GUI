import java.awt.*;
import java.awt.event.*;


class Calculator2
{
  public static void main(String a[])
  {
    MarvallousCalculator mobj = new MarvallousCalculator(400,400 ,"Marvallous");
  }
}

class MarvallousCalculator extends WindowAdapter implements ActionListener
{
  public Frame fobj;
  public Button b1,b2,b3,b4;
  public TextField t1,t2;
  public Label lobj;
  public Integer No1,No2;

  public MarvallousCalculator(int width , int height ,String title)
  {
    fobj = new Frame(title);
    fobj.setSize(width,height);
    

    fobj.addWindowListener(this);

    b1= new Button("Add");
    b2= new Button("Sub");
    b3= new Button("Multi");
    b4= new Button("DIV");

    t1= new TextField();
    t2= new TextField();

    

    b1.setBounds(10,280,80,40);  //X,Y,W,H
    b2.setBounds(100,280,80,40);
    b3.setBounds(190,280,80,40);
    b4.setBounds(290,280,80,40);

    t1.setBounds(70,100,100,40);
    t2.setBounds(220,100,100,40);

    fobj.add(b1);
    fobj.add(b2);
    fobj.add(b3);
    fobj.add(b4);

    fobj.add(t1);
    fobj.add(t2);

    lobj=new Label();
    lobj.setBounds(150,25,200,100);
    fobj.add(lobj);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    
    fobj.setLayout(null);
    fobj.setVisible(true);


  }
  public void windowClosing(WindowEvent obj)  //Event 
  {
    System.exit(0);
  }
  public void actionPerformed(ActionEvent aobj)
  {
    try
    {
      No1= Integer.parseInt(t1.getText());
      No2= Integer.parseInt(t2.getText());

      if (aobj.getSource()==b1)  //add
      {
        lobj.setText("Addition is :"+(No1+No2));

      }
      else if (aobj.getSource()==b2) //sub
      {
        lobj.setText("Substraction is :"+(No1-No2));

      }
      else if (aobj.getSource()==b3) //Multi
      {
        lobj.setText("Multiplication is :"+(No1*No2));

      }
      else if (aobj.getSource()==b4) //div
      {
        lobj.setText("Division is :"+(No1/No2));

      }

    }
    catch(Exception eobj)
    {}  

  }
}
   
