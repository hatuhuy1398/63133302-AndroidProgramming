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
        //parent panel
        JPanel pan = new JPanel();
        pan.setLayout(null);
        //left panel
        JPanel pan1 = new JPanel();
        pan1.setLayout(null);
        window.setContentPane(pan);
        pan.add(pan1);
        TitledBorder panTitle = new TitledBorder(" Thông tin của người dùng  ") ; 
        panTitle.setTitleJustification(TitledBorder.CENTER);
        pan.setBorder(winTitle);
        pan1.setBackground(Color.LIGHT_GRAY);
        pan1.setBounds(50,50,200,400);
        pan1.setBorder(panTitle);
        JButton addBtn = new JButton ("Thêm");
        addBtn.setBounds(30,370,150,20);
        JButton delete = new JButton ("Xoá");
        pan.add(delete);
        delete.setBounds(670,470,150,20);
        
	}

}
