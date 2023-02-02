/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;
import com.mycompany.helper.FakeData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class SearchController implements ActionListener{

    
    private JTextField searchTerm = new JTextField();
    private DefaultTableModel model;
    
    public SearchController(JTextField searhTerm, DefaultTableModel model){
        this.searchTerm = searchTerm;
        this.model = model;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String searchTermString = this.searchTerm.getText();
        if(searchTermString != null && !searchTermString.equals("")){
            if(searchTermString.trim().equals("*")){
            model.setDataVector(FakeData.DATA, FakeData.TABLE_HEADER);
            return;
        }
            Object[][] newData= new Object[FakeData.DATA.length][];
            int index = 0;
            for(Object[] obj : FakeData.DATA){
               if(String.valueOf(obj[1]).toUpperCase().contains(searchTermString.toUpperCase().trim())){
                   newData[index++] = obj;
               } 
            }
            model.setDataVector(newData, FakeData.TABLE_HEADER);
        }else{
            JOptionPane.showMessageDialog(null,"Search term is empty!","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
