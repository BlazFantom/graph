/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafika;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import javax.swing.JPanel;

/**
 *
 * @author avbrodovschuk
 */
public class MyPanel extends JPanel{

MyPanel pan;
    RectangularShape rd;
Point2D[] pd;
    public MyPanel() {
       // rd= new Rectangle2D.Double();
        rd= new Ellipse2D.Double();
        pd = new Point2D[2];
        this.addMouseListener(new MouseAdapter() {
           
            @Override
            public void mousePressed(MouseEvent e) {
                pd[0]=e.getPoint();
            }

           
        });
        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
               pd[1]=e.getPoint();
               rd.setFrameFromDiagonal(pd[0],pd[1]);
               repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        
        });
        
    }
       @Override
        protected void paintComponent(Graphics g){
         super.paintComponent(g);
            Graphics2D g2=(Graphics2D)g;
            g2.draw(rd);
        
    }
    
    
    
}
