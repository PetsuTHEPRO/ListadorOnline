/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinitycorp.view;

import com.infinitycorp.controller.TelaInicialController;
import com.infinitycorp.model.identity.Client;
import static com.infinitycorp.utils.OpenWebPage.openWebPage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author perge
 */
public class TelaInicial extends javax.swing.JFrame {

    private final TelaInicialController controller;
    private boolean isLocked = false; // Controle para travar a abertura de outros menus

    // O restante do código...

    public void lockMenus() {
        isLocked = true;
    }

    public void unlockMenus() {
        isLocked = false;
    }

    public boolean isMenusLocked() {
        return isLocked;
    }
    
    /**
     * Creates new form TelaInicial
     * @param clientLogin
     */
    public TelaInicial(Client clientLogin) {
        initComponents();
        this.setTitle("Listador de Instagram - Desktop");
        
        String faviconPath = "src/com/infinitycorp/view/icon/favicon.png";
        ImageIcon favicon = new ImageIcon(faviconPath);

        // Verifica se a imagem foi carregada corretamente
        if (favicon.getIconWidth() == -1) {
            System.out.println("Imagem não encontrada: " + faviconPath);
        } else {
            System.out.println("Imagem encontrada: " + faviconPath);
            this.setIconImage(favicon.getImage());
        }
        
        controller = new TelaInicialController(this, clientLogin);
        controller.inicializeProgram((DefaultTableModel) this.getUsersJTABLE().getModel());
        execute();
    }
    
    private void execute() {
        MenuItem sub1 = new MenuItem("Opção 1", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Realizar uma ação!");
                pnlDashboard.repaint();
                pnlDashboard.revalidate();
            }
        });
        MenuItem subPerfil = new MenuItem("Meu Perfil", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Realizar uma ação!");
                pnlDashboard.repaint();
                pnlDashboard.revalidate();
            }
        });
        MenuItem subPremium = new MenuItem("Comprar Premium", null);
        MenuItem subAddSorteio = new MenuItem("Adicionar Sorteio", null);
        MenuItem subSorteio = new MenuItem("Abrir Sorteios", null);
        MenuItem subIG = new MenuItem("IG's", null);
        MenuItem subPremio = new MenuItem("Prêmios", null);
        MenuItem subEntregas = new MenuItem("Verificar Entregas", null);

        MenuItem tPrincipal = new MenuItem("Tela Principal", null);
        MenuItem dboard = new MenuItem("Dashboard", null);
        MenuItem perfil = new MenuItem("Perfil", null, subPerfil, subPremium);
        MenuItem sorteio = new MenuItem("Sorteio", null, subAddSorteio, subSorteio);
        MenuItem cadastrar = new MenuItem("Cadastrar", null, subIG, subPremio);
        MenuItem opcao = new MenuItem("Opções", null, subEntregas);

        addMenu(tPrincipal,dboard, perfil, sorteio, cadastrar, opcao);
    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            pnlOpcaoCadastro.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSub();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        pnlOpcaoCadastro.revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jFrame1 = new javax.swing.JFrame();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        pnlOpcaoCadastro = new javax.swing.JPanel();
        lblCreditos = new javax.swing.JLabel();
        pnlDashboard = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        String imagePath = "src/com/infinitycorp/view/icon/tips.png";
        ImageIcon icon2 = new ImageIcon(imagePath);

        // Verifica se a imagem foi carregada corretamente
        if (icon2.getIconWidth() == -1) {
            System.out.println("Imagem não encontrada: " + imagePath);
        } else {
            System.out.println("Imagem encontrada: " + imagePath);
            jLabel18 = new javax.swing.JLabel(icon2);
            jSeparator7 = new javax.swing.JSeparator();
            jLabel21 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jPanel7 = new javax.swing.JPanel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jPanel9 = new javax.swing.JPanel();
            jLabel27 = new javax.swing.JLabel();
            jPanel8 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jLabel17 = new javax.swing.JLabel();
            jPanel6 = new javax.swing.JPanel();
            jPanel10 = new javax.swing.JPanel();
            jPanel11 = new javax.swing.JPanel();
            String userPath = "src/com/infinitycorp/view/icon/dashUser.png";
            ImageIcon iconUser = new ImageIcon(userPath);

            // Verifica se a imagem foi carregada corretamente
            if (iconUser.getIconWidth() == -1) {
                System.out.println("Imagem não encontrada: " + userPath);
            } else {
                System.out.println("Imagem encontrada: " + userPath);
                jLabel20 = new javax.swing.JLabel(iconUser);
                jLabel24 = new javax.swing.JLabel();
                jLabel25 = new javax.swing.JLabel();
                jPanel12 = new javax.swing.JPanel();
                String luckPath = "src/com/infinitycorp/view/icon/dashLuck.png";
                ImageIcon iconLuck = new ImageIcon(luckPath);

                // Verifica se a imagem foi carregada corretamente
                if (iconLuck.getIconWidth() == -1) {
                    System.out.println("Imagem não encontrada: " + luckPath);
                } else {
                    System.out.println("Imagem encontrada: " + luckPath);
                    jLabel22 = new javax.swing.JLabel(iconLuck);
                    jLabel26 = new javax.swing.JLabel();
                    jLabel28 = new javax.swing.JLabel();
                    jLabel31 = new javax.swing.JLabel();
                    jPanel13 = new javax.swing.JPanel();
                    String blockPath = "src/com/infinitycorp/view/icon/dashBlock.png";
                    ImageIcon iconBlock = new ImageIcon(blockPath);

                    // Verifica se a imagem foi carregada corretamente
                    if (iconBlock.getIconWidth() == -1) {
                        System.out.println("Imagem não encontrada: " + blockPath);
                    } else {
                        System.out.println("Imagem encontrada: " + blockPath);
                        jLabel23 = new javax.swing.JLabel(iconBlock);
                        jLabel29 = new javax.swing.JLabel();
                        jLabel30 = new javax.swing.JLabel();
                        jLabel34 = new javax.swing.JLabel();
                        jPanel14 = new javax.swing.JPanel();
                        jProgressBar1 = new javax.swing.JProgressBar();
                        jLabel32 = new javax.swing.JLabel();
                        jLabel35 = new javax.swing.JLabel();
                        jProgressBar2 = new javax.swing.JProgressBar();
                        jLabel37 = new javax.swing.JLabel();
                        jLabel38 = new javax.swing.JLabel();
                        jProgressBar3 = new javax.swing.JProgressBar();
                        jLabel39 = new javax.swing.JLabel();
                        jLabel40 = new javax.swing.JLabel();
                        jPanel15 = new javax.swing.JPanel();
                        jLabel36 = new javax.swing.JLabel();
                        jPanel16 = new javax.swing.JPanel();
                        jComboBox1 = new javax.swing.JComboBox<>();
                        jLabel41 = new javax.swing.JLabel();
                        jLabel42 = new javax.swing.JLabel();
                        jLabel43 = new javax.swing.JLabel();
                        jLabel19 = new javax.swing.JLabel();
                        jPanel5 = new javax.swing.JPanel();
                        jPanel4 = new javax.swing.JPanel();
                        jSeparator3 = new javax.swing.JSeparator();
                        jLabel8 = new javax.swing.JLabel();
                        jLabel9 = new javax.swing.JLabel();
                        txtName = new javax.swing.JTextField();
                        txtLastName = new javax.swing.JTextField();
                        jSeparator4 = new javax.swing.JSeparator();
                        jButton1 = new javax.swing.JButton();
                        jLabel10 = new javax.swing.JLabel();
                        txtEmail = new javax.swing.JTextField();
                        jLabel11 = new javax.swing.JLabel();
                        jButton3 = new javax.swing.JButton();
                        jLabel12 = new javax.swing.JLabel();
                        txtPassword = new javax.swing.JPasswordField();
                        jSeparator5 = new javax.swing.JSeparator();
                        jLabel13 = new javax.swing.JLabel();
                        txtUser = new javax.swing.JTextField();
                        jLabel14 = new javax.swing.JLabel();
                        jSeparator6 = new javax.swing.JSeparator();
                        jLabel15 = new javax.swing.JLabel();
                        jTextField2 = new javax.swing.JTextField();
                        txtformBirthDate = new javax.swing.JFormattedTextField();
                        btnSalvar = new javax.swing.JButton();
                        jButton9 = new javax.swing.JButton();
                        jLabel33 = new javax.swing.JLabel();
                        jPanel17 = new javax.swing.JPanel();
                        jPanel18 = new javax.swing.JPanel();
                        jTextField1 = new javax.swing.JTextField();
                        jLabel45 = new javax.swing.JLabel();
                        jScrollPane2 = new javax.swing.JScrollPane();
                        jTextArea1 = new javax.swing.JTextArea();
                        jLabel46 = new javax.swing.JLabel();
                        jLabel47 = new javax.swing.JLabel();
                        jTextField3 = new javax.swing.JTextField();
                        jLabel48 = new javax.swing.JLabel();
                        jTextField4 = new javax.swing.JTextField();
                        jPanel20 = new javax.swing.JPanel();
                        jLabel49 = new javax.swing.JLabel();
                        jPanel19 = new javax.swing.JPanel();
                        jButton4 = new javax.swing.JButton();
                        jButton2 = new javax.swing.JButton();
                        jButton5 = new javax.swing.JButton();
                        jLabel50 = new javax.swing.JLabel();
                        jTextField5 = new javax.swing.JTextField();
                        jSeparator8 = new javax.swing.JSeparator();
                        jLabel56 = new javax.swing.JLabel();
                        jLabel44 = new javax.swing.JLabel();
                        jPanel21 = new javax.swing.JPanel();
                        jScrollPane4 = new javax.swing.JScrollPane();
                        jTable1 = new javax.swing.JTable();
                        jLabel55 = new javax.swing.JLabel();
                        jPanel27 = new javax.swing.JPanel();
                        jPanel23 = new javax.swing.JPanel();
                        jLabel51 = new javax.swing.JLabel();
                        jScrollPane5 = new javax.swing.JScrollPane();
                        jTextArea2 = new javax.swing.JTextArea();
                        jLabel52 = new javax.swing.JLabel();
                        jLabel53 = new javax.swing.JLabel();
                        jLabel54 = new javax.swing.JLabel();
                        jTextField6 = new javax.swing.JTextField();
                        jTextField7 = new javax.swing.JTextField();
                        jTextField8 = new javax.swing.JTextField();
                        jPanel22 = new javax.swing.JPanel();
                        jRadioButton2 = new javax.swing.JRadioButton();
                        jRadioButton3 = new javax.swing.JRadioButton();
                        jRadioButton4 = new javax.swing.JRadioButton();
                        jRadioButton5 = new javax.swing.JRadioButton();
                        jButton6 = new javax.swing.JButton();
                        jButton7 = new javax.swing.JButton();
                        jSeparator9 = new javax.swing.JSeparator();
                        jLabel57 = new javax.swing.JLabel();
                        jPanel24 = new javax.swing.JPanel();
                        jPanel28 = new javax.swing.JPanel();
                        userInstagramTxt = new javax.swing.JTextField();
                        jLabel58 = new javax.swing.JLabel();
                        jScrollPane6 = new javax.swing.JScrollPane();
                        Descricaotxt = new javax.swing.JTextArea();
                        jLabel59 = new javax.swing.JLabel();
                        jLabel61 = new javax.swing.JLabel();
                        jSeparator10 = new javax.swing.JSeparator();
                        jLabel64 = new javax.swing.JLabel();
                        VisibilidadeJBox = new javax.swing.JComboBox<>();
                        jLabel65 = new javax.swing.JLabel();
                        jPanel25 = new javax.swing.JPanel();
                        String defaultIconPath = "src/com/infinitycorp/view/icon/boy.png";
                        ImageIcon defaultIcon = new ImageIcon(defaultIconPath);

                        // Verifica se a imagem foi carregada corretamente
                        if (defaultIcon.getIconWidth() == -1) {
                            System.out.println("Imagem não encontrada: " + defaultIconPath);
                        } else {
                            System.out.println("Imagem encontrada: " + defaultIconPath);
                            iconeProfileLBL = new javax.swing.JLabel(defaultIcon);
                            avatarBox = new javax.swing.JComboBox<>();
                            isPhotoPerfil = new javax.swing.JComboBox<>();
                            jPanel30 = new javax.swing.JPanel();
                            limparUserInstagramBTN = new javax.swing.JButton();
                            salvarUserInstagramBTN = new javax.swing.JButton();
                            editarBTN = new javax.swing.JButton();
                            buscarSearchTxt = new javax.swing.JTextField();
                            buscarBtn = new javax.swing.JToggleButton();
                            jTabbedPane4 = new javax.swing.JTabbedPane();
                            jPanel26 = new javax.swing.JPanel();
                            jScrollPane7 = new javax.swing.JScrollPane();
                            UsersJTABLE = new javax.swing.JTable();
                            jPanel31 = new javax.swing.JPanel();
                            limparUserInstagramBTN1 = new javax.swing.JButton();
                            salvarUserInstagramBTN1 = new javax.swing.JButton();
                            jLabel60 = new javax.swing.JLabel();
                            selectedLabel = new javax.swing.JLabel();
                            jButton8 = new javax.swing.JButton();

                            jScrollPane3.setViewportView(jEditorPane1);

                            javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
                            jFrame1.getContentPane().setLayout(jFrame1Layout);
                            jFrame1Layout.setHorizontalGroup(
                                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGap(0, 400, Short.MAX_VALUE)
                            );
                            jFrame1Layout.setVerticalGroup(
                                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGap(0, 300, Short.MAX_VALUE)
                            );

                            jTabbedPane2.addTab("tab1", jTabbedPane3);

                            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                            jPanel1.setLayout(null);

                            pnlMenu.setBackground(new java.awt.Color(68, 18, 104));

                            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                            jLabel1.setText("Lucky List");

                            jSeparator2.setPreferredSize(new java.awt.Dimension(3, 3));

                            jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
                            jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

                            pnlOpcaoCadastro.setBackground(new java.awt.Color(68, 18, 104));
                            pnlOpcaoCadastro.setLayout(new javax.swing.BoxLayout(pnlOpcaoCadastro, javax.swing.BoxLayout.PAGE_AXIS));

                            lblCreditos.setForeground(new java.awt.Color(255, 255, 255));
                            lblCreditos.setText("Copyright © José Peterson");

                            javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
                            pnlMenu.setLayout(pnlMenuLayout);
                            pnlMenuLayout.setHorizontalGroup(
                                pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlMenuLayout.createSequentialGroup()
                                    .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnlMenuLayout.createSequentialGroup()
                                            .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pnlMenuLayout.createSequentialGroup()
                                                    .addGap(30, 30, 30)
                                                    .addComponent(lblCreditos))
                                                .addComponent(pnlOpcaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(pnlMenuLayout.createSequentialGroup()
                                                    .addGap(36, 36, 36)
                                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addContainerGap())
                                .addGroup(pnlMenuLayout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(jLabel1)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            );
                            pnlMenuLayout.setVerticalGroup(
                                pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlMenuLayout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(pnlOpcaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblCreditos)
                                    .addContainerGap())
                            );

                            jPanel1.add(pnlMenu);
                            pnlMenu.setBounds(0, 0, 200, 500);

                            pnlDashboard.setBackground(new java.awt.Color(204, 204, 204));
                            pnlDashboard.setLayout(null);

                            jPanel2.setBackground(new java.awt.Color(255, 255, 255));

                            jPanel3.setBackground(new java.awt.Color(172, 237, 255));
                            jPanel3.setBorder(BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(102,102,102)));

                            jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
                            jLabel7.setForeground(new java.awt.Color(255, 186, 73));
                            jLabel7.setText("Dicas");

                        }
                        jLabel18.setText("");

                        jSeparator7.setBackground(new java.awt.Color(172, 237, 255));

                        jLabel21.setText("<html><h1>1. Acredite</h1><br>Sempre acredite que você<br> vai conseguir. Nunca desista<br></html>");

                        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                        jPanel3.setLayout(jPanel3Layout);
                        jPanel3Layout.setHorizontalGroup(
                            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18)
                                        .addGap(0, 57, Short.MAX_VALUE)))
                                .addContainerGap())
                        );
                        jPanel3Layout.setVerticalGroup(
                            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addContainerGap(609, Short.MAX_VALUE))
                        );

                        jLabel3.setText("<html><head><style>h1{color: #000;font-size: 14px;}h2{color: #141518;font-size: 11px;}p{text-align=\"justify\";}</head>"
                            + "<h1>Agradecimentos</h1><br><p>Agradeço você"
                            + " por está utilizando o meu aplicativo. Espero que ele lhe ajude a <br>conseguir "
                            + "a ganhar mais sorteios! Nesse programa você tem como organizar seus<br> IG's(Usuario do Instagram),"
                            + " Salvar sorteio, prêmios e acompanhar sua entrega!</p><br>"
                            + "<h1>(1) Dashboard</h1><br><p>Na tela de Dashboard vai conter diversas informações "
                            + "sobre quantidades<br> de sorteios participados, quantidades de prêmios e de IG's cadastrados "
                            + "e para<br> acessa-lo basta clicar nele no menu lateral ao lado!</p><br>"
                            + "<h1>(2) Perfil</h1><br><p>Você também encontrar essa opção no menu ao lado, clicando nela"
                            + "você vai <br>depara-se com duas opções:</p><br><h2>Meu Perfil</h2><br><p>Nessa opção você consegue ver todas"
                            + "as infomações do seu perfil(Nome, Email,<br> Data de Nascimento). Tendo liberdade para alterar qualquer informação"
                            + " que <br>ali se encontrar.</p></html>");

                        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

                        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel4.setText("Imagem");

                        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel5.setText("Imagem");

                        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel6.setText("Imagem");

                        jPanel9.setBackground(new java.awt.Color(51, 51, 51));

                        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel27.setText("(c) José Peterson Versão 1.0");

                        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
                        jPanel9.setLayout(jPanel9Layout);
                        jPanel9Layout.setHorizontalGroup(
                            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel27)
                                .addGap(194, 194, 194))
                        );
                        jPanel9Layout.setVerticalGroup(
                            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        );

                        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                        jPanel7.setLayout(jPanel7Layout);
                        jPanel7Layout.setHorizontalGroup(
                            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addContainerGap(224, Short.MAX_VALUE))
                        );
                        jPanel7Layout.setVerticalGroup(
                            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        );

                        jPanel8.setBackground(new java.awt.Color(244, 91, 105));

                        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel2.setText("Bem Vindo(a)");

                        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
                        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel17.setText("Seja");

                        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                        jPanel8.setLayout(jPanel8Layout);
                        jPanel8Layout.setHorizontalGroup(
                            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel2))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                        jPanel8Layout.setVerticalGroup(
                            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap(22, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                        );

                        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                        jPanel2.setLayout(jPanel2Layout);
                        jPanel2Layout.setHorizontalGroup(
                            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );
                        jPanel2Layout.setVerticalGroup(
                            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        );

                        jScrollPane1.setViewportView(jPanel2);

                        jTabbedPane1.addTab("tab1", jScrollPane1);

                        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
                        jPanel10.setPreferredSize(new java.awt.Dimension(511, 395));

                    }
                    jLabel20.setBackground(new java.awt.Color(51, 255, 255));
                    jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel20.setText("");
                    jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    jLabel20.setOpaque(true);

                    jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
                    jLabel24.setForeground(new java.awt.Color(102, 102, 102));
                    jLabel24.setText("IG's Cadastrado");

                    jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                    jLabel25.setForeground(new java.awt.Color(153, 153, 153));
                    jLabel25.setText("0");

                    javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
                    jPanel11.setLayout(jPanel11Layout);
                    jPanel11Layout.setHorizontalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel24)))
                            .addContainerGap(34, Short.MAX_VALUE))
                    );
                    jPanel11Layout.setVerticalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(15, Short.MAX_VALUE))
                    );

                }
                jLabel22.setBackground(new java.awt.Color(51, 255, 51));
                jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel22.setText("");
                jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                jLabel22.setOpaque(true);

                jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel26.setForeground(new java.awt.Color(102, 102, 102));
                jLabel26.setText("Sorteios ganho");

                jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel28.setForeground(new java.awt.Color(153, 153, 153));
                jLabel28.setText("0/0");

                jLabel31.setForeground(new java.awt.Color(255, 204, 102));
                jLabel31.setText("(!) Valor Baixo");

                javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
                jPanel12.setLayout(jPanel12Layout);
                jPanel12Layout.setHorizontalGroup(
                    jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28)))
                        .addContainerGap(26, Short.MAX_VALUE))
                );
                jPanel12Layout.setVerticalGroup(
                    jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel31))))
                );

            }
            jLabel23.setBackground(new java.awt.Color(255, 0, 0));
            jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel23.setText("");
            jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLabel23.setOpaque(true);

            jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel29.setForeground(new java.awt.Color(102, 102, 102));
            jLabel29.setText("Usuário Invalidos");

            jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel30.setForeground(new java.awt.Color(153, 153, 153));
            jLabel30.setText("0");

            jLabel34.setForeground(new java.awt.Color(255, 0, 0));
            jLabel34.setText("(!) Valor Muito alto");

            javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
            jPanel13.setLayout(jPanel13Layout);
            jPanel13Layout.setHorizontalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel29))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jLabel34)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel30)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel13Layout.setVerticalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34))))
            );

            jPanel14.setBackground(new java.awt.Color(255, 255, 255));
            jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Porcentagem"));

            jLabel32.setText("Icon");

            jLabel35.setText("20%");

            jLabel37.setText("Icon");

            jLabel38.setText("50%");

            jLabel39.setText("Icon");

            jLabel40.setText("0%");

            javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
            jPanel14.setLayout(jPanel14Layout);
            jPanel14Layout.setHorizontalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel37)
                                .addComponent(jLabel39)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addGap(167, 167, 167)
                                    .addComponent(jLabel35))
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap(8, Short.MAX_VALUE))
            );
            jPanel14Layout.setVerticalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel35)
                    .addGap(3, 3, 3)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addComponent(jLabel38)
                    .addGap(4, 4, 4)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addComponent(jLabel40)
                    .addGap(2, 2, 2)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel15.setBackground(new java.awt.Color(255, 255, 255));
            jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Mensagem"));

            jLabel36.setBackground(new java.awt.Color(204, 204, 204));
            jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel36.setText("Sempre alimente o Dashboard com dados! Dessa forma você terá uma base da sua situação.");
            jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jLabel36.setOpaque(true);

            javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
            jPanel15.setLayout(jPanel15Layout);
            jPanel15Layout.setHorizontalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                    .addContainerGap(11, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18))
            );
            jPanel15Layout.setVerticalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE))
            );

            jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Sorteio"));

            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sorteio de Livros - Maria", "Sorteio de LOL - Skin da Lux", "Sorteio de um Iphone", "Sorteio aletório" }));

            jLabel41.setText("Porcentagem de ganho");

            jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel42.setText("Inserir um Gráfico");
            jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel43.setForeground(new java.awt.Color(255, 0, 0));
            jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel43.setText("Função disponível apenas para Premium.");
            jLabel43.setOpaque(true);

            javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
            jPanel16.setLayout(jPanel16Layout);
            jPanel16Layout.setHorizontalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(jLabel41)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBox1, 0, 1, Short.MAX_VALUE)))
                    .addContainerGap())
                .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            jPanel16Layout.setVerticalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel41))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel43))
            );

            javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
            jPanel10.setLayout(jPanel10Layout);
            jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );
            jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(4, 4, 4)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(34, 34, 34))
            );

            jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
            jLabel19.setForeground(new java.awt.Color(102, 102, 102));
            jLabel19.setText("Dashboard");

            javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
            jPanel6.setLayout(jPanel6Layout);
            jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(40, Short.MAX_VALUE))
            );
            jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel19)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(258, 258, 258))
            );

            jTabbedPane1.addTab("tab3", jPanel6);

            jPanel4.setBackground(new java.awt.Color(255, 255, 255));
            jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Seus dados"));

            jLabel8.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 14)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(51, 51, 51));
            jLabel8.setText("Meu Perfil");

            jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel9.setText("Nome");

            txtName.setEditable(false);
            txtName.setText("ERROR_INVALID_NAME");

            txtLastName.setEditable(false);
            txtLastName.setText("ERROR_INVALID_LASTNAME");
            txtLastName.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtLastNameActionPerformed(evt);
                }
            });

            jButton1.setBackground(new java.awt.Color(255, 255, 102));
            jButton1.setText("Excluir Conta");
            jButton1.setBorder(null);

            jLabel10.setText("E-mail");

            txtEmail.setEditable(false);
            txtEmail.setText("ERROR_INVALID_EMAIL");

            jLabel11.setText("Senha");

            jButton3.setText("Editar");

            jLabel12.setText("Data de Nascimento");

            txtPassword.setEditable(false);
            txtPassword.setText("123");

            jLabel13.setText("Usuário");

            txtUser.setEditable(false);
            txtUser.setText("ERROR_INVALID_USERNAME");
            txtUser.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtUserActionPerformed(evt);
                }
            });

            jLabel14.setText("Sobrenome");

            jLabel15.setText("Ultimo Acesso");

            jTextField2.setEditable(false);
            jTextField2.setText("00/00/0000");

            txtformBirthDate.setEditable(false);
            txtformBirthDate.setText("00/00/0000");

            btnSalvar.setText("Salvar");
            btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnSalvarMouseClicked(evt);
                }
            });

            jButton9.setText("Mudar");
            jButton9.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton9ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jSeparator4)
                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSalvar)
                            .addGap(12, 12, 12))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel13))
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel11)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton9))
                                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtformBirthDate))
                                    .addGap(121, 121, 121)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap(14, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(26, 26, 26)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25))))
                .addComponent(jSeparator6)
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(38, 38, 38)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9))
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel15))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtformBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(21, Short.MAX_VALUE))
            );

            jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
            jLabel33.setForeground(new java.awt.Color(102, 102, 102));
            jLabel33.setText("Perfil");

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel33)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(35, Short.MAX_VALUE))
            );
            jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jLabel33)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jTabbedPane1.addTab("tab2", jPanel5);

            jPanel18.setBackground(new java.awt.Color(255, 255, 255));
            jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Insira os Dados do Sorteio"));

            jTextField1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField1ActionPerformed(evt);
                }
            });

            jLabel45.setText("Nome do Sorteio");

            jTextArea1.setColumns(20);
            jTextArea1.setRows(5);
            jTextArea1.setPreferredSize(new java.awt.Dimension(190, 94));
            jScrollPane2.setViewportView(jTextArea1);

            jLabel46.setText("Descrição/Regras");

            jLabel47.setText("Data do sorteiamento");

            jLabel48.setText("Dono(a) do sorteio");

            jLabel49.setText("Inserir uma Imagem");

            javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
            jPanel20.setLayout(jPanel20Layout);
            jPanel20Layout.setHorizontalGroup(
                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jLabel49)
                    .addGap(18, 18, 18))
            );
            jPanel20Layout.setVerticalGroup(
                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jLabel49)
                    .addContainerGap(49, Short.MAX_VALUE))
            );

            jPanel19.setBackground(new java.awt.Color(255, 255, 255));
            jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar/Salvar"));

            jButton4.setText("Limpar");

            jButton2.setText("Salvar");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            jButton5.setText("Editar");

            jLabel50.setText("Lupa");

            javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
            jPanel19.setLayout(jPanel19Layout);
            jPanel19Layout.setHorizontalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                    .addComponent(jLabel50)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18))
            );
            jPanel19Layout.setVerticalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5)
                            .addComponent(jLabel50))
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton2)))
                    .addGap(0, 15, Short.MAX_VALUE))
            );

            jLabel56.setBackground(new java.awt.Color(51, 51, 51));
            jLabel56.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 14)); // NOI18N
            jLabel56.setForeground(new java.awt.Color(51, 51, 51));
            jLabel56.setText("Adicionar Sorteio");

            javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
            jPanel18.setLayout(jPanel18Layout);
            jPanel18Layout.setHorizontalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(jLabel48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel47))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel45))
                            .addContainerGap(23, Short.MAX_VALUE))
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel46)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel56)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel18Layout.setVerticalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jLabel56)
                    .addGap(11, 11, 11)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addComponent(jLabel45)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel48)
                                .addComponent(jLabel47))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)
                    .addComponent(jLabel46)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22))
            );

            jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
            jLabel44.setForeground(new java.awt.Color(102, 102, 102));
            jLabel44.setText("Sorteio");

            javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
            jPanel17.setLayout(jPanel17Layout);
            jPanel17Layout.setHorizontalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jLabel44)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                    .addContainerGap(51, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            jPanel17Layout.setVerticalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel44)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE))
            );

            jTabbedPane1.addTab("tab4", jPanel17);

            jTable1.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null}
                },
                new String [] {
                    "Sorteio", "Dono(a) do Sorteio", "Data do Sorteamento", "Descrição", "Status"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }
            });
            jTable1.setGridColor(new java.awt.Color(102, 102, 102));
            jScrollPane4.setViewportView(jTable1);

            jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
            jLabel55.setForeground(new java.awt.Color(102, 102, 102));
            jLabel55.setText("Verificar Sorteio");

            jPanel27.setBackground(new java.awt.Color(255, 255, 255));
            jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Sorteio"));

            jPanel23.setBackground(new java.awt.Color(255, 255, 255));

            jLabel51.setText("Nome do Sorteio");

            jTextArea2.setEditable(false);
            jTextArea2.setColumns(20);
            jTextArea2.setRows(5);
            jScrollPane5.setViewportView(jTextArea2);

            jLabel52.setText("Dono(a) do Sorteio");

            jLabel53.setText("Data do Sorteio");

            jLabel54.setText("Descrição");

            jTextField6.setEditable(false);
            jTextField6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField6ActionPerformed(evt);
                }
            });

            jTextField7.setEditable(false);

            jTextField8.setEditable(false);
            jTextField8.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField8ActionPerformed(evt);
                }
            });

            jPanel22.setBackground(new java.awt.Color(255, 255, 255));
            jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Ganhei"));

            jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
            jRadioButton2.setText("Não");

            jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
            jRadioButton3.setText("Cancelado");

            jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
            jRadioButton4.setText("Desisti");
            jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jRadioButton4ActionPerformed(evt);
                }
            });

            jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
            jRadioButton5.setText("Sim");

            javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
            jPanel22.setLayout(jPanel22Layout);
            jPanel22Layout.setHorizontalGroup(
                jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jRadioButton3)
                        .addComponent(jRadioButton4)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(20, 20, 20))
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jRadioButton5)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel22Layout.setVerticalGroup(
                jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );

            jButton6.setText("Salvar");

            jButton7.setText("Verificar");
            jButton7.setEnabled(false);

            javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
            jPanel23.setLayout(jPanel23Layout);
            jPanel23Layout.setHorizontalGroup(
                jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel51)
                        .addComponent(jLabel52)
                        .addComponent(jLabel54)
                        .addComponent(jLabel53))
                    .addGap(12, 12, 12)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField7)
                        .addComponent(jTextField6)
                        .addComponent(jTextField8)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20))
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton6)
                            .addContainerGap())))
            );
            jPanel23Layout.setVerticalGroup(
                jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel51)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel52)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel53)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel54)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap())
            );

            jLabel57.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 14)); // NOI18N
            jLabel57.setForeground(new java.awt.Color(51, 51, 51));
            jLabel57.setText("Verificar Sorteio");

            javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
            jPanel27.setLayout(jPanel27Layout);
            jPanel27Layout.setHorizontalGroup(
                jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel57)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jSeparator9)
            );
            jPanel27Layout.setVerticalGroup(
                jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel57)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0))
            );

            javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
            jPanel21.setLayout(jPanel21Layout);
            jPanel21Layout.setHorizontalGroup(
                jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel55)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addContainerGap(11, Short.MAX_VALUE))
            );
            jPanel21Layout.setVerticalGroup(
                jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel55)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29))
            );

            jTabbedPane1.addTab("tab5", jPanel21);

            jPanel28.setBackground(new java.awt.Color(255, 255, 255));
            jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder("Insira os Dados do Sorteio"));

            userInstagramTxt.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    userInstagramTxtActionPerformed(evt);
                }
            });

            jLabel58.setText("User:");

            Descricaotxt.setColumns(20);
            Descricaotxt.setRows(5);
            Descricaotxt.setPreferredSize(new java.awt.Dimension(190, 94));
            jScrollPane6.setViewportView(Descricaotxt);

            jLabel59.setText("Descrição");

            jLabel61.setText("URL do Perfil");

            jLabel64.setBackground(new java.awt.Color(51, 51, 51));
            jLabel64.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 14)); // NOI18N
            jLabel64.setForeground(new java.awt.Color(51, 51, 51));
            jLabel64.setText("Cadastro de Usuários");

            VisibilidadeJBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Público", "Privado" }));
            VisibilidadeJBox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    VisibilidadeJBoxActionPerformed(evt);
                }
            });

            jLabel65.setText("Foto Perfil:");

            jPanel25.setPreferredSize(new java.awt.Dimension(95, 54));

        }
        iconeProfileLBL.setText("");

        avatarBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "João", "Maria", "André", "Julia", "Robot" }));
        avatarBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                avatarBoxItemStateChanged(evt);
            }
        });
        avatarBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avatarBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(avatarBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(iconeProfileLBL)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconeProfileLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(avatarBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        isPhotoPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        isPhotoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isPhotoPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator10)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel59)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58)
                                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel28Layout.createSequentialGroup()
                                            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(VisibilidadeJBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(45, 45, 45)
                                            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel65)
                                                .addComponent(isPhotoPerfil, 0, 211, Short.MAX_VALUE)))
                                        .addComponent(userInstagramTxt)))))
                        .addGap(0, 27, Short.MAX_VALUE))))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userInstagramTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(jLabel65))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VisibilidadeJBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isPhotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar/Salvar"));

        limparUserInstagramBTN.setText("Limpar");
        limparUserInstagramBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limparUserInstagramBTNMouseClicked(evt);
            }
        });

        salvarUserInstagramBTN.setText("Salvar");
        salvarUserInstagramBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarUserInstagramBTNMouseClicked(evt);
            }
        });
        salvarUserInstagramBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarUserInstagramBTNActionPerformed(evt);
            }
        });

        editarBTN.setText("Editar");
        editarBTN.setEnabled(false);
        editarBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarBTNMouseClicked(evt);
            }
        });

        buscarBtn.setText("Buscar");
        buscarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(limparUserInstagramBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarUserInstagramBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buscarSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscarBtn))
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(limparUserInstagramBTN)
                        .addComponent(editarBTN)
                        .addComponent(salvarUserInstagramBTN)))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", jPanel24);

        UsersJTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "User", "Descrição", "Visibilidade", "Foto Perfil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            };
        });
        UsersJTABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersJTABLEMouseClicked(evt);
            }
        });
        UsersJTABLE.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                UsersJTABLEPropertyChange(evt);
            }
        });
        jScrollPane7.setViewportView(UsersJTABLE);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar/Salvar"));

        limparUserInstagramBTN1.setText("Atualizar");
        limparUserInstagramBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limparUserInstagramBTN1MouseClicked(evt);
            }
        });

        salvarUserInstagramBTN1.setText("Abrir Perfil");
        salvarUserInstagramBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarUserInstagramBTN1MouseClicked(evt);
            }
        });
        salvarUserInstagramBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarUserInstagramBTN1ActionPerformed(evt);
            }
        });

        jLabel60.setText("Selecionado:");

        selectedLabel.setText("N/A");

        jButton8.setText("Excluir");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(limparUserInstagramBTN1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarUserInstagramBTN1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedLabel)
                .addGap(53, 53, 53))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limparUserInstagramBTN1)
                    .addComponent(salvarUserInstagramBTN1)
                    .addComponent(jLabel60)
                    .addComponent(selectedLabel)
                    .addComponent(jButton8))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("tab7", jPanel26);

        pnlDashboard.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 610, 500);

        jPanel1.add(pnlDashboard);
        pnlDashboard.setBounds(200, 0, 610, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked

    }//GEN-LAST:event_btnSalvarMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void userInstagramTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInstagramTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInstagramTxtActionPerformed

    private void salvarUserInstagramBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarUserInstagramBTNActionPerformed
        // TODO add your handling code here:
        controller.registerUser();
        controller.getUserAll((DefaultTableModel) this.getUsersJTABLE().getModel());
    }//GEN-LAST:event_salvarUserInstagramBTNActionPerformed

    private void VisibilidadeJBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisibilidadeJBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VisibilidadeJBoxActionPerformed

    private void avatarBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avatarBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avatarBoxActionPerformed

    private void isPhotoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isPhotoPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isPhotoPerfilActionPerformed

    private void buscarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMouseClicked
        // TODO add your ling code here:
        controller.buscarUser(this.buscarSearchTxt.getText());
        this.salvarUserInstagramBTN.setEnabled(false);
        this.editarBTN.setEnabled(true);
        this.userInstagramTxt.setEnabled(false);
    }//GEN-LAST:event_buscarBtnMouseClicked

    private void limparUserInstagramBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparUserInstagramBTNMouseClicked
        // TODO add your handling code here:
        controller.limparCampoUserInstagram();
        this.userInstagramTxt.setEnabled(true);
        this.salvarUserInstagramBTN.setEnabled(true);
        this.editarBTN.setEnabled(false);
    }//GEN-LAST:event_limparUserInstagramBTNMouseClicked

    private void editarBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarBTNMouseClicked
        // TODO add your handling code here:
        controller.editarUser();
        this.salvarUserInstagramBTN.setEnabled(true);
        this.editarBTN.setEnabled(false);
        this.userInstagramTxt.setEnabled(true);
    }//GEN-LAST:event_editarBTNMouseClicked

    private void avatarBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_avatarBoxItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
                    // Quando uma opção é selecionada, altera a imagem
                    int selectedIndex = this.avatarBox.getSelectedIndex();
                    
                    switch(selectedIndex){
                        case 0:
                            String iconProfilePath = "src/com/infinitycorp/view/icon/man.png";
                            ImageIcon iconProfile1 = new ImageIcon(iconProfilePath);

                            // Verifica se a imagem foi carregada corretamente
                            if (iconProfile1.getIconWidth() == -1) {
                                System.out.println("Imagem não encontrada: " + iconProfilePath);
                            } else {
                                System.out.println("Imagem encontrada: " + iconProfilePath);
                                this.iconeProfileLBL.setIcon(iconProfile1);
                            }
                        break;
                        
                        case 1:
                            String iconProfilePath2 = "src/com/infinitycorp/view/icon/woman.png";
                            ImageIcon iconProfile2 = new ImageIcon(iconProfilePath2);

                            // Verifica se a imagem foi carregada corretamente
                            if (iconProfile2.getIconWidth() == -1) {
                                System.out.println("Imagem não encontrada: " + iconProfilePath2);
                            } else {
                                System.out.println("Imagem encontrada: " + iconProfilePath2);
                                this.iconeProfileLBL.setIcon(iconProfile2);
                            }
                        break;
                        
                        case 2:
                            String iconProfilePath3 = "src/com/infinitycorp/view/icon/boy.png";
                            ImageIcon iconProfile3 = new ImageIcon(iconProfilePath3);

                            // Verifica se a imagem foi carregada corretamente
                            if (iconProfile3.getIconWidth() == -1) {
                                System.out.println("Imagem não encontrada: " + iconProfilePath3);
                            } else {
                                System.out.println("Imagem encontrada: " + iconProfilePath3);
                                this.iconeProfileLBL.setIcon(iconProfile3);
                            }
                        break;
                        
                        case 3:
                            String iconProfilePath4 = "src/com/infinitycorp/view/icon/girl.png";
                            ImageIcon iconProfile4 = new ImageIcon(iconProfilePath4);

                            // Verifica se a imagem foi carregada corretamente
                            if (iconProfile4.getIconWidth() == -1) {
                                System.out.println("Imagem não encontrada: " + iconProfilePath4);
                            } else {
                                System.out.println("Imagem encontrada: " + iconProfilePath4);
                                this.iconeProfileLBL.setIcon(iconProfile4);
                            }
                        break;
                        
                        case 4:
                            String iconProfilePath5 = "src/com/infinitycorp/view/icon/robot.png";
                            ImageIcon iconProfile5 = new ImageIcon(iconProfilePath5);

                            // Verifica se a imagem foi carregada corretamente
                            if (iconProfile5.getIconWidth() == -1) {
                                System.out.println("Imagem não encontrada: " + iconProfilePath5);
                            } else {
                                System.out.println("Imagem encontrada: " + iconProfilePath5);
                                this.iconeProfileLBL.setIcon(iconProfile5);
                            }
                        break;
                        
                    }
        }
    }//GEN-LAST:event_avatarBoxItemStateChanged

    private void limparUserInstagramBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparUserInstagramBTN1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_limparUserInstagramBTN1MouseClicked

    private void salvarUserInstagramBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarUserInstagramBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvarUserInstagramBTN1ActionPerformed

    private void salvarUserInstagramBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarUserInstagramBTNMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_salvarUserInstagramBTNMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void UsersJTABLEPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_UsersJTABLEPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_UsersJTABLEPropertyChange

    private void salvarUserInstagramBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarUserInstagramBTN1MouseClicked
        // TODO add your handling code here:
        int selectedRow = this.getUsersJTABLE().getSelectedRow();
        
        String userPerfil = (String) this.getUsersJTABLE().getValueAt(selectedRow, 1);
        // Verificação de segurança usando expressão regular
        if (isValidUserProfile(userPerfil)) {
            openWebPage("https://www.instagram.com/" + userPerfil + "/");
        } else {
            JOptionPane.showMessageDialog(null, "Nome de perfil inválido. Apenas letras, números e '.' são permitidos.");
        }
    }//GEN-LAST:event_salvarUserInstagramBTN1MouseClicked

    // Método para verificar se o perfil é válido
    private boolean isValidUserProfile(String userPerfil) {
        return userPerfil.matches("[a-zA-Z0-9\\.]+"); // Apenas letras, números e pontos
    }
    
    private void UsersJTABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersJTABLEMouseClicked
        // TODO add your handling code here:
        int selectedRow = this.getUsersJTABLE().getSelectedRow();
        
        String userPerfil = (String) this.getUsersJTABLE().getValueAt(selectedRow, 1);
        
        this.selectedLabel.setText(userPerfil);
    }//GEN-LAST:event_UsersJTABLEMouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        int selectedRow = this.getUsersJTABLE().getSelectedRow();
        
        String userPerfil = (String) this.getUsersJTABLE().getValueAt(selectedRow, 1);
        
        controller.excluirUser(userPerfil, (DefaultTableModel) this.getUsersJTABLE().getModel());
    }//GEN-LAST:event_jButton8MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Descricaotxt;
    private javax.swing.JTable UsersJTABLE;
    private javax.swing.JComboBox<String> VisibilidadeJBox;
    private javax.swing.JComboBox<String> avatarBox;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JToggleButton buscarBtn;
    private javax.swing.JTextField buscarSearchTxt;
    private javax.swing.JButton editarBTN;
    private javax.swing.JLabel iconeProfileLBL;
    private javax.swing.JComboBox<String> isPhotoPerfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JButton limparUserInstagramBTN;
    private javax.swing.JButton limparUserInstagramBTN1;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlOpcaoCadastro;
    private javax.swing.JButton salvarUserInstagramBTN;
    private javax.swing.JButton salvarUserInstagramBTN1;
    private javax.swing.JLabel selectedLabel;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    private javax.swing.JFormattedTextField txtformBirthDate;
    private javax.swing.JTextField userInstagramTxt;
    // End of variables declaration//GEN-END:variables

    public JFormattedTextField getTxtDate() {
        return txtformBirthDate;
    }

    public void setTxtDate(JFormattedTextField txtDate) {
        this.txtformBirthDate = txtDate;
    }

    public JTextField getTxtUser() {
        return txtUser;
    }

    public void setTxtUser(JTextField txtUser) {
        this.txtUser = txtUser;
    }

    public JTextField getUserInstagramTxt() {
        return userInstagramTxt;
    }

    public void setUserInstagramTxt(JTextField userInstagramTxt) {
        this.userInstagramTxt = userInstagramTxt;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public JTextField getTxtLastName() {
        return txtLastName;
    }

    public void setTxtLastName(JTextField txtLastName) {
        this.txtLastName = txtLastName;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public void setTxtName(JTextField txtName) {
        this.txtName = txtName;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JPasswordField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JFormattedTextField getTxtformBirthDate() {
        return txtformBirthDate;
    }

    public void setTxtformBirthDate(JFormattedTextField txtformBirthDate) {
        this.txtformBirthDate = txtformBirthDate;
    }

    public JTextArea getDescricaotxt() {
        return Descricaotxt;
    }

    public void setDescricaotxt(JTextArea Descricaotxt) {
        this.Descricaotxt = Descricaotxt;
    }

    public JComboBox<String> getVisibilidadeJBox() {
        return VisibilidadeJBox;
    }

    public void setVisibilidadeJBox(JComboBox<String> VisibilidadeJBox) {
        this.VisibilidadeJBox = VisibilidadeJBox;
    }

    public JComboBox<String> getAvatarBox() {
        return avatarBox;
    }

    public void setAvatarBox(JComboBox<String> avatarBox) {
        this.avatarBox = avatarBox;
    }

    public JComboBox<String> getIsPhotoPerfil() {
        return isPhotoPerfil;
    }

    public void setIsPhotoPerfil(JComboBox<String> isPhotoPerfil) {
        this.isPhotoPerfil = isPhotoPerfil;
    }

    public JButton getSalvarUserInstagramBTN() {
        return salvarUserInstagramBTN;
    }

    public void setSalvarUserInstagramBTN(JButton salvarUserInstagramBTN) {
        this.salvarUserInstagramBTN = salvarUserInstagramBTN;
    }

    public JTable getUsersJTABLE() {
        return UsersJTABLE;
    }

    public void setUsersJTABLE(JTable UsersJTABLE) {
        this.UsersJTABLE = UsersJTABLE;
    }
    
}