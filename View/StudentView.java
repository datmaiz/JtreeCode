package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class StudentView extends JPanel {
	JFrame jFrame;
	JTextField jTextFieldName;
	JTextField jTextFieldClass;
	JTextField jTextFieldID;
	JTable jTableStudents;
	JButton jButtonAdd;
	JButton jButtonEdit;
	String[] columns = new String[]{"Name", "Class", "ID"};
	String[][] rows = new String[][]{};
	public StudentView() {
		jFrame = new JFrame();
		jTextFieldName = new JTextField(20);
		jTextFieldClass = new JTextField(20);
		jTextFieldID = new JTextField(20);
		jTableStudents = new JTable(rows, columns);
		this.init();
	}

	private void init() {
		this.setLayout(new GridLayout(2, 1));
		this.add(inputPanel());
		this.add(outputPanel());
	}
	public JPanel inputPanel() {
		// construct components
		JPanel jPanelInput = new JPanel();
		JPanel jPanel = new JPanel();
		JLabel jLabelNameStudent = new JLabel("Name");
		JLabel jLabelClass = new JLabel();
		JLabel jLabelID = new JLabel();

		//construct Layout
		GridBagLayout gridBagLayout = new GridBagLayout();
		GridBagConstraints gridBagConstraints = new GridBagConstraints();

		// set up components
		setFontJText(jLabelNameStudent, "Arial", 1, 10);
		setFontJText(jLabelClass, "Arial", 1, 10);
		setFontJText(jLabelID, "Arial", 1, 10);

		jPanelInput.setLayout(gridBagLayout);
		jPanel.setLayout(new FlowLayout());
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.anchor = GridBagConstraints.EAST;
		gridBagConstraints.fill = GridBagConstraints.EAST;
		jPanelInput.add(jLabelNameStudent);
		gridBagConstraints.gridx++;
		jPanelInput.add(jTextFieldName);
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy++;
		jPanelInput.add(jLabelClass);
//		gridBagConstraints.gridx++;
//		jPanelInput.add(jTextFieldClass);
//		gridBagConstraints.gridx = 0;
//		gridBagConstraints.gridy++;
//		jPanelInput.add(jLabelID);
//		gridBagConstraints.gridx++;
//		jPanelInput.add(jTextFieldID);
		jPanelInput.setBorder(new TitledBorder(new LineBorder(new Color(135, 206,235)), ""));

		jPanel.add(jPanelInput);
		jPanel.add(buttonPanel());
		jPanel.setPreferredSize(new Dimension(300, 100));
		return jPanel;
	}

	public JPanel outputPanel() {
		JPanel jPanel = new JPanel();
		JScrollPane jScrollPane = new JScrollPane(jTableStudents);
		jPanel.add(jScrollPane);
		return jPanel;
	}
	public JPanel buttonPanel() {
		// construct components
		JPanel jPanel = new JPanel();
		jButtonAdd = new JButton("Add");
		jButtonEdit = new JButton("Edit");

		// set up component
		jButtonAdd.setFocusable(false);
		jButtonEdit.setFocusable(false);

		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
		jPanel.add(jButtonAdd);
		jPanel.add(jButtonEdit);
		return jPanel;
	}

	public void setFontJText(Component component,String font, int typeFont, int size) {
		component.setFont(new Font(font, typeFont, size));
	}
}
