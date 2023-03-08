package arkhipov.pictures;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class GrayPicture {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BufferedImage myImage = ImageIO.read(new File("D:\\docs\\jimage\\calvados.jpg"));
        Image scaled = myImage.getScaledInstance(1200, 800, Image.SCALE_AREA_AVERAGING);

        BufferedImage scaledImage = toBufferedImage(scaled);

        JLabel pickLabel = new JLabel(new ImageIcon(toGray(scaledImage)));
//        JLabel pickLabel = new JLabel(new ImageIcon(scaled));

        BorderLayout borderLayout = new BorderLayout();
        frame.getContentPane().setLayout(borderLayout);
        frame.getContentPane().add(pickLabel, BorderLayout.CENTER);
        frame.setVisible(true);

//        Arrays.setAll();
    }

    public static BufferedImage toGray(BufferedImage source) {
        BufferedImage grayImage = new BufferedImage(source.getWidth(), source.getHeight(), BufferedImage.TYPE_BYTE_GRAY);

        byte[] outBuffer = ((DataBufferByte) grayImage.getRaster().getDataBuffer()).getData();
        int[] inBuffer = ((DataBufferInt) source.getRaster().getDataBuffer()).getData();

        for (int i = 0; i < source.getWidth() * source.getHeight(); i++) {
            int color = inBuffer[i];
            int r = (color >> 16 & 0xff);
            int g = color >> 8 & 0xff;
            int b = color & 0xff;
            int gray = (r + g + b) / 3;

            outBuffer[i] = (byte) gray;
        }

        return grayImage;
    }

    public static BufferedImage toBufferedImage(Image img) {
        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        return bimage;
    }

}
