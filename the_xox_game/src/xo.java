

import java.util.Random;
import javax.swing.JOptionPane;
//bil oynaması birde bil oynatma büyük harf
public class xo extends javax.swing.JFrame {
String[] tik=new String[9];
String user="x";
String com="o";
int skoro=0, skorc=0;
int n=0,num=-1;
    public xo() {
        initComponents();
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
    }
    public void computer(){
       Random r=new Random();
       boolean durum=false;
       do{
        num=r.nextInt(9);  
        
       if(tik[num]=="x"){
           durum=false;
       }
       else if(tik[num]=="o"){
           durum=false;
       }
       else{
           durum=true;
            System.out.println(num+"random");
           tik[num]="o";
           n++;
           if(num == 0){
               xo1.setText(com);
               xo1.setEnabled(false);
           } 
           else if(num == 1){
               xo2.setText(com);
               xo2.setEnabled(false);
           }
           else if(num == 2){
               xo3.setText(com);
               xo3.setEnabled(false);
           }
           else if(num==3){
               xo4.setText(com);
               xo4.setEnabled(false);
           }
           else if(num==4){
               xo5.setText(com);
               xo5.setEnabled(false);
           }
           else if(num==5){
               xo6.setText(com);
               xo6.setEnabled(false);
           }
           else if(num==7){
               xo8.setText(com);
               xo8.setEnabled(false);
           }
           else if(num==8){
               xo9.setText(com);
               xo9.setEnabled(false);
           }
           else if(num==6){
               xo7.setText(com);
               xo7.setEnabled(false);
           }
          kontrol(); 
       }
       
       
       }while(durum==false);
      
       
    }

    public void kontrol(){
        if(n<10){
            if((xo1.getText()=="x"&&xo2.getText()=="x"&&xo3.getText()=="x")||(xo1.getText()=="x"&&xo4.getText()=="x"&&xo7.getText()=="x")
                ||(xo1.getText()=="x"&&xo5.getText()=="x"&&xo9.getText()=="x")||(xo2.getText()=="x"&&xo5.getText()=="x"&&xo8.getText()=="x")
                ||(xo3.getText()=="x"&&xo5.getText()=="x"&&xo7.getText()=="x")||(xo3.getText()=="x"&&xo6.getText()=="x"&&xo9.getText()=="x")
                ||(xo4.getText()=="x"&&xo5.getText()=="x"&&xo6.getText()=="x")||(xo7.getText()=="x"&&xo8.getText()=="x"&&xo9.getText()=="x")){
               
               JOptionPane.showMessageDialog(null, txt1.getText()+" Kazandı!");
               jPanel2.setVisible(false);   
               skoro++;
               oyun_skor.setText(String.valueOf(skoro)); 
               //oyun_skor.setText(skoro+"");//Otomatik olarak integer sayıyı Stringe çeviriyor işlemi 
              
               
               
            }
            else if ((xo1.getText()=="o"&&xo2.getText()=="o"&&xo3.getText()=="o")||(xo1.getText()=="o"&&xo4.getText()=="o"&&xo7.getText()=="o")
                ||(xo1.getText()=="o"&&xo5.getText()=="o"&&xo9.getText()=="o")||(xo2.getText()=="o"&&xo5.getText()=="o"&&xo8.getText()=="o")
                ||(xo3.getText()=="o"&&xo5.getText()=="o"&&xo7.getText()=="o")||(xo3.getText()=="o"&&xo6.getText()=="o"&&xo9.getText()=="o")
                ||(xo4.getText()=="o"&&xo5.getText()=="o"&&xo6.getText()=="o")||(xo7.getText()=="o"&&xo8.getText()=="o"&&xo9.getText()=="o")){
               
               JOptionPane.showMessageDialog(null,"Bilgisayar Kazandı!");
               jPanel2.setVisible(false);
               skorc++;
               bil_skor.setText(skorc+"");
             
               
             }
            else if(n==9){
                JOptionPane.showMessageDialog(null,"Berabere, hadi bir kez daha dene.");
                jPanel2.setVisible(false);
                
            }
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        xo4 = new javax.swing.JButton();
        xo1 = new javax.swing.JButton();
        xo3 = new javax.swing.JButton();
        xo5 = new javax.swing.JButton();
        xo6 = new javax.swing.JButton();
        xo7 = new javax.swing.JButton();
        xo8 = new javax.swing.JButton();
        xo9 = new javax.swing.JButton();
        xo2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        oyun_skor = new javax.swing.JLabel();
        bil_skor = new javax.swing.JLabel();
        jbtn_yeni = new javax.swing.JButton();
        jbtn_sıfır = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Oyuncu Bilgileri:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 165, -1));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Oyuncu Adı:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 34, 107, -1));

        txt1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(txt1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 30, 224, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Başla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 27, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("OYUN ALANI");

        xo4.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        xo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo4ActionPerformed(evt);
            }
        });

        xo1.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        xo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo1ActionPerformed(evt);
            }
        });

        xo3.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        xo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo3ActionPerformed(evt);
            }
        });

        xo5.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        xo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo5ActionPerformed(evt);
            }
        });

        xo6.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        xo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo6ActionPerformed(evt);
            }
        });

        xo7.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        xo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo7ActionPerformed(evt);
            }
        });

        xo8.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        xo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo8ActionPerformed(evt);
            }
        });

        xo9.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        xo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo9ActionPerformed(evt);
            }
        });

        xo2.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        xo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(xo1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xo2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xo3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(xo4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xo5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xo6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(xo7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xo8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xo9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(xo9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xo1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xo3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xo2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xo4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xo5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xo6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(xo7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xo8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 51));
        jLabel5.setText("DURUM");

        lblo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblo.setText("Oyuncu:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Bilgisayar:");

        oyun_skor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        oyun_skor.setText("0");

        bil_skor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bil_skor.setText("0");

        jbtn_yeni.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jbtn_yeni.setForeground(new java.awt.Color(255, 0, 0));
        jbtn_yeni.setText("Yeniden Oyna");
        jbtn_yeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_yeniActionPerformed(evt);
            }
        });

        jbtn_sıfır.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jbtn_sıfır.setForeground(new java.awt.Color(255, 0, 0));
        jbtn_sıfır.setText("Sıfırla");
        jbtn_sıfır.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_sıfırActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_yeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oyun_skor, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bil_skor, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jbtn_sıfır, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblo)
                    .addComponent(oyun_skor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(bil_skor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jbtn_yeni, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtn_sıfır, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       lblo.setText(txt1.getText()+" :");
       txt1.setEnabled(false);
       jPanel2.setVisible(true);
       jPanel3.setVisible(true);
       jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtn_yeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_yeniActionPerformed
       yenile();   
       jPanel2.setVisible(true);
    }//GEN-LAST:event_jbtn_yeniActionPerformed
    public void yenile(){
         xo1.setText("");
        xo2.setText("");
        xo3.setText("");
        xo4.setText("");
        xo5.setText("");
        xo6.setText("");
        xo7.setText("");
        xo8.setText("");
        xo9.setText("");
        xo1.setEnabled(true);
        xo2.setEnabled(true);
        xo3.setEnabled(true);
        xo4.setEnabled(true);
        xo5.setEnabled(true);
        xo6.setEnabled(true);
        xo7.setEnabled(true);
        xo8.setEnabled(true);
        xo9.setEnabled(true);
        n=0;
    }
    
    private void jbtn_sıfırActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_sıfırActionPerformed
        yenile();   
        oyun_skor.setText("0");
        bil_skor.setText("0");
        jButton1.setEnabled(true);
        txt1.setText("");
        txt1.setEnabled(true);
        jPanel2.setVisible(true);
        skoro=0;
        skorc=0;
        
    }//GEN-LAST:event_jbtn_sıfırActionPerformed

    private void xo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo9ActionPerformed
        xo9.setText(user);
        xo9.setEnabled(false);
        tik[8]="x";
        n++;
        kontrol();
        computer();

    }//GEN-LAST:event_xo9ActionPerformed

    private void xo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo8ActionPerformed
        xo8.setText(user);
        xo8.setEnabled(false);
        tik[7]="x";
        n++;
        kontrol();
        computer();

    }//GEN-LAST:event_xo8ActionPerformed

    private void xo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo7ActionPerformed
        xo7.setText(user);
        xo7.setEnabled(false);
        tik[6]="x";
        n++;
        kontrol();
        computer();

    }//GEN-LAST:event_xo7ActionPerformed

    private void xo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo6ActionPerformed
        xo6.setText(user);
        xo6.setEnabled(false);
        tik[5]="x";
        n++;
        kontrol();
        computer();

    }//GEN-LAST:event_xo6ActionPerformed

    private void xo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo5ActionPerformed
        xo5.setText(user);
        xo5.setEnabled(false);
        tik[4]="x";
        n++;
        kontrol();
        computer();

    }//GEN-LAST:event_xo5ActionPerformed

    private void xo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo3ActionPerformed
        xo3.setText(user);
        xo3.setEnabled(false);
        tik[2]="x";
        n++;
        kontrol();
        computer();

    }//GEN-LAST:event_xo3ActionPerformed

    private void xo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo1ActionPerformed
        xo1.setText(user);
        xo1.setEnabled(false);
        tik[0]="x";
        n++;
        kontrol();
        computer();

    }//GEN-LAST:event_xo1ActionPerformed

    private void xo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo4ActionPerformed
        xo4.setText(user);
        xo4.setEnabled(false);
        tik[3]="x";
        n++;
        kontrol();
        computer();

    }//GEN-LAST:event_xo4ActionPerformed

    private void xo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo2ActionPerformed
        xo2.setText(user);
        xo2.setEnabled(false);
        tik[1]="x";
        n++;
        kontrol();
        computer();
    }//GEN-LAST:event_xo2ActionPerformed

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
            java.util.logging.Logger.getLogger(xo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bil_skor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_sıfır;
    private javax.swing.JButton jbtn_yeni;
    private javax.swing.JLabel lblo;
    private javax.swing.JLabel oyun_skor;
    private javax.swing.JTextPane txt1;
    private javax.swing.JButton xo1;
    private javax.swing.JButton xo2;
    private javax.swing.JButton xo3;
    private javax.swing.JButton xo4;
    private javax.swing.JButton xo5;
    private javax.swing.JButton xo6;
    private javax.swing.JButton xo7;
    private javax.swing.JButton xo8;
    private javax.swing.JButton xo9;
    // End of variables declaration//GEN-END:variables
}
