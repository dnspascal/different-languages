import java.awt.applet.*;
import java.awt.*;
/*<applet code=AppletDemo  width=400 height=500>
</applet>*/
public class AppletDemo extends Applet{
    public void init(){
        setBackground(Color.black);
        setForeground(Color.yellow);
    }
    public void paint(Graphics g){
        g.drawString("welcome to Applets",100,100);
    }
}