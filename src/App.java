import javax.swing.JFrame;


public class App {
    public static void main(String[] args) throws Exception {

        int rowCount= 21;
        int columnCount= 19;
        int tileSize= 32;
        int boardWidth= columnCount*tileSize;
        int boardHeight= rowCount*tileSize;

        JFrame frame= new JFrame("Pac Man");
        //frame.setVisible(true);//make the window visible
        frame.setSize(boardWidth, boardHeight);//set the size of the window
        frame.setLocationRelativeTo(null);//center the window
        frame.setResizable(false);//user can't resize the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the window when user click the close button(or the X button)

        PacMan pacmanGame= new PacMan();// represents the JPanel
        frame.add(pacmanGame);//add the JPanel to the JFrame
        frame.pack();
        frame.setVisible(true);

    }

    
}
