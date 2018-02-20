import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import javax.swing.UIManager;

public class Menu implements ActionListener
{	
	JFrame frame = new JFrame("Christopher's Notepad");
	JMenuBar menuBar = new JMenuBar();
	public Menu ()
	{
		
		frame.setLayout( new FlowLayout() );
		frame.setSize( 400, 200 );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		ImageIcon image = new ImageIcon("Icon.png");
		frame.setIconImage( image.getImage() );

		create_File_menu_item();
		create_Edit_menu_item();
		create_Format_menu_item();
		create_View_menu_item();
		create_Help_menu_item();

		frame.setJMenuBar(menuBar);
		frame.setVisible(true);
	}
	// creating a dialogue and j font choose
	// asked to create a simple menu and it will open a file chooser dialogue and open file
	// jcolorchooser 
	// look at module 9 for file/color chooser
	public void create_File_menu_item ()
	{
		JMenu file = new JMenu("File");
		file.setMnemonic('f');
		menuBar.add(file);

		// File > New
		JMenuItem _new = new JMenuItem("New");
		_new.setAccelerator( KeyStroke.getKeyStroke( KeyEvent.VK_N, Event.CTRL_MASK ) );
		file.add(_new);

		// File > Open
		JMenuItem open = new JMenuItem("Open...");
		open.setAccelerator( KeyStroke.getKeyStroke( KeyEvent.VK_O, Event.CTRL_MASK ) );
		file.add(open);


		file.addSeparator();

		JMenuItem exit = new JMenuItem("Exit");
		exit.setMnemonic('x');
		file.add(exit);

	}
	public void create_Edit_menu_item ()
	{
		JMenu edit = new JMenu("Edit");
		edit.setMnemonic('e');
		menuBar.add(edit);
	}
	public void create_Format_menu_item ()
	{
		JMenu format = new JMenu("Format");
		format.setMnemonic('o');
		menuBar.add(format);
	}
	public void create_View_menu_item ()
	{
		JMenu view = new JMenu ("View");
		view.setMnemonic('v');
		menuBar.add(view);
		frame.add(menuBar);
		
		JMenuItem statusBar = new JMenuItem("Status Bar");
		view.add(statusBar);

	}
	public void create_Help_menu_item ()
	{
		JMenu help = new JMenu("Help");
		help.setMnemonic('h');
		menuBar.add(help);	
	}
	public void actionPerformed ( ActionEvent e )
	{

	}
	public static void main ( String[] args )
	{
		try {
            // Set cross-platform Java L&F (also called "Metal")
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
    } 
    catch (UnsupportedLookAndFeelException e) {
       // handle exception
    }
    catch (ClassNotFoundException e) {
       // handle exception
    }
    catch (InstantiationException e) {
       // handle exception
    }
    catch (IllegalAccessException e) {
       // handle exception
    }
		SwingUtilities.invokeLater( () -> 
		{
			new Menu();
		});
	}
}