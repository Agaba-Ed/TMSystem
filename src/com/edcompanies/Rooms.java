/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edcompanies;

import com.edcompanies.data.Room;
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
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ed
 */
public class Rooms extends javax.swing.JPanel {

    /**
     * Creates new form facultyTimetablePanel
     */
    
    private static final Color HIGHLIGHT_COLOR=new Color(110,190,0);
    private static final Color ORIGINAL_COLOR=new Color(117,197,0);
    private TableModel resultSetToTableModel;
   
    public Rooms() {
       
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        excellButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buildingComboBox = new javax.swing.JComboBox<>();
        getRoomsPanel = new javax.swing.JPanel();
        getRoomsButton = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomsTable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Rooms");

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

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(excellButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpButton)
                .addContainerGap())
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
                            .addComponent(helpButton)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Select building :");

        buildingComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                buildingComboBoxItemStateChanged(evt);
            }
        });
        buildingComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingComboBoxActionPerformed(evt);
            }
        });

        getRoomsPanel.setBackground(new java.awt.Color(117, 197, 0));
        getRoomsPanel.setForeground(new java.awt.Color(255, 255, 255));

        getRoomsButton.setBackground(new java.awt.Color(117, 197, 0));
        getRoomsButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getRoomsButton.setForeground(new java.awt.Color(255, 255, 255));
        getRoomsButton.setText("         Get rooms");
        getRoomsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getRoomsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                getRoomsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                getRoomsButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout getRoomsPanelLayout = new javax.swing.GroupLayout(getRoomsPanel);
        getRoomsPanel.setLayout(getRoomsPanelLayout);
        getRoomsPanelLayout.setHorizontalGroup(
            getRoomsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getRoomsPanelLayout.createSequentialGroup()
                .addComponent(getRoomsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        getRoomsPanelLayout.setVerticalGroup(
            getRoomsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(getRoomsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buildingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(getRoomsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveButton)
                        .addComponent(addButton)
                        .addComponent(deleteButton))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(buildingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(getRoomsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(roomsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void excellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excellButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excellButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try {
            // TODO add your handling code here:

            Document document = new Document(PageSize.A3.rotate());
            PdfWriter.getInstance(document, new FileOutputStream(buildingName +".pdf"));
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
            Paragraph facultyName=new Paragraph("ROOMS FOR "+buildingName.toUpperCase(),font);
            facultyName.setAlignment(Element.ALIGN_CENTER);
            document.add(facultyName);
            
            Paragraph departmentName=new Paragraph("            ",font);
            departmentName.setAlignment(Element.ALIGN_CENTER);
            document.add(departmentName);

            Paragraph space=new Paragraph("          ",font);
            document.add(space);
            
        buildingName = (String) buildingComboBox.getSelectedItem();
         
        Connection connection=TMSDao.getConnection();
        
            String roomsquery="SELECT * FROM room WHERE Building_idBuilding=?";
            PreparedStatement roompreparedStatement=connection.prepareStatement(roomsquery,ResultSet.CONCUR_UPDATABLE);
            roompreparedStatement.setInt(1,idBuilding);;
            ResultSet roomresultset=roompreparedStatement.executeQuery();
            final int columnCount = roomresultset.getMetaData().getColumnCount();
            
            
            PdfPTable table= new PdfPTable(columnCount);
            
            for(int i=1;i<=columnCount;i++){
                final String columnName = roomresultset.getMetaData().getColumnName(i);
            
            Phrase phrase=new Phrase(columnName,FontFactory.getFont(null,24));
            
            table.addCell(phrase);
            }
            
            
            while(roomresultset.next()){
             for(int i=1;i<=columnCount;i++){
            String columnText;
            columnText=roomresultset.getString(i);
            
            Phrase phrase=new Phrase(columnText,FontFactory.getFont(null,24));
            
            table.addCell(phrase);
            }
                
            }
            
            
            document.add(table);
            if(Desktop.isDesktopSupported()){
                File file=new File(buildingName+".pdf");
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

    private void buildingComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_buildingComboBoxItemStateChanged
        // TODO add your handling code here
    }//GEN-LAST:event_buildingComboBoxItemStateChanged

    private void buildingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buildingComboBoxActionPerformed

    private void getRoomsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getRoomsButtonMouseEntered
        // TODO add your handling code here:
        getRoomsButton.setBackground(HIGHLIGHT_COLOR);
        getRoomsPanel.setBackground(HIGHLIGHT_COLOR);
        
    }//GEN-LAST:event_getRoomsButtonMouseEntered

    private void getRoomsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getRoomsButtonMouseExited
        // TODO add your handling code here:
        getRoomsButton.setBackground(ORIGINAL_COLOR);
        getRoomsPanel.setBackground(ORIGINAL_COLOR);
    }//GEN-LAST:event_getRoomsButtonMouseExited

    private void getRoomsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getRoomsButtonMouseClicked
        // TODO add your handling code here:
        
        showRooms();
    }//GEN-LAST:event_getRoomsButtonMouseClicked


    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            
            Socket socket;
            
            socket = new Socket("localhost", 7777);
            
            System.out.println("Connected!");
            
            //Send room data to server 
            PrintWriter writer=new PrintWriter(socket.getOutputStream());
            writer.println(443);
            writer.flush();
            writer.close();
            System.out.println("Closing socket and terminating program.");
            socket.close();
            Thread.sleep(1000);
            
            socket = new Socket("localhost", 4242);
            
            System.out.println("Connected!");
            
            
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            
            int selectedRow = roomsTable.getSelectedRow();
          
            Room room=new Room();
            
            room.setIdRoom(Integer.valueOf(roomsTable.getValueAt(selectedRow, 0).toString()));
            room.setRoomName(roomsTable.getValueAt(selectedRow, 1).toString());
            room.setRoomCode(roomsTable.getValueAt(selectedRow, 2).toString());
            room.setBuilding_idBuilding(Integer.valueOf(roomsTable.getValueAt(selectedRow,3).toString()));
            
            
            objectOutputStream.writeObject(room);
            System.out.println("Closing socket and terminating program.");
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        } 
       
    }//GEN-LAST:event_saveButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        DefaultTableModel roomsDataModel=(DefaultTableModel)resultSetToTableModel;
        roomsDataModel.addRow(new Object[]{"","","",""});
        
        
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        try{
        Socket socket;
            
            socket = new Socket( "localhost", 7777);
            
            System.out.println("Connected!");
            
            //Send room data to server 
            PrintWriter writer=new PrintWriter(socket.getOutputStream());
            writer.println(444);
            writer.flush();
            writer.close();
            System.out.println("Closing socket and terminating program.");
            socket.close();
            Thread.sleep(1000);
            
            socket = new Socket("localhost", 4242);
            
            System.out.println("Connected!");
            
            
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            
            int selectedRow = roomsTable.getSelectedRow();
          
            Room room=new Room();
            
            room.setIdRoom(Integer.valueOf(roomsTable.getValueAt(selectedRow, 0).toString()));
            room.setRoomName(roomsTable.getValueAt(selectedRow, 1).toString());
            room.setRoomCode(roomsTable.getValueAt(selectedRow, 2).toString());
            room.setBuilding_idBuilding(Integer.valueOf(roomsTable.getValueAt(selectedRow,3).toString()));
            
            
            objectOutputStream.writeObject(room);
            System.out.println("Closing socket and terminating program.");
            socket.close();
            Thread.sleep(3000);
            //refresh
            showRooms();
        } catch (IOException ex) {
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        
        String roomName=searchTextField.getText();
        Connection connection=TMSDao.getConnection();
         try {
            String roomsquery="SELECT * FROM room WHERE roomName LIKE ?";
            PreparedStatement roompreparedStatement=connection.prepareStatement(roomsquery,ResultSet.CONCUR_UPDATABLE);
            roompreparedStatement.setString(1,roomName+"%");
            ResultSet roomresultset=roompreparedStatement.executeQuery();
            resultSetToTableModel = DbUtils.resultSetToTableModel(roomresultset);
            roomsTable.setModel(resultSetToTableModel);
     
       
           
 
            
           
            
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed
    private String buildingName;
    private int idBuilding;
    
    public static void populateBuildingsCombobox(){
        Connection connection=TMSDao.getConnection();
        
        
        String query="SELECT * FROM building";
        
        
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            ResultSet resultset=preparedStatement.executeQuery();
           
            while(resultset.next()){
                buildingComboBox.addItem(resultset.getString(2));
                
            }
           
            
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        new Thread().run();
        
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private static javax.swing.JComboBox<String> buildingComboBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton excellButton;
    private javax.swing.JLabel getRoomsButton;
    private javax.swing.JPanel getRoomsPanel;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printButton;
    private javax.swing.JTable roomsTable;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables

    private void showRooms() {
        /*
         try {
            
            Socket socket;
            
            socket = new Socket("localhost", 7777);
            
            System.out.println("Sending request to receive rooms from server....");
            
            //Send room dat a to server 
            PrintWriter writer;
            writer=new PrintWriter(socket.getOutputStream());
            writer.println(44);
            writer.flush();
            writer.close();
            System.out.println("Closing socket and terminating program.");
            socket.close();
            Thread.sleep(1000);
            
            socket = new Socket("localhost", 4242);
            
            System.out.println("Sending selected building to server..");
            writer=new PrintWriter(socket.getOutputStream());
            buildingName = (String) buildingComboBox.getSelectedItem();
            writer.println(buildingName);
            writer.flush();
            writer.close();
            socket.close();
            
            Thread.sleep(1000);
            
            socket = new Socket("localhost", 4545);
            
            System.out.println("Receiving data from server..");
            
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
             final ArrayList<Room>rooms = (ArrayList<Room>)objectInputStream.readObject();
        
             
             rooms.forEach(room -> {
                 final int idRoom = room.getIdRoom();
                 final String roomName = room.getRoomName();
                 final String roomCode = room.getRoomCode();
                 final int building_idBuilding = room.getBuilding_idBuilding();
                 roomsDataModel.addRow(new Object[]{idRoom, roomName, roomCode, building_idBuilding});
                 System.out.println("Received : "+idRoom);
                 System.out.println("Received : "+roomName);
                 System.out.println("Received : "+roomCode);
                 System.out.println("Received : "+building_idBuilding);
             });
            System.out.println("Closing socket and terminating program.");
            socket.close();
        } catch (IOException | InterruptedException | ClassNotFoundException ex) { 
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        }
       */
        
        
        buildingName = (String) buildingComboBox.getSelectedItem();
         
        Connection connection=TMSDao.getConnection();
        
         String query="SELECT idBuilding FROM building WHERE buildingName=? ";
         try {
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,buildingName);
            ResultSet resultset=preparedStatement.executeQuery();
            resultset.next();
            idBuilding = resultset.getInt(1);
            String roomsquery="SELECT * FROM room WHERE Building_idBuilding=?";
            PreparedStatement roompreparedStatement=connection.prepareStatement(roomsquery,ResultSet.CONCUR_UPDATABLE);
            roompreparedStatement.setInt(1,idBuilding);
            ResultSet roomresultset=roompreparedStatement.executeQuery();
            resultSetToTableModel = DbUtils.resultSetToTableModel(roomresultset);
            roomsTable.setModel(resultSetToTableModel);
     
       
           
 
            
           
            
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        
        
        
    }
        
}
