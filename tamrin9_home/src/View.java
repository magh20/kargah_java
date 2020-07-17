import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Jun 30 17:56:51 IRDT 2020
 */
public class View {
    List<Integer> courseList = new ArrayList<>();
    String myCourses;
    public View() {
        initComponents();
        main.setVisible(true);
    }
    private void newBtnMouseClicked(MouseEvent e) {
        main.setVisible(false);
        try {
            lbl1.setText(Service.getInstance().report().get(0).getId()+"\\"+Service.getInstance().report().get(0).getName()+"\\"+Service.getInstance().report().get(0).getTeacher()+"\\"+Service.getInstance().report().get(0).getCapacity()+"\\"+Service.getInstance().report().get(0).getRequirements());
            lbl2.setText(Service.getInstance().report().get(1).getId()+"\\"+Service.getInstance().report().get(1).getName()+"\\"+Service.getInstance().report().get(1).getTeacher()+"\\"+Service.getInstance().report().get(1).getCapacity()+"\\"+Service.getInstance().report().get(1).getRequirements());
            lbl3.setText(Service.getInstance().report().get(2).getId()+"\\"+Service.getInstance().report().get(2).getName()+"\\"+Service.getInstance().report().get(2).getTeacher()+"\\"+Service.getInstance().report().get(2).getCapacity()+"\\"+Service.getInstance().report().get(2).getRequirements());
            lbl4.setText(Service.getInstance().report().get(3).getId()+"\\"+Service.getInstance().report().get(3).getName()+"\\"+Service.getInstance().report().get(3).getTeacher()+"\\"+Service.getInstance().report().get(3).getCapacity()+"\\"+Service.getInstance().report().get(3).getRequirements());
            lbl5.setText(Service.getInstance().report().get(4).getId()+"\\"+Service.getInstance().report().get(4).getName()+"\\"+Service.getInstance().report().get(4).getTeacher()+"\\"+Service.getInstance().report().get(4).getCapacity()+"\\"+Service.getInstance().report().get(4).getRequirements());
            lbl6.setText(Service.getInstance().report().get(5).getId()+"\\"+Service.getInstance().report().get(5).getName()+"\\"+Service.getInstance().report().get(5).getTeacher()+"\\"+Service.getInstance().report().get(5).getCapacity()+"\\"+Service.getInstance().report().get(5).getRequirements());
            lbl7.setText(Service.getInstance().report().get(6).getId()+"\\"+Service.getInstance().report().get(6).getName()+"\\"+Service.getInstance().report().get(6).getTeacher()+"\\"+Service.getInstance().report().get(6).getCapacity()+"\\"+Service.getInstance().report().get(6).getRequirements());
            lbl8.setText(Service.getInstance().report().get(7).getId()+"\\"+Service.getInstance().report().get(7).getName()+"\\"+Service.getInstance().report().get(7).getTeacher()+"\\"+Service.getInstance().report().get(7).getCapacity()+"\\"+Service.getInstance().report().get(7).getRequirements());
            lbl9.setText(Service.getInstance().report().get(8).getId()+"\\"+Service.getInstance().report().get(8).getName()+"\\"+Service.getInstance().report().get(8).getTeacher()+"\\"+Service.getInstance().report().get(8).getCapacity()+"\\"+Service.getInstance().report().get(8).getRequirements());
            lbl10.setText(Service.getInstance().report().get(9).getId()+"\\"+Service.getInstance().report().get(9).getName()+"\\"+Service.getInstance().report().get(9).getTeacher()+"\\"+Service.getInstance().report().get(9).getCapacity()+"\\"+Service.getInstance().report().get(9).getRequirements());
            lbl11.setText(Service.getInstance().report().get(10).getId()+"\\"+Service.getInstance().report().get(10).getName()+"\\"+Service.getInstance().report().get(10).getTeacher()+"\\"+Service.getInstance().report().get(10).getCapacity()+"\\"+Service.getInstance().report().get(10).getRequirements());
            lbl12.setText(Service.getInstance().report().get(11).getId()+"\\"+Service.getInstance().report().get(11).getName()+"\\"+Service.getInstance().report().get(11).getTeacher()+"\\"+Service.getInstance().report().get(11).getCapacity()+"\\"+Service.getInstance().report().get(11).getRequirements());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        newFrm.setVisible(true);
    }
    private void backBtnMouseClicked(MouseEvent e) {
        newFrm.setVisible(false);
        main.setVisible(true);
    }
    private void lbl1MouseClicked(MouseEvent e) {
        addCourse(1);
    }
    private void lbl2MouseClicked(MouseEvent e) { addCourse(2); }
    private void lbl3MouseClicked(MouseEvent e) { addCourse(3); }
    private void lbl4MouseClicked(MouseEvent e) { addCourse(4); }
    private void lbl5MouseClicked(MouseEvent e) { addCourse(5); }
    private void lbl6MouseClicked(MouseEvent e) { addCourse(6); }
    private void lbl7MouseClicked(MouseEvent e) { addCourse(7); }
    private void lbl8MouseClicked(MouseEvent e) { addCourse(8); }
    private void lbl9MouseClicked(MouseEvent e) { addCourse(9); }
    private void lbl10MouseClicked(MouseEvent e) { addCourse(10); }
    private void lbl11MouseClicked(MouseEvent e) { addCourse(11); }
    private void lbl12MouseClicked(MouseEvent e) { addCourse(12); }
    public void addCourse(int id) {
        courseList.add(id);
        dialog.setVisible(true);
    }
    public void refreshCourses() {
        myCourses = "<html>";
        try {
            for (int id : courseList) {
                myCourses += String.valueOf(Service.getInstance().report().get(id-1).getId());
                myCourses += "\\";
                myCourses += Service.getInstance().report().get(id-1).getName();
                myCourses += "\\";
                myCourses += Service.getInstance().report().get(id-1).getTeacher();
                myCourses += "\\";
                myCourses += String.valueOf(Service.getInstance().report().get(id-1).getCapacity());
                myCourses += "\\";
                myCourses += Service.getInstance().report().get(id-1).getRequirements();
                myCourses += "<br/>";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        myCourses += "</html>";
        coursesLbl.setText(myCourses);
    }
    private void dltBtnMouseClicked(MouseEvent e) {
        main.setVisible(false);
        refreshCourses();
        editFrm.setVisible(true);
    }
    private void backBtn2MouseClicked(MouseEvent e) {
        editFrm.setVisible(false);
        main.setVisible(true);
    }
    private void removeBtnMouseClicked(MouseEvent e) {
        courseList.remove(courseList.indexOf(Integer.parseInt(courseFld.getText())));
        refreshCourses();
        dialog.setVisible(true);
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ali Kaghazgaran
        main = new JFrame();
        newBtn = new JButton();
        dltBtn = new JButton();
        newFrm = new JFrame();
        infoLbl = new JLabel();
        lbl1 = new JLabel();
        lbl2 = new JLabel();
        lbl3 = new JLabel();
        lbl4 = new JLabel();
        lbl5 = new JLabel();
        lbl6 = new JLabel();
        lbl7 = new JLabel();
        lbl8 = new JLabel();
        lbl9 = new JLabel();
        lbl10 = new JLabel();
        lbl11 = new JLabel();
        lbl12 = new JLabel();
        backBtn = new JButton();
        dialog = new JDialog();
        dialogLabel = new JLabel();
        editFrm = new JFrame();
        infoLbl2 = new JLabel();
        coursesLbl = new JLabel();
        courseFld = new JTextField();
        backBtn2 = new JButton();
        removeBtn = new JButton();
        label2 = new JLabel();

        //======== main ========
        {
            main.setTitle("Menu");
            main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            Container mainContentPane = main.getContentPane();
            mainContentPane.setLayout(new GridLayout(2, 1));

            //---- newBtn ----
            newBtn.setText("Choose New Courses");
            newBtn.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    newBtnMouseClicked(e);
                }
            });
            mainContentPane.add(newBtn);

            //---- dltBtn ----
            dltBtn.setText("Edit Selected Courses");
            dltBtn.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    dltBtnMouseClicked(e);
                }
            });
            mainContentPane.add(dltBtn);
            main.setSize(200, 150);
            main.setLocationRelativeTo(null);
        }

        //======== newFrm ========
        {
            newFrm.setTitle("Choose New Courses");
            Container newFrmContentPane = newFrm.getContentPane();
            newFrmContentPane.setLayout(new GridLayout(14, 0));

            //---- infoLbl ----
            infoLbl.setText("Click On Couse Information To Add! (ID\\Name\\Teacher\\Capacity\\Requirements)");
            infoLbl.setHorizontalAlignment(SwingConstants.CENTER);
            newFrmContentPane.add(infoLbl);

            //---- lbl1 ----
            lbl1.setText("text");
            lbl1.setHorizontalAlignment(SwingConstants.CENTER);
            lbl1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbl1MouseClicked(e);
                }
            });
            newFrmContentPane.add(lbl1);

            //---- lbl2 ----
            lbl2.setText("text");
            lbl2.setHorizontalAlignment(SwingConstants.CENTER);
            lbl2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbl2MouseClicked(e);
                }
            });
            newFrmContentPane.add(lbl2);

            //---- lbl3 ----
            lbl3.setText("text");
            lbl3.setHorizontalAlignment(SwingConstants.CENTER);
            lbl3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbl3MouseClicked(e);
                }
            });
            newFrmContentPane.add(lbl3);

            //---- lbl4 ----
            lbl4.setText("text");
            lbl4.setHorizontalAlignment(SwingConstants.CENTER);
            lbl4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbl4MouseClicked(e);
                }
            });
            newFrmContentPane.add(lbl4);

            //---- lbl5 ----
            lbl5.setText("text");
            lbl5.setHorizontalAlignment(SwingConstants.CENTER);
            lbl5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbl5MouseClicked(e);
                }
            });
            newFrmContentPane.add(lbl5);

            //---- lbl6 ----
            lbl6.setText("text");
            lbl6.setHorizontalAlignment(SwingConstants.CENTER);
            lbl6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbl6MouseClicked(e);
                }
            });
            newFrmContentPane.add(lbl6);

            //---- lbl7 ----
            lbl7.setText("text");
            lbl7.setHorizontalAlignment(SwingConstants.CENTER);
            lbl7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbl7MouseClicked(e);
                }
            });
            newFrmContentPane.add(lbl7);

            //---- lbl8 ----
            lbl8.setText("text");
            lbl8.setHorizontalAlignment(SwingConstants.CENTER);
            lbl8.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbl8MouseClicked(e);
                }
            });
            newFrmContentPane.add(lbl8);

            //---- lbl9 ----
            lbl9.setText("text");
            lbl9.setHorizontalAlignment(SwingConstants.CENTER);
            lbl9.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbl9MouseClicked(e);
                }
            });
            newFrmContentPane.add(lbl9);

            //---- lbl10 ----
            lbl10.setText("text");
            lbl10.setHorizontalAlignment(SwingConstants.CENTER);
            lbl10.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbl10MouseClicked(e);
                }
            });
            newFrmContentPane.add(lbl10);

            //---- lbl11 ----
            lbl11.setText("text");
            lbl11.setHorizontalAlignment(SwingConstants.CENTER);
            lbl11.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbl11MouseClicked(e);
                }
            });
            newFrmContentPane.add(lbl11);

            //---- lbl12 ----
            lbl12.setText("text");
            lbl12.setHorizontalAlignment(SwingConstants.CENTER);
            lbl12.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbl12MouseClicked(e);
                }
            });
            newFrmContentPane.add(lbl12);

            //---- backBtn ----
            backBtn.setText("Back");
            backBtn.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    backBtnMouseClicked(e);
                }
            });
            newFrmContentPane.add(backBtn);
            newFrm.setSize(800, 580);
            newFrm.setLocationRelativeTo(null);
        }

        //======== dialog ========
        {
            Container dialogContentPane = dialog.getContentPane();
            dialogContentPane.setLayout(new GridLayout());

            //---- dialogLabel ----
            dialogLabel.setText("Succesful");
            dialogLabel.setHorizontalAlignment(SwingConstants.CENTER);
            dialogContentPane.add(dialogLabel);
            dialog.setSize(150, 75);
            dialog.setLocationRelativeTo(null);
        }

        //======== editFrm ========
        {
            editFrm.setTitle("Course List");
            Container editFrmContentPane = editFrm.getContentPane();

            //---- infoLbl2 ----
            infoLbl2.setText("(ID\\Name\\Teacher\\Capacity\\Requirements)");
            infoLbl2.setHorizontalAlignment(SwingConstants.CENTER);

            //---- coursesLbl ----
            coursesLbl.setText("text");
            coursesLbl.setHorizontalAlignment(SwingConstants.CENTER);

            //---- backBtn2 ----
            backBtn2.setText("Back");
            backBtn2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    backBtn2MouseClicked(e);
                }
            });

            //---- removeBtn ----
            removeBtn.setText("Remove");
            removeBtn.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    removeBtnMouseClicked(e);
                }
            });

            //---- label2 ----
            label2.setText("Enter Course ID to remove:");

            GroupLayout editFrmContentPaneLayout = new GroupLayout(editFrmContentPane);
            editFrmContentPane.setLayout(editFrmContentPaneLayout);
            editFrmContentPaneLayout.setHorizontalGroup(
                editFrmContentPaneLayout.createParallelGroup()
                    .addGroup(editFrmContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(courseFld, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeBtn)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn2, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(editFrmContentPaneLayout.createSequentialGroup()
                        .addGroup(editFrmContentPaneLayout.createParallelGroup()
                            .addComponent(infoLbl2, GroupLayout.PREFERRED_SIZE, 798, GroupLayout.PREFERRED_SIZE)
                            .addComponent(coursesLbl, GroupLayout.PREFERRED_SIZE, 798, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
            );
            editFrmContentPaneLayout.setVerticalGroup(
                editFrmContentPaneLayout.createParallelGroup()
                    .addGroup(editFrmContentPaneLayout.createSequentialGroup()
                        .addComponent(infoLbl2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coursesLbl, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editFrmContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(backBtn2)
                            .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeBtn)
                            .addComponent(courseFld, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
            );
            editFrm.setSize(800, 415);
            editFrm.setLocationRelativeTo(null);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ali Kaghazgaran
    private JFrame main;
    private JButton newBtn;
    private JButton dltBtn;
    private JFrame newFrm;
    private JLabel infoLbl;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JLabel lbl7;
    private JLabel lbl8;
    private JLabel lbl9;
    private JLabel lbl10;
    private JLabel lbl11;
    private JLabel lbl12;
    private JButton backBtn;
    private JDialog dialog;
    private JLabel dialogLabel;
    private JFrame editFrm;
    private JLabel infoLbl2;
    private JLabel coursesLbl;
    private JTextField courseFld;
    private JButton backBtn2;
    private JButton removeBtn;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}