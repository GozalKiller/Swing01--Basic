package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window extends JFrame {

    public static final int MARGIN = 5; //משתנה קבוע לשוליים(גבולות המסך)
    //JButton button1 = new JButton();// נראלי שפה המיקום



    public Window() { //לא בטוח שזה צריך להיות בתוך הבנאי!!!
        JButton button1 = new JButton();
        this.setSize(1920, 1080); // מידות של החלון
        this.setLayout(null); // פריסה של רכיבים על החלון לגבי תצוגת לחצנים(חייב את האופציה הזו)
        this.setTitle("Test02");// כותרת לחלון
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// הפעלת האיקס לסגירת החלון
        this.setBounds(0, 0, 1920, 1080);//אחרי על המידות של הפאנל!
        this.setResizable(false); //ניתן לשנות את גודל המסך בזמן שהוא פועל
        this.setLocationRelativeTo(null);// פותח את החלון במרכז עדיף למקם בסוף יש השפעה למיקום הקוד
        this.add(button1);// הוספת הלחצן

        //Font font = new Font("Monospaced", Font.PLAIN, 10);//אובייקט שמשנה את הכתב והגודל והסטייל
        button1.setText("Click me"); // כיתוב ללחצן
        button1.setForeground(Color.white);// צבע לכיתוב של הטקסט
        button1.setBackground(Color.black); // רקע ללחצן
        button1.setBounds(120, 180, 300, 40); // גודל הלחצן
        this.setVisible(true); // ייצוג פעיל
        button1.addActionListener(event -> { //פעולה לאחר לחיצה
            System.out.println("Check"); // הדפסת "בדיקה" לאחר לחיצה
            //button1.addMouseListener(MyMouseListener(window));


        });



        //לחצן שני לא פעיל, היה מופיע
        /*JButton button2 = new JButton("Click2"); //אובייקט ללחצן מספר 2
        button2.setBounds(
                button1.getX(),
                button1.getY() + getHeight() + MARGIN,
                button1.getWidth(),
                button1.getHeight());// אם עושים שינוי בגודל לכפתור הראשון הכפתור השני עכשיו יושפע ביחד איתו כדי לשמור על אחדות
        this.add(button2);
        this.setSize(800, 600);
        button2.setBackground(Color.darkGray);
        button2.setForeground(Color.white);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        button2.setVisible(true);
        button2.addActionListener(event2 -> {
            System.out.println("Works");
        });


*/
    }



}

    //button1.setVisible(!button1.isVisible());// כפתור כמתג מופיע נעלם מופיע נעלם



