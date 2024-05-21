package cmss;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

public class DeveloperPage extends JFrame {

	private JPanel contentPane;
	private JButton homeButton;
	private JButton studentInformation;
	private JButton recordButton;
	private JButton viewRecordButton;
	private JButton paymentHistoryButton;
	private JButton makePaymentButton;
	private JButton addStudentButton;
	private JButton deleteStudentButton;
	private JButton developerButton;
	private JButton closeButton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblSamiulIslam;
	private JLabel lblOnBehalfOf;
	private JLabel lblBscEnggon;
	private JLabel lblEmailSamiulIslamgmailcom;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public DeveloperPage() {
		setTitle("Coaching Center Management - \"Developer\"");
        setIconImage(Toolkit.getDefaultToolkit().getImage(DeveloperPage.class.getResource("Student-3-icon.png")));

		//setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 599, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		homeButton = new JButton("Home");
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage homePage = new HomePage();
				homePage.setVisible(true);
				homePage.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
		homeButton.setBounds(10, 60, 131, 23);
		contentPane.add(homeButton);
		
		studentInformation = new JButton("Student Information");
		studentInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentInformationPage studentInformationPage = new StudentInformationPage();
				
				studentInformationPage.setVisible(true);
				studentInformationPage.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
		studentInformation.setBounds(10, 94, 131, 23);
		contentPane.add(studentInformation);
		
		recordButton = new JButton("Record");
		recordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RecordPage recordPage = new RecordPage();
				recordPage.setVisible(true);
				recordPage.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
		recordButton.setBounds(10, 128, 131, 23);
		contentPane.add(recordButton);
		
		viewRecordButton = new JButton("View Record");
		viewRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRecordPage viewRecordPage = new ViewRecordPage();
				viewRecordPage.setVisible(true);
				viewRecordPage.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
		viewRecordButton.setBounds(10, 162, 131, 23);
		contentPane.add(viewRecordButton);
		
		makePaymentButton = new JButton("Make Paymants");
		makePaymentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MakePaymentPage makePaymentPage = new MakePaymentPage();
				makePaymentPage.setVisible(true);
				makePaymentPage.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
		makePaymentButton.setBounds(10, 196, 131, 23);
		contentPane.add(makePaymentButton);
		
		paymentHistoryButton = new JButton("Payment History");
		paymentHistoryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentHistoryPage paymentHistoryPage = new PaymentHistoryPage();
				paymentHistoryPage.setVisible(true);
				paymentHistoryPage.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
		paymentHistoryButton.setBounds(10, 230, 131, 23);
		contentPane.add(paymentHistoryButton);
		
		addStudentButton = new JButton("Add Student");
		addStudentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudentPAge addStudentPAge = new AddStudentPAge();
				addStudentPAge.setVisible(true);
				addStudentPAge.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
		addStudentButton.setBounds(10, 264, 131, 23);
		contentPane.add(addStudentButton);
		
		deleteStudentButton = new JButton("Delete Student");
		deleteStudentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudentPage deleteStudentPage = new DeleteStudentPage();
				deleteStudentPage.setVisible(true);
				deleteStudentPage.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
		deleteStudentButton.setBounds(10, 298, 131, 23);
		contentPane.add(deleteStudentButton);
		
		closeButton = new JButton("Close");
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		closeButton.setForeground(Color.WHITE);
		closeButton.setBackground(Color.RED);
		closeButton.setBounds(10, 366, 131, 23);
		contentPane.add(closeButton);
		
		developerButton = new JButton("Developer");
		developerButton.setBackground(new Color(0, 255, 0));
		developerButton.setBounds(10, 332, 131, 23);
		contentPane.add(developerButton);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		//label.setIcon(new ImageIcon(DeveloperPage.class.getResource("jetlab full.png")));
		label.setBounds(10, 11, 131, 38);
		contentPane.add(label);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(DeveloperPage.class.getResource("samiul_3.jpg")));
		lblNewLabel.setBounds(200, 40, 325, 180);
		contentPane.add(lblNewLabel);
		
		//lblNewLabel_1 = new JLabel("");
		//lblNewLabel_1.setIcon(new ImageIcon(DeveloperPage.class.getResource("jetlab full.png")));
		//lblNewLabel_1.setBounds(348, 80, 187, 71);
		//contentPane.add(lblNewLabel_1);
		
		lblSamiulIslam = new JLabel("Samiul Islam");
		lblSamiulIslam.setHorizontalAlignment(SwingConstants.CENTER);
		lblSamiulIslam.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblSamiulIslam.setBounds(198, 234, 337, 38);
		contentPane.add(lblSamiulIslam);
		
		lblBscEnggon = new JLabel("B.Sc. Engg. (on going) in CSE, Bangladesh Army University of Engineering Technology");
		lblBscEnggon.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblBscEnggon.setHorizontalAlignment(SwingConstants.CENTER);
		lblBscEnggon.setBounds(197, 268, 338, 19);
		contentPane.add(lblBscEnggon);
		
		lblEmailSamiulIslamgmailcom = new JLabel("E-mail : islamsami.cse1999@gmail.com");
		lblEmailSamiulIslamgmailcom.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEmailSamiulIslamgmailcom.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailSamiulIslamgmailcom.setBounds(207, 289, 328, 23);
		contentPane.add(lblEmailSamiulIslamgmailcom);
	}
}
