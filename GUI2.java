import java.awt.*;

class MarvallousFrame
{
  public Frame fobj;

  public MarvallousFrame(String title)
  {
    Frame fobj = new Frame(title);
    fobj.setSize(400,400);
    fobj.setVisible(true);
  }
}
class GUI2
{
  public static void main(String a[])
  {
    MarvallousFrame mobj = new MarvallousFrame("PPA");
  }
}


   
