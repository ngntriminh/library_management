/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard;

import java.awt.Color;
import javax.swing.JOptionPane;
import LoginAndRegister.Login;
import ReadersManager.user_info;
import BooksManager.lm_view.jf_thongtinsach;
import BorrowAndReturnManager.Options;
import Dashboard.AboutUs;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;

public class MainDashboard extends javax.swing.JFrame {
    Login login = new Login();
    user_info usrinfo = new user_info();
    Options options = new Options();
    AboutUs aboutus = new AboutUs();
    public MainDashboard() {
        initComponents();
        handleReloadDashBoard();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        slidePanel = new javax.swing.JPanel();
        booksLabel = new javax.swing.JLabel();
        readersLabel = new javax.swing.JLabel();
        dashboardLabel = new javax.swing.JLabel();
        aboutLabel = new javax.swing.JLabel();
        borrowreturnLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalReadersLabel = new javax.swing.JLabel();
        totalBooksLabel = new javax.swing.JLabel();
        booksBorrowedLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        totalMoneyLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        debtLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(251, 224, 196));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slidePanel.setBackground(new java.awt.Color(138, 182, 214));
        slidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        booksLabel.setBackground(new java.awt.Color(114, 158, 190));
        booksLabel.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        booksLabel.setForeground(new java.awt.Color(255, 255, 255));
        booksLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        booksLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/books.png"))); // NOI18N
        booksLabel.setText(" Books Manager");
        booksLabel.setOpaque(true);
        booksLabel.setPreferredSize(new java.awt.Dimension(35, 80));
        booksLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                booksLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                booksLabelMouseExited(evt);
            }
        });
        slidePanel.add(booksLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, 260, -1));

        readersLabel.setBackground(new java.awt.Color(114, 158, 190));
        readersLabel.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        readersLabel.setForeground(new java.awt.Color(255, 255, 255));
        readersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        readersLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/readers.png"))); // NOI18N
        readersLabel.setText(" Readers Manager");
        readersLabel.setOpaque(true);
        readersLabel.setPreferredSize(new java.awt.Dimension(35, 80));
        readersLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readersLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                readersLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                readersLabelMouseExited(evt);
            }
        });
        slidePanel.add(readersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 196, 260, -1));

        dashboardLabel.setBackground(new java.awt.Color(79, 110, 133));
        dashboardLabel.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        dashboardLabel.setForeground(new java.awt.Color(255, 255, 255));
        dashboardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/home.png"))); // NOI18N
        dashboardLabel.setText(" Dashboard");
        dashboardLabel.setOpaque(true);
        dashboardLabel.setPreferredSize(new java.awt.Dimension(35, 80));
        slidePanel.add(dashboardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, -1));

        aboutLabel.setBackground(new java.awt.Color(114, 158, 190));
        aboutLabel.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        aboutLabel.setForeground(new java.awt.Color(255, 255, 255));
        aboutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aboutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/info.png"))); // NOI18N
        aboutLabel.setText(" About Us");
        aboutLabel.setOpaque(true);
        aboutLabel.setPreferredSize(new java.awt.Dimension(35, 80));
        aboutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutLabelMouseExited(evt);
            }
        });
        slidePanel.add(aboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 392, 260, -1));

        borrowreturnLabel.setBackground(new java.awt.Color(114, 158, 190));
        borrowreturnLabel.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        borrowreturnLabel.setForeground(new java.awt.Color(255, 255, 255));
        borrowreturnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borrowreturnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/borrow_and_return.png"))); // NOI18N
        borrowreturnLabel.setText(" Borrow & Return");
        borrowreturnLabel.setOpaque(true);
        borrowreturnLabel.setPreferredSize(new java.awt.Dimension(35, 80));
        borrowreturnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrowreturnLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrowreturnLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrowreturnLabelMouseExited(evt);
            }
        });
        slidePanel.add(borrowreturnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 294, 260, -1));

        jPanel1.add(slidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 260, 470));

        jPanel2.setBackground(new java.awt.Color(138, 182, 214));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_menu_48px_1.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(251, 224, 196));
        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 224, 196));
        jLabel2.setText("LIBRARY MANAGEMENT V1.0");

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Welcome back,  ");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/male_user_50px.png"))); // NOI18N

        exitBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/login_close_button.png"))); // NOI18N
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 60));

        jPanel3.setBackground(new java.awt.Color(138, 182, 214));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Books and Readers analysis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(251, 224, 196))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/books.png"))); // NOI18N
        jLabel3.setText(" Total Books");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/readers.png"))); // NOI18N
        jLabel6.setText(" Total Readers");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/books.png"))); // NOI18N
        jLabel7.setText(" Books Borrowed");

        totalReadersLabel.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        totalReadersLabel.setForeground(new java.awt.Color(79, 110, 133));
        totalReadersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        totalBooksLabel.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        totalBooksLabel.setForeground(new java.awt.Color(79, 110, 133));
        totalBooksLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        booksBorrowedLabel.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        booksBorrowedLabel.setForeground(new java.awt.Color(79, 110, 133));
        booksBorrowedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalBooksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booksBorrowedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(totalReadersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalBooksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(totalReadersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(booksBorrowedLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 700, 200));

        jPanel4.setBackground(new java.awt.Color(138, 182, 214));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Income and Debt analysis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(251, 224, 196))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/total_money.png"))); // NOI18N
        jLabel8.setText(" Income");

        totalMoneyLabel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        totalMoneyLabel.setForeground(new java.awt.Color(79, 110, 133));
        totalMoneyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/debt.png"))); // NOI18N
        jLabel9.setText(" Debt");

        debtLabel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        debtLabel.setForeground(new java.awt.Color(79, 110, 133));
        debtLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(debtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalMoneyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(debtLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 700, 200));

        jButton1.setBackground(new java.awt.Color(41, 120, 181));
        jButton1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RELOAD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Change background jLabels when mouse enteres or exits.
    
    private void booksLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksLabelMouseEntered
        booksLabel.setBackground(new Color(79,110,133));
    }//GEN-LAST:event_booksLabelMouseEntered

    private void booksLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksLabelMouseExited
        booksLabel.setBackground(new Color(114,158,190));
    }//GEN-LAST:event_booksLabelMouseExited

    private void readersLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readersLabelMouseEntered
        readersLabel.setBackground(new Color(79,110,133));
    }//GEN-LAST:event_readersLabelMouseEntered

    private void readersLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readersLabelMouseExited
        readersLabel.setBackground(new Color(114,158,190));
    }//GEN-LAST:event_readersLabelMouseExited

    private void borrowreturnLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowreturnLabelMouseEntered
        borrowreturnLabel.setBackground(new Color(79,110,133));
    }//GEN-LAST:event_borrowreturnLabelMouseEntered

    private void borrowreturnLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowreturnLabelMouseExited
        borrowreturnLabel.setBackground(new Color(114,158,190));
    }//GEN-LAST:event_borrowreturnLabelMouseExited

    private void aboutLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLabelMouseEntered
        aboutLabel.setBackground(new Color(79,110,133));
    }//GEN-LAST:event_aboutLabelMouseEntered

    private void aboutLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLabelMouseExited
        aboutLabel.setBackground(new Color(114,158,190));
    }//GEN-LAST:event_aboutLabelMouseExited

    // Logout function
    
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        int reply = JOptionPane.showConfirmDialog(null, "Do you want to logout Library Management?", "Logout Library Management", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            login.setVisible(true);
            this.dispose();
        } else {
            return; 
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    
    private void readersLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readersLabelMouseClicked
        usrinfo.setVisible(true);
    }//GEN-LAST:event_readersLabelMouseClicked

    private void booksLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksLabelMouseClicked
        jf_thongtinsach book_info = new jf_thongtinsach();
        book_info.setVisible(true);
    }//GEN-LAST:event_booksLabelMouseClicked

    private void borrowreturnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowreturnLabelMouseClicked
        options.setVisible(true);
    }//GEN-LAST:event_borrowreturnLabelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        handleReloadDashBoard();
        JOptionPane.showMessageDialog(null, "Data updated successfully!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        ImageIcon img_log_out = new ImageIcon(this.getClass().getClassLoader().getResource("assets/logout.png"));
        jLabel4.setIcon(img_log_out);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        ImageIcon img_settings = new ImageIcon(this.getClass().getClassLoader().getResource("assets/icons8_menu_48px_1.png"));
        jLabel4.setIcon(img_settings);
    }//GEN-LAST:event_jLabel4MouseExited

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        int reply = JOptionPane.showConfirmDialog(null, "Do you want to quit Library Management?", "Exit Library Management", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            login.setVisible(true);
            System.exit(0);
        } else {
            return; 
        }
    }//GEN-LAST:event_exitBtnMouseClicked

    private void formActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formActivated
        ImageIcon icon = new ImageIcon(this.getClass().getClassLoader().getResource("assets/app_icon.png"));
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formActivated

    private void aboutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLabelMouseClicked
        aboutus.setVisible(true);
    }//GEN-LAST:event_aboutLabelMouseClicked

    private void handleReloadDashBoard() {
        try {
            totalBooksLabel.setText(String.valueOf(reloadTotalBooks()));
            booksBorrowedLabel.setText(String.valueOf(reloadBorrowedBooks()));
            totalReadersLabel.setText(String.valueOf(reloadtotalReaders()));
            totalMoneyLabel.setText("<html><body style='text-align: center'> " + String.valueOf(reloadtotalReaders() * 50000 + reloadtotalBorrowCards() * 5000) + " <br> VND </body></html>");
            debtLabel.setText("<html><body style='text-align: center'> " + String.valueOf(reloadDebt()) + " <br> VND </body></html>");
        } catch (Exception ex) {
            Logger.getLogger(MainDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }              
    }
    
    private int reloadTotalBooks() throws Exception {
        PreparedStatement ps;
        ResultSet rs;
        int count = 0;
        String query = "Select count(*) from thongtinsach";
        try {
            ps = Dashboard.MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
              count = rs.getInt("count(*)");
            }
        } catch (Exception e) {
        }
        return count;
    }
    
    private int reloadBorrowedBooks() throws Exception {
        PreparedStatement ps;
        ResultSet rs;
        int count = 0;
        String query = "Select count(*) from thongtinsach where TRANGTHAI = 1";
        try {
            ps = Dashboard.MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
              count = rs.getInt("count(*)");
            }
        } catch (Exception e) {
        }
        return count;
    }
    
    private int reloadtotalReaders() throws Exception {
        PreparedStatement ps;
        ResultSet rs;
        int count = 0;
        String query = "Select count(*) from thedocgia";
        try {
            ps = Dashboard.MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
              count = rs.getInt("count(*)");
            }
        } catch (Exception e) {
        }
        return count;
    }

    private int reloadtotalBorrowCards() throws Exception {
        PreparedStatement ps;
        ResultSet rs;
        int count = 0;
        String query = "Select count(*) from phieumuonsach";
        try {
            ps = Dashboard.MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
              count = rs.getInt("count(*)");
            }
        } catch (Exception e) {
        }
        return count;
    }

    private int reloadDebt() throws Exception {
        PreparedStatement ps;
        ResultSet rs;
        int count = 0;
        String query = "Select sum(TONGNODOCGIA) from thedocgia";
        try {
            ps = Dashboard.MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
              count += rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return count;
    }      
    
    
    
    /*
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainDashboard md = new MainDashboard();
                md.setVisible(true);              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JLabel booksBorrowedLabel;
    private javax.swing.JLabel booksLabel;
    private javax.swing.JLabel borrowreturnLabel;
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JLabel debtLabel;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel readersLabel;
    private javax.swing.JPanel slidePanel;
    private javax.swing.JLabel totalBooksLabel;
    private javax.swing.JLabel totalMoneyLabel;
    private javax.swing.JLabel totalReadersLabel;
    // End of variables declaration//GEN-END:variables
}
