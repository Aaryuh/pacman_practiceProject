import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Random;
import javax.swing.*;

public class PacMan extends JPanel {
    //JPanel will have the same size as the JFrame(window)
    private int rowCount= 21;
    private int columnCount= 19;
    private int tileSize= 32;
    private int boardWidth= columnCount*tileSize;
    private int boardHeight= rowCount*tileSize;

    private Image wallImage;
    private Image blueGhostImage;
    private Image orangeGhostImage;
    private Image pinkGhostImage;
    private Image redGhostImage;

    private Image pacmanUpImage;
    private Image pacmanDownImage;
    private Image pacmanLeftImage;
    private Image pacmanRightImage;

    PacMan(){
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLACK);
        
        //load images
        wallImage= new ImageIcon(getClass().getResource("./wall.png")).getImage();// (./) means the current directory, which is src, and (.getImage()) is used to convert the image to an Image object from ImageIcon.
        blueGhostImage= new ImageIcon(getClass().getResource("./blueGhost.png")).getImage();
        orangeGhostImage= new ImageIcon(getClass().getResource("./orangeGhost.png")).getImage();
        pinkGhostImage= new ImageIcon(getClass().getResource("./pinkGhost.png")).getImage();
        redGhostImage= new ImageIcon(getClass().getResource("./redGhost.png")).getImage();

        pacmanUpImage= new ImageIcon(getClass().getResource("./pacmanUp.png")).getImage();
        pacmanDownImage= new ImageIcon(getClass().getResource("./pacmanDown.png")).getImage();  
        pacmanLeftImage= new ImageIcon(getClass().getResource("./pacmanLeft.png")).getImage();
        pacmanRightImage= new ImageIcon(getClass().getResource("./pacmanRight.png")).getImage();

    }

}
