package com.infinitycorp.view;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Perseu Developer
 */
public class MenuItem extends javax.swing.JPanel {

    private final ArrayList<MenuItem> sub = new ArrayList<>();
    private ActionListener action;
    private boolean exibir = false;

    public void setExibir(boolean exibir) {
        this.exibir = exibir;
    }

    public ArrayList<MenuItem> getSub() {
        return sub;
    }

    public MenuItem(String title, ActionListener action, MenuItem... subMenus) {
        initComponents();
        jlabelTitle.setText(title);
        if (action != null) {
            this.action = action;
        }
        this.setSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 42));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 43));
        for (int i = 0; i < subMenus.length; i++) {
            this.sub.add(subMenus[i]);
            subMenus[i].setVisible(false);
            subMenus[i].setBackground(new java.awt.Color(44,29,78));
        }
    }
    
    private void showMenu() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < sub.size(); i++) {
                    sleep();
                    sub.get(i).setVisible(true);
                }
                exibir = true;
                getParent().repaint();
                getParent().revalidate();
            }
        }).start();
    }

    private void hideMenu() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = sub.size() - 1; i >= 0; i--) {
                    sleep();
                    sub.get(i).setVisible(false);
                    
                }
                getParent().repaint();
                getParent().revalidate();
                exibir = false;
            }
        }).start();
    }

    private void sleep() {
        try {
            Thread.sleep(20);
        } catch (Exception e) {
        }
    }
    
    private void hideOrMenu(){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jlabelTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(74, 50, 132));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        setLayout(null);

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator1);
        jSeparator1.setBounds(0, 40, 217, 2);

        jlabelTitle.setBackground(new java.awt.Color(74, 50, 132));
        jlabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlabelTitle.setText("Menu");
        add(jlabelTitle);
        jlabelTitle.setBounds(10, 14, 197, 16);
    }// </editor-fold>//GEN-END:initComponents


    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (exibir) {
            hideMenu();
        } else {
            showMenu();
        }
        if (action != null) {
            action.actionPerformed(null);
        }
        
    }//GEN-LAST:event_formMousePressed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabelTitle;
    // End of variables declaration//GEN-END:variables
}
