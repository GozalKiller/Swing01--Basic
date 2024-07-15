package org.example;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener { // זימון מתודות של ממשק

   public MyMouseListener(){
       //this.window= window;

   }


    @Override
    public void mouseClicked(MouseEvent e) { //לחיצת קליק על רכיב
       //this.window.setForeground(Color.BLUE);
       //System.out.println("Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) { // קליק עד להורדת האצבע

    }

    @Override
    public void mouseReleased(MouseEvent e) {// //לחיצה בלי הורדת האצבע-לחיצה ארוכה

    }

    @Override
    public void mouseEntered(MouseEvent e) {// "שהעכבר נכנס לחלון עושה את הפעולה"
//לדגומא שהעכבר נמצא על החלון אז הרקע או הכפתור או הכיתוב של הכפתור משנים צבע
    }

    @Override
    public void mouseExited(MouseEvent e) {// "שהעכבר יוצא מהחלון עושה פעולה"

    }
}
