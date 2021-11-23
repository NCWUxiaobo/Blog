String name=jTextField1.getText(),pswd=jPasswordField1.getText();
        jButton2.setEnabled(false);
        if(jComboBox1.getSelectedIndex()==0){
        if(new AdminDao().login(name,pswd)!=null){
        dispose();
        people.s_adm=new Admin(name,pswd);
        ui_admin a=new ui_admin();
        a.setVisible(true);
        }
        else
        JOptionPane.showMessageDialog(null,"用户名或密码错误","亲爱的用户",JOptionPane.INFORMATION_MESSAGE);
        }else if(jComboBox1.getSelectedIndex()==1){
        if(new TeacherDao().login(name,pswd)!=null){
        dispose();
        people.s_tea=new TeacherDao().findOne(name);
        ui_teacher t=new ui_teacher();
        t.setVisible(true);
        }else
        JOptionPane.showMessageDialog(null,"用户名或密码错误","亲爱的用户",JOptionPane.INFORMATION_MESSAGE);
        }else if(jComboBox1.getSelectedIndex()==2){
        if(new StudentDao().login(name,pswd)!=null){
        dispose();
        people.s_stu=new StudentDao().findOne(name);
        ui_student s=new ui_student();
        s.setVisible(true);
        }else
        JOptionPane.showMessageDialog(null,"用户名或密码错误","亲爱的用户",JOptionPane.INFORMATION_MESSAGE);
        }
