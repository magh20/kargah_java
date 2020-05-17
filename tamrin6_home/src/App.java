import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App extends JFrame {
    Product product1, product2, product3;
    public App(Product product1, Product product2, Product product3) {
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;
        initComponents();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void productListMouseClicked(MouseEvent e) {
        pLDLabel1.setText("<html>" + product1.getName() + "<br/>" + product2.getName() + "<br/>" + product3.getName() + "</html>");
        pLDLabel2.setText("<html>" + product1.getPrice() + "<br/>" + product2.getPrice() + "<br/>" + product3.getPrice() + "</html>");
        productListDialog.setVisible(true);
    }

    private void buyButtonMouseClicked(MouseEvent e) {
        buyButton1.setText(product1.getName());
        buyButton2.setText(product2.getName());
        buyButton3.setText(product3.getName());
        buyDialog.setVisible(true);
    }
    private void buyNameFieldMouseClicked(MouseEvent e) {
        buyNameField.setText("");
    }
    private void buy(Product product) {
        if (buyNameField.getText().equals("") || buyNameField.getText().equals("Enter Full Name")) {
            unsuccessLabel.setText("Name field can't be empty");
            unsuccess.setVisible(true);
        }
        else {
            product.owners.add(buyNameField.getText());
            buyDialog.setVisible(false);
            success.setVisible(true);
            buyNameField.setText("Enter Full Name");
        }
    }
    private void buyButton1MouseClicked(MouseEvent e) { buy(product1); }
    private void buyButton2MouseClicked(MouseEvent e) { buy(product2); }
    private void buyButton3MouseClicked(MouseEvent e) { buy(product3); }

    private void returnButtonMouseClicked(MouseEvent e) {
        returnButton1.setText(product1.getName());
        returnButton2.setText(product2.getName());
        returnButton3.setText(product3.getName());
        returnDialog.setVisible(true);
    }
    private void textField1MouseClicked(MouseEvent e) {
        returnNameField.setText("");
    }
    private void returnA(Product product) {
        if (returnNameField.getText().equals("") || returnNameField.getText().equals("Enter Full Name")) {
            unsuccessLabel.setText("Name field can't be empty");
            unsuccess.setVisible(true);
        }
        else if (product.owners.contains(returnNameField.getText())) {
            product.owners.remove(product.owners.indexOf(returnNameField.getText()));
            returnDialog.setVisible(false);
            success.setVisible(true);
            returnNameField.setText("Enter Full Name");
        }
        else {
            unsuccessLabel.setText("You haven't bought that product");
            unsuccess.setVisible(true);
        }
    }
    private void returnButton1MouseClicked(MouseEvent e) { returnA(product1); }
    private void returnButton2MouseClicked(MouseEvent e) { returnA(product2); }
    private void returnButton3MouseClicked(MouseEvent e) { returnA(product3); }

    private void lotteryButtonMouseClicked(MouseEvent e) {
        List<String> allOwners = new ArrayList<>();
        allOwners.addAll(product1.owners);
        allOwners.addAll(product2.owners);
        allOwners.addAll(product3.owners);
        Random random = new Random();
        int ran = random.nextInt(allOwners.size());
        lotteryLabel.setText(allOwners.get(ran));
        lotteryDialog.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ali Kaghazgaran
        label1 = new JLabel();
        productListButton = new JButton();
        buyButton = new JButton();
        returnButton = new JButton();
        lotteryButton = new JButton();
        productListDialog = new JDialog();
        pLDLabel1 = new JLabel();
        pLDLabel2 = new JLabel();
        buyDialog = new JDialog();
        buyButton1 = new JButton();
        buyButton2 = new JButton();
        buyButton3 = new JButton();
        buyNameField = new JTextField();
        success = new JDialog();
        label3 = new JLabel();
        unsuccess = new JDialog();
        unsuccessLabel = new JLabel();
        returnDialog = new JDialog();
        returnNameField = new JTextField();
        returnButton1 = new JButton();
        returnButton2 = new JButton();
        returnButton3 = new JButton();
        lotteryDialog = new JDialog();
        label2 = new JLabel();
        lotteryLabel = new JLabel();

        //======== this ========
        setTitle("Menu");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Electronic Store");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label1, "cell 3 1");

        //---- productListButton ----
        productListButton.setText("Product List");
        productListButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                productListMouseClicked(e);
            }
        });
        contentPane.add(productListButton, "cell 3 4");

        //---- buyButton ----
        buyButton.setText("Buy");
        buyButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                buyButtonMouseClicked(e);
            }
        });
        contentPane.add(buyButton, "cell 3 5");

        //---- returnButton ----
        returnButton.setText("Return");
        returnButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnButtonMouseClicked(e);
            }
        });
        contentPane.add(returnButton, "cell 3 6");

        //---- lotteryButton ----
        lotteryButton.setText("Lottery");
        lotteryButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lotteryButtonMouseClicked(e);
            }
        });
        contentPane.add(lotteryButton, "cell 3 7");
        pack();
        setLocationRelativeTo(null);

        //======== productListDialog ========
        {
            productListDialog.setTitle("Product List");
            Container productListDialogContentPane = productListDialog.getContentPane();

            //---- pLDLabel1 ----
            pLDLabel1.setText("text");
            pLDLabel1.setHorizontalAlignment(SwingConstants.CENTER);

            //---- pLDLabel2 ----
            pLDLabel2.setText("text");
            pLDLabel2.setHorizontalAlignment(SwingConstants.CENTER);

            GroupLayout productListDialogContentPaneLayout = new GroupLayout(productListDialogContentPane);
            productListDialogContentPane.setLayout(productListDialogContentPaneLayout);
            productListDialogContentPaneLayout.setHorizontalGroup(
                productListDialogContentPaneLayout.createParallelGroup()
                    .addGroup(productListDialogContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pLDLabel1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pLDLabel2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            productListDialogContentPaneLayout.setVerticalGroup(
                productListDialogContentPaneLayout.createParallelGroup()
                    .addGroup(productListDialogContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(productListDialogContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(pLDLabel2, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(pLDLabel1, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addContainerGap())
            );
            productListDialog.pack();
            productListDialog.setLocationRelativeTo(null);
        }

        //======== buyDialog ========
        {
            buyDialog.setTitle("Buy");
            Container buyDialogContentPane = buyDialog.getContentPane();

            //---- buyButton1 ----
            buyButton1.setText("text");
            buyButton1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    buyButton1MouseClicked(e);
                }
            });

            //---- buyButton2 ----
            buyButton2.setText("text");
            buyButton2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    buyButton2MouseClicked(e);
                }
            });

            //---- buyButton3 ----
            buyButton3.setText("text");
            buyButton3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    buyButton3MouseClicked(e);
                }
            });

            //---- buyNameField ----
            buyNameField.setText("Enter Full Name");
            buyNameField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    buyNameFieldMouseClicked(e);
                }
            });

            GroupLayout buyDialogContentPaneLayout = new GroupLayout(buyDialogContentPane);
            buyDialogContentPane.setLayout(buyDialogContentPaneLayout);
            buyDialogContentPaneLayout.setHorizontalGroup(
                buyDialogContentPaneLayout.createParallelGroup()
                    .addGroup(buyDialogContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buyDialogContentPaneLayout.createParallelGroup()
                            .addComponent(buyButton3, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(buyButton2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(buyButton1, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(buyNameField, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                        .addContainerGap())
            );
            buyDialogContentPaneLayout.setVerticalGroup(
                buyDialogContentPaneLayout.createParallelGroup()
                    .addGroup(buyDialogContentPaneLayout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(buyNameField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buyButton1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buyButton2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buyButton3)
                        .addContainerGap())
            );
            buyDialog.pack();
            buyDialog.setLocationRelativeTo(null);
        }

        //======== success ========
        {
            success.setAlwaysOnTop(true);
            Container successContentPane = success.getContentPane();

            //---- label3 ----
            label3.setText("Successful");
            label3.setHorizontalAlignment(SwingConstants.CENTER);

            GroupLayout successContentPaneLayout = new GroupLayout(successContentPane);
            successContentPane.setLayout(successContentPaneLayout);
            successContentPaneLayout.setHorizontalGroup(
                successContentPaneLayout.createParallelGroup()
                    .addGroup(successContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label3, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addContainerGap())
            );
            successContentPaneLayout.setVerticalGroup(
                successContentPaneLayout.createParallelGroup()
                    .addGroup(successContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label3, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addContainerGap())
            );
            success.pack();
            success.setLocationRelativeTo(null);
        }

        //======== unsuccess ========
        {
            unsuccess.setAlwaysOnTop(true);
            Container unsuccessContentPane = unsuccess.getContentPane();

            //---- unsuccessLabel ----
            unsuccessLabel.setHorizontalAlignment(SwingConstants.CENTER);
            unsuccessLabel.setText("unsuccess");

            GroupLayout unsuccessContentPaneLayout = new GroupLayout(unsuccessContentPane);
            unsuccessContentPane.setLayout(unsuccessContentPaneLayout);
            unsuccessContentPaneLayout.setHorizontalGroup(
                unsuccessContentPaneLayout.createParallelGroup()
                    .addGroup(unsuccessContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(unsuccessLabel, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addContainerGap())
            );
            unsuccessContentPaneLayout.setVerticalGroup(
                unsuccessContentPaneLayout.createParallelGroup()
                    .addGroup(unsuccessContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(unsuccessLabel, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addContainerGap())
            );
            unsuccess.pack();
            unsuccess.setLocationRelativeTo(null);
        }

        //======== returnDialog ========
        {
            returnDialog.setTitle("Return");
            Container returnDialogContentPane = returnDialog.getContentPane();

            //---- returnNameField ----
            returnNameField.setText("Enter Full Name");
            returnNameField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField1MouseClicked(e);
                }
            });

            //---- returnButton1 ----
            returnButton1.setText("text");
            returnButton1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    returnButton1MouseClicked(e);
                }
            });

            //---- returnButton2 ----
            returnButton2.setText("text");
            returnButton2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    returnButton2MouseClicked(e);
                }
            });

            //---- returnButton3 ----
            returnButton3.setText("text");
            returnButton3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    returnButton3MouseClicked(e);
                }
            });

            GroupLayout returnDialogContentPaneLayout = new GroupLayout(returnDialogContentPane);
            returnDialogContentPane.setLayout(returnDialogContentPaneLayout);
            returnDialogContentPaneLayout.setHorizontalGroup(
                returnDialogContentPaneLayout.createParallelGroup()
                    .addGroup(returnDialogContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(returnDialogContentPaneLayout.createParallelGroup()
                            .addComponent(returnNameField, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(returnButton3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(returnButton2, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(returnButton1, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                        .addContainerGap())
            );
            returnDialogContentPaneLayout.setVerticalGroup(
                returnDialogContentPaneLayout.createParallelGroup()
                    .addGroup(returnDialogContentPaneLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(returnNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(returnButton1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(returnButton2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(returnButton3)
                        .addContainerGap())
            );
            returnDialog.pack();
            returnDialog.setLocationRelativeTo(null);
        }

        //======== lotteryDialog ========
        {
            lotteryDialog.setTitle("Lottery");
            Container lotteryDialogContentPane = lotteryDialog.getContentPane();

            //---- label2 ----
            label2.setText("The Winner Is:");
            label2.setHorizontalAlignment(SwingConstants.CENTER);

            //---- lotteryLabel ----
            lotteryLabel.setText("text");
            lotteryLabel.setHorizontalAlignment(SwingConstants.CENTER);

            GroupLayout lotteryDialogContentPaneLayout = new GroupLayout(lotteryDialogContentPane);
            lotteryDialogContentPane.setLayout(lotteryDialogContentPaneLayout);
            lotteryDialogContentPaneLayout.setHorizontalGroup(
                lotteryDialogContentPaneLayout.createParallelGroup()
                    .addGroup(lotteryDialogContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(lotteryDialogContentPaneLayout.createParallelGroup()
                            .addComponent(lotteryLabel, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(label2, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                        .addContainerGap())
            );
            lotteryDialogContentPaneLayout.setVerticalGroup(
                lotteryDialogContentPaneLayout.createParallelGroup()
                    .addGroup(lotteryDialogContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lotteryLabel, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addContainerGap())
            );
            lotteryDialog.pack();
            lotteryDialog.setLocationRelativeTo(null);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ali Kaghazgaran
    private JLabel label1;
    private JButton productListButton;
    private JButton buyButton;
    private JButton returnButton;
    private JButton lotteryButton;
    private JDialog productListDialog;
    private JLabel pLDLabel1;
    private JLabel pLDLabel2;
    private JDialog buyDialog;
    private JButton buyButton1;
    private JButton buyButton2;
    private JButton buyButton3;
    private JTextField buyNameField;
    private JDialog success;
    private JLabel label3;
    private JDialog unsuccess;
    private JLabel unsuccessLabel;
    private JDialog returnDialog;
    private JTextField returnNameField;
    private JButton returnButton1;
    private JButton returnButton2;
    private JButton returnButton3;
    private JDialog lotteryDialog;
    private JLabel label2;
    private JLabel lotteryLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
