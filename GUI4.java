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
class MarvallousListener implements WindowListener
{
  public void windowActivated(WindowEvent obj){}
  public void windowDeactivated(WindowEvent obj){}
  public void windowIconified(WindowEvent obj){}
  public void windowDeiconified(WindowEvent obj){}
  public void windowClosed(WindowEvent obj){}
  public void windowOpened(WindowEvent obj){}
  public void windowClosing(WindowEvent obj){}
  {
    System.exit(0);
  }
}
class GUI4
{
  public static void main(String a[])
  {
    MarvallousFrame mobj = new MarvallousFrame("PPA");
  }
}


   
