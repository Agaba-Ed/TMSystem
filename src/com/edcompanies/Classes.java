
package com.edcompanies;

import com.itextpdf.text.BaseColor;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.CallableStatement;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ed
 */
public class Classes extends javax.swing.JPanel {

    /**
     * Creates new form facultyTimetablePanel
     */
    
    public Classes() {
       
        initComponents();
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        excellButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        selectFacultyCombobox = new javax.swing.JComboBox<>();
        select = new javax.swing.JLabel();
        selectDepartmentCombobox = new javax.swing.JComboBox<>();
        selectCourseUnitCombobox = new javax.swing.JLabel();
        selectCourseunitCombobox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        selectProgrammeCombobox = new javax.swing.JComboBox<>();
        getClassesButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        classesTable = new javax.swing.JTable();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(900, 654));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText(" Classes");

        excellButton.setText("Excell");
        excellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excellButtonActionPerformed(evt);
            }
        });

        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        helpButton.setText("Help");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(excellButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpButton)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(excellButton)
                            .addComponent(printButton)
                            .addComponent(helpButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Select faculty :");

        selectFacultyCombobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectFacultyComboboxItemStateChanged(evt);
            }
        });
        selectFacultyCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFacultyComboboxActionPerformed(evt);
            }
        });

        select.setText("Select department :");

        selectDepartmentCombobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectDepartmentComboboxItemStateChanged(evt);
            }
        });
        selectDepartmentCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDepartmentComboboxActionPerformed(evt);
            }
        });

        selectCourseUnitCombobox.setText("Select courseunit :");

        selectCourseunitCombobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectCourseunitComboboxItemStateChanged(evt);
            }
        });
        selectCourseunitCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCourseunitComboboxActionPerformed(evt);
            }
        });

        jLabel3.setText("Select programme :");

        selectProgrammeCombobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectProgrammeComboboxItemStateChanged(evt);
            }
        });
        selectProgrammeCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectProgrammeComboboxActionPerformed(evt);
            }
        });

        getClassesButton.setText("Get classes");
        getClassesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getClassesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectFacultyCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectProgrammeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(select)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectDepartmentCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(selectCourseUnitCombobox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectCourseunitCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getClassesButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(selectFacultyCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select)
                    .addComponent(selectDepartmentCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(selectProgrammeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectCourseUnitCombobox)
                    .addComponent(selectCourseunitCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getClassesButton))
        );

        classesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(classesTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void excellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excellButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excellButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try {
            // TODO add your handling code here:

            Document document = new Document(PageSize.A3.rotate());
            PdfWriter.getInstance(document, new FileOutputStream(courseunitName +".pdf"));
            document.open();

            //adding logo
            Image img = Image.getInstance("must-logo.png");
            img.setAlignment(Image.ALIGN_MIDDLE);
            img.scaleToFit(100.00f,100.00f);
            document.add(img);
            //adding document header

            Font font=FontFactory.getFont(FontFactory.COURIER_BOLD,32,BaseColor.BLACK);
            Paragraph universityName=new Paragraph("MBARARA UNIVERSITY OF SCIENCE AND TECHNOLOGY.",font);
            universityName.setAlignment(Element.ALIGN_CENTER);
            document.add(universityName);
            Paragraph facultyName=new Paragraph("CLASSES FOR "+courseunitName.toUpperCase(),font);
            facultyName.setAlignment(Element.ALIGN_CENTER);
            document.add(facultyName);
            
            Paragraph departmentName=new Paragraph("            ",font);
            departmentName.setAlignment(Element.ALIGN_CENTER);
            document.add(departmentName);

            Paragraph space=new Paragraph("          ",font);
            document.add(space);
            
            Connection connection=TMSDao.getConnection();
            String classesquery="{CALL getAllClasses(?)}";
        CallableStatement prepareCall = connection.prepareCall(classesquery);
        prepareCall.setInt(1, idCourseunit);
        ResultSet classesresultset=prepareCall.executeQuery();
            final int columnCount = classesresultset.getMetaData().getColumnCount();
            
            
            PdfPTable table= new PdfPTable(columnCount);
            
            for(int i=1;i<=columnCount;i++){
                final String columnName = classesresultset.getMetaData().getColumnName(i);
            
            Phrase phrase=new Phrase(columnName,FontFactory.getFont(null,24));
            
            table.addCell(phrase);
            }
            
            
            while(classesresultset.next()){
             for(int i=1;i<=columnCount;i++){
            String columnText;
            columnText=classesresultset.getString(i);
            
            Phrase phrase=new Phrase(columnText,FontFactory.getFont(null,24));
            
            table.addCell(phrase);
            }
                
            }
            
            
            document.add(table);
            if(Desktop.isDesktopSupported()){
                File file=new File(courseunitName+".pdf");
                Desktop.getDesktop().open(file);
                
            }
            

            //Paragraph pdfTitle=new Paragraph("FACULTY TIMETABLE.",font);
            //pdfTitle.setAlignment(Element.ALIGN_CENTER);
            //document.add(pdfTitle);
            document.close();
        } catch (DocumentException ex) {
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_printButtonActionPerformed

    private void selectFacultyComboboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectFacultyComboboxItemStateChanged
        // TODO add your handling code here
        String facultyName=(String)selectFacultyCombobox.getSelectedItem();
        Connection connection=TMSDao.getConnection();
        
        
        String query="SELECT idFaculty FROM faculty WHERE facultyName=?";
        
        
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1, facultyName);
            ResultSet resultset=preparedStatement.executeQuery();
            resultset.next();
            int id=resultset.getInt(1);
            
            
        String departmentquery="SELECT * FROM department WHERE Faculty_idFaculty=?";
        PreparedStatement departmentpreparedStatement=connection.prepareStatement(departmentquery);
        departmentpreparedStatement.setInt(1, id);
        ResultSet departmentresultset=departmentpreparedStatement.executeQuery();
        selectDepartmentCombobox.removeAllItems();
        selectDepartmentCombobox.invalidate();
           
            while(departmentresultset.next()){
                final String item = departmentresultset.getString(2);
               
                selectDepartmentCombobox.addItem(item);
                selectDepartmentCombobox.revalidate();
               
                
            }
           
            
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_selectFacultyComboboxItemStateChanged

    private void selectFacultyComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFacultyComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectFacultyComboboxActionPerformed

    private void selectDepartmentComboboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectDepartmentComboboxItemStateChanged
        // TODO add your handling code here:
        String departmentName=(String)selectDepartmentCombobox.getSelectedItem();
        Connection connection=TMSDao.getConnection();
        
        
        String query="SELECT idDepartment FROM department WHERE departmentName=?";
        
        
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1, departmentName);
            ResultSet resultset=preparedStatement.executeQuery();
            resultset.next();
            int id=resultset.getInt(1);
            
            
        String programmequery="SELECT * FROM program WHERE Department_idDepartment=?";
        PreparedStatement programPreparedStatement=connection.prepareStatement(programmequery);
        programPreparedStatement.setInt(1, id);
        ResultSet departmentresultset=programPreparedStatement.executeQuery();
        selectProgrammeCombobox.removeAllItems();
        selectProgrammeCombobox.invalidate();
           
            while(departmentresultset.next()){
                final String item = departmentresultset.getString(3);
               
                selectProgrammeCombobox.addItem(item);
                selectProgrammeCombobox.revalidate();
               
                
            }
           
            
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_selectDepartmentComboboxItemStateChanged

    private void selectDepartmentComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDepartmentComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectDepartmentComboboxActionPerformed

    private void selectCourseunitComboboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectCourseunitComboboxItemStateChanged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_selectCourseunitComboboxItemStateChanged

    private void selectCourseunitComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCourseunitComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectCourseunitComboboxActionPerformed

    private void getClassesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getClassesButtonActionPerformed
        // TODO add your handling code here:
        courseunitName = (String) selectCourseunitCombobox.getSelectedItem();
        Connection connection=TMSDao.getConnection();
         try {
                 
        String query="SELECT idCourseunit FROM courseunit WHERE courseunitName=?";
        PreparedStatement courseunitPreparedStatement=connection.prepareStatement(query);
        courseunitPreparedStatement.setString(1,courseunitName);
        ResultSet courseunitresultset=courseunitPreparedStatement.executeQuery();
        courseunitresultset.next();
            idCourseunit = courseunitresultset.getInt(1);
        String classesquery="{CALL getAllClasses(?)}";
        CallableStatement prepareCall = connection.prepareCall(classesquery);
        prepareCall.setInt(1, idCourseunit);
        ResultSet classesresultset=prepareCall.executeQuery();
        classesTable.setModel(DbUtils.resultSetToTableModel(classesresultset));
        
            
           
            
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_getClassesButtonActionPerformed
    private String courseunitName;
    private int idCourseunit;

    private void selectProgrammeComboboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectProgrammeComboboxItemStateChanged
        // TODO add your handling code here:
          String programName=(String)selectProgrammeCombobox.getSelectedItem();
        Connection connection=TMSDao.getConnection();
        
        
        String query="SELECT idProgram FROM program WHERE programCode=?";
        
        
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1, programName);
            ResultSet resultset=preparedStatement.executeQuery();
            resultset.next();
            int id=resultset.getInt(1);
            
            
        String courseunitquery="SELECT * FROM courseunit WHERE idCourseunit IN(SELECT Courseunit_idCourseunit FROM program_has_courseunit WHERE Program_idProgram=?)";
        PreparedStatement courseunitPreparedStatement=connection.prepareStatement(courseunitquery);
        courseunitPreparedStatement.setInt(1, id);
        ResultSet courseunitresultset=courseunitPreparedStatement.executeQuery();
        selectCourseunitCombobox.removeAllItems();
        selectCourseunitCombobox.invalidate();
           
            while(courseunitresultset.next()){
                final String item = courseunitresultset.getString(2);
               
                selectCourseunitCombobox.addItem(item);
                selectCourseunitCombobox.revalidate();
               
                
            }
           
            
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_selectProgrammeComboboxItemStateChanged

    private void selectProgrammeComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectProgrammeComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectProgrammeComboboxActionPerformed
    
    public static void populateFacultyCombobox(){
        Connection connection=TMSDao.getConnection();
        
        
        String query="SELECT * FROM faculty";
        
        
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            ResultSet resultset=preparedStatement.executeQuery();
           
            while(resultset.next()){
                selectFacultyCombobox.addItem(resultset.getString(2));
                
            }
           
            
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable classesTable;
    private javax.swing.JButton excellButton;
    private javax.swing.JButton getClassesButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printButton;
    private javax.swing.JLabel select;
    private javax.swing.JLabel selectCourseUnitCombobox;
    private static javax.swing.JComboBox<String> selectCourseunitCombobox;
    private static javax.swing.JComboBox<String> selectDepartmentCombobox;
    private static javax.swing.JComboBox<String> selectFacultyCombobox;
    private static javax.swing.JComboBox<String> selectProgrammeCombobox;
    // End of variables declaration//GEN-END:variables
}
