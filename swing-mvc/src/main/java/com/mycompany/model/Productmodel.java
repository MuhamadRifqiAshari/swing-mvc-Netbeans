/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.helper.FakeData;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Productmodel extends DefaultTableModel {
    public Productmodel(){
        super(FakeData.DATA, FakeData.TABLE_HEADER);
    }
    
}
