/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import BussinessObject.Course;
import BussinessObject.Student;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.awt.event.KeyEvent;

/**
 *
 * @author orlandocamacho
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpHeader = new javax.swing.JPanel();
        jpSectionsNames = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlMainName = new javax.swing.JLabel();
        jlISW = new javax.swing.JLabel();
        jpStatus = new javax.swing.JPanel();
        jlStatus = new javax.swing.JLabel();
        jpStudentData = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jtLastName1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jtLastName2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jtID = new javax.swing.JTextField();
        jtSemester = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jbConsultCourses = new javax.swing.JButton();
        jpCourses = new javax.swing.JPanel();
        jspCoursesTable = new javax.swing.JScrollPane();
        jtCourses = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpHeader.setBackground(new java.awt.Color(15, 109, 181));
        jpHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSectionsNames.setBackground(new java.awt.Color(13, 85, 136));
        jpSectionsNames.setForeground(new java.awt.Color(255, 255, 255));
        jpSectionsNames.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Datos del alumno");
        jpSectionsNames.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cursos ofertados disponibles para el alumno");
        jpSectionsNames.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 410, 30));

        jpHeader.add(jpSectionsNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 700, 30));

        jlMainName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlMainName.setForeground(new java.awt.Color(255, 255, 255));
        jlMainName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMainName.setText("Oferta educativa de cursos");
        jpHeader.add(jlMainName, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 10, 290, 30));

        jlISW.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlISW.setForeground(new java.awt.Color(255, 255, 255));
        jlISW.setText("ISW");
        jpHeader.add(jlISW, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 30));

        getContentPane().add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 80));

        jpStatus.setBackground(new java.awt.Color(255, 255, 255));
        jpStatus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlStatus.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jlStatus.setForeground(new java.awt.Color(102, 102, 102));
        jlStatus.setText("Enviando datos del alumno... - Esperando respuesta del servidor... - Recibiendo datos de los cursos...");
        jpStatus.add(jlStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 680, 20));

        getContentPane().add(jpStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 700, 20));

        jpStudentData.setBackground(new java.awt.Color(255, 255, 255));
        jpStudentData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nombre:");
        jpStudentData.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jtName.setBackground(new java.awt.Color(255, 255, 255));
        jtName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtName.setForeground(new java.awt.Color(51, 51, 51));
        jtName.setBorder(null);
        jtName.setIgnoreRepaint(true);
        jtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNameKeyTyped(evt);
            }
        });
        jpStudentData.add(jtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 210, 20));
        jpStudentData.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 10));

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Apellido paterno:");
        jpStudentData.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jtLastName1.setBackground(new java.awt.Color(255, 255, 255));
        jtLastName1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtLastName1.setForeground(new java.awt.Color(51, 51, 51));
        jtLastName1.setBorder(null);
        jtLastName1.setIgnoreRepaint(true);
        jtLastName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtLastName1KeyTyped(evt);
            }
        });
        jpStudentData.add(jtLastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, 20));
        jpStudentData.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 10));
        jpStudentData.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, 10));

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Apellido materno:");
        jpStudentData.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jtLastName2.setBackground(new java.awt.Color(255, 255, 255));
        jtLastName2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtLastName2.setForeground(new java.awt.Color(51, 51, 51));
        jtLastName2.setBorder(null);
        jtLastName2.setIgnoreRepaint(true);
        jtLastName2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtLastName2KeyTyped(evt);
            }
        });
        jpStudentData.add(jtLastName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, 20));

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("ID:");
        jpStudentData.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));
        jpStudentData.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 210, 10));

        jtID.setBackground(new java.awt.Color(255, 255, 255));
        jtID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtID.setForeground(new java.awt.Color(51, 51, 51));
        jtID.setBorder(null);
        jtID.setIgnoreRepaint(true);
        jtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIDKeyTyped(evt);
            }
        });
        jpStudentData.add(jtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 20));

        jtSemester.setBackground(new java.awt.Color(255, 255, 255));
        jtSemester.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtSemester.setForeground(new java.awt.Color(51, 51, 51));
        jtSemester.setBorder(null);
        jtSemester.setIgnoreRepaint(true);
        jtSemester.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtSemesterKeyTyped(evt);
            }
        });
        jpStudentData.add(jtSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 210, 20));

        jLabel9.setBackground(java.awt.Color.white);
        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Semestre");
        jpStudentData.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 20));
        jpStudentData.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, 10));

        jbConsultCourses.setBackground(new java.awt.Color(13, 85, 136));
        jbConsultCourses.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbConsultCourses.setForeground(new java.awt.Color(255, 255, 255));
        jbConsultCourses.setText("Consultar cursos");
        jbConsultCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultCoursesActionPerformed(evt);
            }
        });
        jpStudentData.add(jbConsultCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 150, 30));

        getContentPane().add(jpStudentData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 250, 350));

        jpCourses.setBackground(new java.awt.Color(255, 255, 255));
        jpCourses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jspCoursesTable.setBackground(new java.awt.Color(255, 255, 255));
        jspCoursesTable.setForeground(new java.awt.Color(51, 51, 51));
        jspCoursesTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtCourses.setBackground(new java.awt.Color(255, 255, 255));
        jtCourses.setForeground(new java.awt.Color(51, 51, 51));
        jtCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Materia", "Horas", "Puntos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCourses.setGridColor(new java.awt.Color(153, 153, 153));
        jtCourses.setRowHeight(25);
        jtCourses.setShowGrid(true);
        jspCoursesTable.setViewportView(jtCourses);
        if (jtCourses.getColumnModel().getColumnCount() > 0) {
            jtCourses.getColumnModel().getColumn(0).setResizable(false);
            jtCourses.getColumnModel().getColumn(0).setPreferredWidth(30);
            jtCourses.getColumnModel().getColumn(1).setResizable(false);
            jtCourses.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jpCourses.add(jspCoursesTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, 310));

        getContentPane().add(jpCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 450, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Validates that only characters are entered 
     * @param evt 
     */
    private void jtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNameKeyTyped
        if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();    
        } 
    }//GEN-LAST:event_jtNameKeyTyped

    /**
     * Validates that only characters are entered
     * @param evt 
     */
    private void jtLastName1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLastName1KeyTyped
        if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();    
        } 
    }//GEN-LAST:event_jtLastName1KeyTyped

    /**
     * Validates that only characters are entered
     * @param evt 
     */
    private void jtLastName2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLastName2KeyTyped
        if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();    
        } 
    }//GEN-LAST:event_jtLastName2KeyTyped

    /**
     * Validate that only numbers are entered
     * @param evt 
     */
    private void jtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIDKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (jtID.getText().length() == 11)
            evt.consume();
    }//GEN-LAST:event_jtIDKeyTyped

    /**
     * Validate that only numbers are entered
     * @param evt 
     */
    private void jtSemesterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSemesterKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '8') {
            evt.consume();
        }

        if (jtSemester.getText().equals("")){
            if (Integer.valueOf(jtSemester.getText()) > 8)
            evt.consume();
        }
    }//GEN-LAST:event_jtSemesterKeyTyped

    /**
     * Send the student's data to consult the available courses
     * @param evt 
     */
    private void jbConsultCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultCoursesActionPerformed
        if (!jtName.getText().isBlank() && !jtLastName1.getText().isBlank() && !jtLastName2.getText().isBlank() && !jtID.getText().isBlank() && !jtSemester.getText().isBlank()){
             // Create object
            Student st = new Student(jtName.getText() + " " + jtLastName1.getText() + " " + jtLastName2.getText(), jtID.getText(), Integer.parseInt(jtSemester.getText()));
            // Send data through socket
            Gson gson = new Gson();
            JsonElement element = gson.toJsonTree(st); 
            
        }
    }//GEN-LAST:event_jbConsultCoursesActionPerformed

    private void jsonToJava(JsonElement jsonElement){
            
//           Gson gson = new Gson();
//           gson.fromJson(element, Course.class);    
   }
    /**
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jbConsultCourses;
    private javax.swing.JLabel jlISW;
    private javax.swing.JLabel jlMainName;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JPanel jpCourses;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpSectionsNames;
    private javax.swing.JPanel jpStatus;
    private javax.swing.JPanel jpStudentData;
    private javax.swing.JScrollPane jspCoursesTable;
    private javax.swing.JTable jtCourses;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtLastName1;
    private javax.swing.JTextField jtLastName2;
    private javax.swing.JTextField jtName;
    private javax.swing.JTextField jtSemester;
    // End of variables declaration//GEN-END:variables
}
