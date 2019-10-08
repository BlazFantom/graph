/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafika;

import javax.swing.JFrame;

/**
 *
 * @author avbrodovschuk
 */
public class MyFrame extends JFrame{
    MyPanel myPanel;

    public MyFrame(MyPanel my) {
        this.myPanel = my;
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(myPanel);
        this.setVisible(true);
    }

   
    
}
