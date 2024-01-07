import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.Canvas;

class shinchan extends Canvas{
    public void paint(Graphics g){
// pakkana unna chinna toy
        g.setColor(Color.red);
        g.fillRect(395,395,40,40);
        g.setColor(Color.white);
        g.fillOval(402,402,9,9);
        g.setColor(Color.white);
        g.fillOval(420,402,9,9);
        g.fillRect(405,420,24,8);
        g.setColor(Color.black);
        g.fillOval(405,405,3,3);
        g.fillOval(423,405,3,3);
        g.setColor(Color.red);
        g.fillRect(402,375,4,20);
        g.fillOval(399,370,10,10);

//right shoe
        g.setColor(Color.black);

        g.drawLine(145,435,173,435);//straight line
        g.drawLine(145,435,155,430);
        g.drawLine(155,430,158,420);
        g.drawLine(158,420,160,420);
        g.drawLine(160,420,160,427);
        g.drawLine(160,427,168,427);
        g.drawLine(168,427,173,435);
        g.drawLine(158,420,158,385);
        g.drawLine(158,420,168,420); //st line
//color clr=new color(255,179,86);
//g.setcolor(clr);
        g.setColor(Color.pink);
        int c[]={158,168,168,158,160};
        int d[]={420,420,385,385,420};
        g.fillPolygon(c,d,5);
        g.setColor(Color.black);

        int x[]={145,173,168,160,160,158,155};
        int y[]={435,435,427,427,420,420,430};


        g.fillPolygon(x,y,7);
        g.drawLine(168,427,168,385);
//left leg
        g.drawLine(213,435,243,435);
        g.drawLine(213,435,216,427);
        g.drawLine(216,427,216,420);
        g.drawLine(216,420,220,420);
        g.drawLine(220,420,220,428);
        g.drawLine(220,428,229,428);
        g.drawLine(229,428,243,435);
        g.drawLine(218,420,216,385);
        g.drawLine(229,428,229,385);
        g.drawLine(216,420,229,420);// st line for shoe socks

        g.setColor(Color.pink);
        int a[]={219,220,229,229,219};
        int b[]={419,420,420,385,386};

        g.fillPolygon(a,b,5);//for leg skin colour



        g.setColor(Color.black);
        int a2[]={216,216,213,243,229,220,220};
        int b2[]={420,427,435,435,428,428,420};

        g.fillPolygon(a2,b2,7);
        g.drawLine(158,420,168,420);
        g.drawLine(216,420,229,420);



//pant

        g.setColor(Color.black);
        g.drawLine(140,385,195,385);
        g.drawLine(196,385,197,380);
        g.drawLine(203,385,197,380);
        g.drawLine(203,385,250,385);
        g.drawLine(197,380,190,370);
        g.setColor(Color.black);
        g.drawLine(140,385,137,350);
        g.drawLine(250,385,250,350);

        g.setColor(Color.black);
        g.drawLine(132,350,250,349);
        g.drawLine(132,349,250,350);


        g.setColor(Color.yellow);
        int a1[]={142,195,197,190,203,250,250,139};
        int b1[]={385,385,380,370,385,385,350,350};

        g.fillPolygon(a1,b1,8);


        g.setColor(Color.black);
//shirt
        g.drawLine(132,350,139,290);
        g.drawLine(250,350,250,300);

        g.drawLine(158,420,168,420);
        g.drawLine(216,420,229,420);
        g.drawLine(135,305,115,250);
//hand right
        g.drawLine(115,250,123,244);


        g.drawLine(123,244,154,269);
        g.drawLine(116,248,108,238);
        g.drawLine(120,245,113,236);//hand neck connector
//toy
        g.drawLine(97,242,124,230);
        g.drawLine(97,242,89,227);
        g.drawLine(89,227,115,217);
        g.drawLine(115,217,124,230);
        g.drawLine(113,219,121,231);


//box hand madyalo unna hand ki colour

        g.drawLine(118,250,108,238);
        g.setColor(Color.pink);
        int k[]={118,108,113,121};
        int l[]={250,238,236,244};
        g.fillPolygon(k,l,4);
//left right join
        g.drawLine(154,269,250,260);
        g.drawLine(139,290,154,269);
        g.drawLine(250,300,310,258);
        g.setColor(Color.red);
        g.drawLine(139,290,250,300);
        int c1[]={135,139,154,123,115};
        int d1[]={305,290,269,244,250};
        g.fillPolygon(c1,d1,5);
        int c2[]={250,310,250};
        int d2[]={260,258,300};
        g.fillPolygon(c2,d2,3);
        int c3[]={310,320,250};
        int d3[]={258,275,300};
        g.fillPolygon(c3,d3,3);
        int c4[]={139,154,250,310,250};
        int d4[]={290,269,260,258,300};
        g.fillPolygon(c4,d4,5);
        g.drawLine(139,290,155,320);

        int c5[]={139,155,250};
        int d5[]={290,320,300};
        g.fillPolygon(c5,d5,3);

//point in middle

        g.drawLine(155,320,250,320);

        int c6[]={155,250,250};
        int d6[]={320,300,320};
        g.fillPolygon(c6,d6,3);

//colouring

        g.drawLine(155,320,132,350);

        int c7[]={139,155,132};
        int d7[]={290,320,350};
        g.fillPolygon(c7,d7,3);

        int c8[]={132,155,250,250};
        int d8[]={350,320,320,350};
        g.fillPolygon(c8,d8,4);



//dots in toy
        g.setColor(Color.green);
        int m[]={97,89,115,124};
        int n[]={242,227,217,230};
        g.fillPolygon(m,n,4);


        g.setColor(Color.yellow);
        g.fillOval(94,228,5,5);
        g.fillOval(103,230,5,5);
        g.fillOval(109,223,5,5);

//left hand
        g.setColor(Color.black);
        g.drawLine(250,300,320,275);
        g.drawLine(320,275,310,258);
        g.drawLine(310,258,250,260);
//fingers
        g.drawLine(313,262,318,258);
        g.drawLine(318,258,318,250);
        g.drawLine(318,250,322,258);
        g.drawLine(322,258,330,248);
        g.drawLine(330,248,329,257);
        g.drawLine(329,257,339,259);
        g.drawLine(339,259,330,262);
        g.drawLine(330,262,335,268);
        g.drawLine(335,268,324,265);
        g.drawLine(324,265,318,269);

        g.setColor(Color.pink); //orange
        int m1[]={313,318,318,322,330,329,339,330,337,329,318};
        int n1[]={262,259,250,259,249,257,259,263,267,264,268};
        g.fillPolygon(m1,n1,11);

//talakaii
        g.setColor(Color.pink);

        for(int i=0;i<46;i++)
            g.drawLine(155,280-i,270,260-i); //face colour pink

        g.setColor(Color.black);
        g.fillArc(155,179,115,72,0,180);//up head

        for(int i=0;i<9;i++)
            g.drawLine(262+i,214,262+i,239);//ear to downHead



        g.setColor(Color.pink);
        g.fillOval(140,230,60,54);//cheek
        g.fillOval(152,230,60,54);

        g.fillOval(175,220,60,54);

        g.fillOval(220,230,60,30);

        g.fillOval(175,240,70,30);


        g.setColor(Color.black);
        g.fillOval(160,190,100,50);


        g.setColor(Color.pink);
        g.fillOval(147,189,120,75);
//eyebrow
        g.setColor(Color.black);

        for(int i=0;i<10;i++){
            g.drawArc(169,195+i,30,24,0,180);
            g.drawArc(216,195+i,30,24,0,180);
        }

        g.drawArc(169,213,30,24,0,180);
        g.drawArc(216,213,30,24,0,180);

        //Eye
        g.fillOval(169,223,30,24);
        g.fillOval(216,223,30,24);
//eyeballs
        //g.setColor(Color.white);
        //g.fillOval(177,229,12,12);
        // g.fillOval(227,229,12,12);

//mouth
        Color co = new Color( 204,0,0);
        g.setColor(co);
        g.fillOval(154,258,35,30);




        try{ // eyes colours maradaniki

            for(int i=0;i<3;i++)
            {
                g.setColor(Color.white);
                g.fillOval(177,229,12,12);
                g.fillOval(227,229,12,12);
                Thread.sleep(500);
                g.setColor(Color.black);
                g.fillOval(177,229,12,12);
                g.fillOval(227,229,12,12);
                Thread.sleep(500);
                g.setColor(Color.red);
                g.fillOval(177,229,12,12);
                g.fillOval(227,229,12,12);
                Thread.sleep(500);
                g.setColor(Color.black);
                g.fillOval(177,229,12,12);
                g.fillOval(227,229,12,12);
                Thread.sleep(500);
                g.setColor(Color.green);
                g.fillOval(177,229,12,12);
                g.fillOval(227,229,12,12);
                Thread.sleep(500);
                g.setColor(Color.black);
                g.fillOval(177,229,12,12);
                g.fillOval(227,229,12,12);
                Thread.sleep(500);
                g.setColor(Color.blue);
                g.fillOval(177,229,12,12);
                g.fillOval(227,229,12,12);
                Thread.sleep(500);
                g.setColor(Color.black);
                g.fillOval(177,229,12,12);
                g.fillOval(227,229,12,12);
                Thread.sleep(500);
                g.setColor(Color.orange);
                g.fillOval(177,229,12,12);
                g.fillOval(227,229,12,12);
                Thread.sleep(500);
                g.setColor(Color.black);
                g.fillOval(177,229,12,12);
                g.fillOval(227,229,12,12);

                Thread.sleep(500);
            }
        }
        catch(Exception e){}
        g.setColor(Color.white);
        g.fillOval(177,229,12,12);
        g.fillOval(227,229,12,12);
    }

}

public class pravallika extends Thread{
    public static void main(String[] args) {

        JFrame f = new JFrame("SHINCHAN");

        f.setBounds(10,10,650,700);
//JButton b1 = new JButton("SHINCHAN");
//b1.setBounds(300,300,650,30);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        shinchan obj = new shinchan();

        f.add(obj);
//f.add(b1);
        f.setVisible(true);
        f.setLayout(new FlowLayout());







    }
}




