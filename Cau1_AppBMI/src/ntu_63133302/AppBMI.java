package ntu_63133302;
import javax.swing.* ;
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class AppBMI {
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Midterm Project ");
        TitledBorder winTitle = new TitledBorder("App BMI ") ;
        winTitle.setTitleJustification(TitledBorder.CENTER);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1000,600); 
        window.setResizable(false);
        
	}

}
