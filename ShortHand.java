import java.awt.*;
import java.awt.event.*;




class ShortHand
{
  public static void main(String a[])
  {
    Frame fobj=new Frame("Marvallous");
    fobj.setSize(500,500);
    fobj.setVisible(true);

    Button bobj=new Button("ok");

    //Annonynoms inner class
    bobj.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent aobj)
      {
        System.out.println("Button Pressed");
      }
    });

    

  }
}


   
