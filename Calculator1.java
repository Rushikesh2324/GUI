import java.awt.*;
import java.awt.event.*;

class MarvallousFrame
{
  public Frame fobj;
  
  public MarvallousFrame(String title)
  {
    Frame fobj = new Frame(title);
    fobj.setSize(400,400);
    fobj.setVisible(true);
    fobj.addWindowListener(new MarvallousListener());

  }
}
class MarvallousListener extends windowAdapter
{
 
  public void windowClosing(WindowEvent obj){}
  {
    System.exit(0);
  }
}
class GUI6
{
  public static void main(String a[])
  {
    MarvallousFrame mobj = new MarvallousFrame("PPA");
  }
}


   
