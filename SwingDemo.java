import javax.swing.*;


class MarvallousFrame
{
  public JFrame fobj;
  
  public MarvallousFrame(String title)
  {
    JFrame fobj = new JFrame(title);
    fobj.setSize(400,400);
    fobj.setVisible(true);
  }
}
class SwingDemo
{
  public static void main(String a[])
  {
    MarvallousFrame mobj = new MarvallousFrame("PPA");
  }
}


   
