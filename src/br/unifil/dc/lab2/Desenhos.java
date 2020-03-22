package br.unifil.dc.lab2;

import java.awt.*;

/**
 * Write a description of class Desenhos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desenhos
{
    public static void desenhoLivre(Graphics2D pincel, Dimension dim) {

    }
    
    public static void desenharAsterisco(Graphics2D g2d, Dimension dim) {
        double offsetP = 0.075 * dim.width;
        double startP = 0.1 * dim.width;
        double endP = dim.width * 0.9;
        double midP = (startP + endP) / 2;
        if ((endP * 1.1) > dim.height ){
            offsetP = 0.075 * dim.height;
            startP = 0.1 * dim.width;
            endP = dim.height * 0.9;
            midP = (startP + endP) / 2;
        }
        g2d.drawLine((int) midP, (int) startP,(int) midP,(int) endP);
        g2d.drawLine((int) startP, (int) midP, (int) endP, (int) midP);
        g2d.drawLine((int) (startP + offsetP), (int) (startP + offsetP), (int) (endP - offsetP), (int) (endP - offsetP));
        g2d.drawLine((int) (endP - offsetP), (int) (startP + offsetP), (int) (startP + offsetP), (int) (endP - offsetP));
    }

    public static void desenharSmiles(Graphics2D g2d, Dimension dim){
        double startP = 0.1 * dim.width;
        double endP = 0.9 * dim.width;
        double width = dim.width / 5;
        double height = width;
        double step = ((endP - startP) - (width * 3)) / 2;

        double borderSize = width * 0.08;

        double eyeX = startP + (width / 2);
        double eyeY = startP + (height / 3);

        double eyeX2 = (startP + width + step) + (width / 2);

        double eyeX3 = (startP + width * 2 + step * 2) + (width / 2);

        double eyeDist = width / 6;

        double eyebrowHeightLower = eyeY - (width / 15);

        double eyebrowHeightTop = eyebrowHeightLower - (width / 20);

        double eyebrowLength = (width / 2) * 0.5;

        double eyeSize = width * 0.2;
        g2d.setColor(Color.RED);
        g2d.fillOval((int) startP, (int) startP,(int) width,(int) height);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke((int) borderSize));
        g2d.drawOval((int) startP, (int) startP,(int) width,(int) height);
        g2d.fillOval((int) ((eyeX + eyeDist) - (eyeSize / 2)), (int) eyeY, (int) eyeSize, (int) eyeSize);
        g2d.fillOval((int) ((eyeX - eyeDist) - (eyeSize / 2)), (int) eyeY, (int) eyeSize, (int) eyeSize);
        g2d.drawPolyline(new int[]{(int) (eyeX - eyebrowLength), (int) eyeX, (int) (eyeX + eyebrowLength)}, new int[]{(int) eyebrowHeightTop, (int) eyebrowHeightLower, (int) eyebrowHeightTop}, 3);
        g2d.drawArc((int) (startP + (width * 0.2)), (int) (eyeY + width * 0.25), (int) ((width * 0.6)), (int) (height / 3), 0, 180);

        g2d.setColor(Color.YELLOW);
        g2d.fillOval((int) (startP + width + step), (int) startP,(int) width,(int) height);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke((int) borderSize));
        g2d.drawOval((int) (startP + width + step), (int) startP,(int) width,(int) height);
        g2d.fillOval((int) ((eyeX2 + eyeDist) - (eyeSize / 2)), (int) eyeY, (int) eyeSize, (int) eyeSize);
        g2d.fillOval((int) ((eyeX2 - eyeDist) - (eyeSize / 2)), (int) eyeY, (int) eyeSize, (int) eyeSize);
        g2d.drawLine((int) ((startP + width + step) + (width * 0.2)), (int) (eyeY + width * 0.3), (int) ((startP + width + step) + width * 0.8), (int) (eyeY + width * 0.3));

        g2d.setColor(Color.GREEN);
        g2d.fillOval((int) (startP + width * 2 + step * 2), (int) startP,(int) width,(int) height);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke((int) borderSize));
        g2d.drawOval((int) (startP + width * 2 + step * 2), (int) startP,(int) width,(int) height);
        g2d.fillOval((int) ((eyeX3 + eyeDist) - (eyeSize / 2)), (int) eyeY, (int) eyeSize, (int) eyeSize);
        g2d.fillOval((int) ((eyeX3 - eyeDist) - (eyeSize / 2)), (int) eyeY, (int) eyeSize, (int) eyeSize);
        g2d.fillArc((int) ((startP + width * 2 + step * 2) + (width * 0.2)), (int) (eyeY + width * 0.1), (int) ((width * 0.6)), (int) (height / 2.5), 0, -180);
    }
    
}
