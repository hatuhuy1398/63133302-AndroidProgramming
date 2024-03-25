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
        JTextField name = new JTextField() ;
        name.setBounds(40,40,120,20);
        JTextField Lname = new JTextField();
        Lname.setBounds(name.getLocation().x,name.getLocation().x+40,120,20);
        pan1.add(addBtn);
        pan1.add(name);
        pan1.add(Lname);
        JTextField search = new JTextField();
        pan.add(search);
        JLabel FName = new JLabel ("Họ :");
        JLabel LName = new JLabel ("Tên :");
        JLabel sexe = new JLabel ("Giới tính  :");
        JLabel bd = new JLabel ("Tuổi  :");
        JLabel field = new JLabel ("Chiều cao");
        JLabel field2 = new JLabel ("Cân nặng");
        JLabel searchLab = new JLabel ("Tìm kiếm");
        pan.add(searchLab);
        searchLab.setBounds(delete.getLocation().x-320,delete.getLocation().y , delete.getSize().width,delete.getSize().height);
        search.setBounds(searchLab.getLocation().x+80,searchLab.getLocation().y , name.getSize().width,name.getSize().height);
        JSpinner aut = new JSpinner(new SpinnerNumberModel(1.50,null,null,0.01));
        pan1.add(aut);
        JSpinner poid = new JSpinner(new SpinnerNumberModel(55,40,null,1));
        pan1.add(poid);
        pan1.add(bd);
        pan1.add(field);
        pan1.add(field2);
        pan1.add(sexe);
        JRadioButton male = new JRadioButton("Nam ");
        JRadioButton female = new JRadioButton("Nữ ");
        ButtonGroup gender = new ButtonGroup();
        JSpinner age = new JSpinner(new SpinnerNumberModel(19,18,65,1));
        pan1.add(age);
        age.setBounds(40,240,Lname.getSize().width,Lname.getSize().height+10);
        field.setBounds(age.getLocation().x,age.getLocation().y+40,Lname.getSize().width,Lname.getSize().height+10);
        field2.setBounds(age.getLocation().x+70,age.getLocation().y+40,(Lname.getSize().width)+10/2,Lname.getSize().height+10);
        aut.setBounds(field.getLocation().x,field.getLocation().y+30,(Lname.getSize().width)/2,Lname.getSize().height+10);
        poid.setBounds(field.getLocation().x+70,field.getLocation().y+30,(Lname.getSize().width)/2,Lname.getSize().height+10);
        bd.setBounds(age.getLocation().x,age.getLocation().y-30,Lname.getSize().width,Lname.getSize().height+10);
        gender.add(male);
        gender.add(female);
        pan1.add(male);
        pan1.add(female);
        male.setBounds(Lname.getLocation().x , Lname.getLocation().y+60,Lname.getSize().width,Lname.getSize().height+10);
        female.setBounds(Lname.getLocation().x , Lname.getLocation().y+85,Lname.getSize().width,Lname.getSize().height+10);
        FName.setBounds(name.getLocation().x , name.getLocation().y-20,name.getSize().width,name.getSize().height);
        LName.setBounds(Lname.getLocation().x , Lname.getLocation().y-20,Lname.getSize().width,Lname.getSize().height);
        sexe.setBounds(male.getLocation().x , male.getLocation().y-30,Lname.getSize().width,Lname.getSize().height+10);
        pan1.add(FName);
        pan1.add(LName);
        JLabel copyright = new JLabel("-----   Copyright by Hà Tứ Huy   -----");
        copyright.setBounds(350,545,300,20);
        pan.add(copyright,BorderLayout.PAGE_END);
        JPanel pan2 = new JPanel () ;
        pan2.setBounds(50,50,300,400);
        pan2.setBounds(pan1.getLocation().x+300,pan1.getLocation().x,500,pan1.getSize().height);
        pan2.setBorder(BorderFactory.createLineBorder(Color.black));
        pan.add(pan2);
        String[] columns = {"Họ ","Tên ","Tuổi ","Giới Tính ","Chỉ số BMI","Trạng thái "};
        DefaultTableModel model = new DefaultTableModel(columns,0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setVisible(true);
        pan2.add(scrollPane);
        TableColumn column= null ;
        for (int i = 0; i < 6; i++) {
            column = table.getColumnModel().getColumn(i);
            if (i == 2) {
                column.setPreferredWidth(100);
            } else {
                column.setPreferredWidth(75);
                 }
            }
            Object data1 [] =  { 
                          "Hà",
                          "Tứ Huy",
                          "20",
                          "Nam ",
                          "21",
                          "Bình thường",
                      } ;
            
        
	}

}
