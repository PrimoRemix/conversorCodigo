
package conversor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ventcon extends JFrame
{
    JPanel panel_principal;
    JPanel panel_botones;
    JTextField caja;
    
    JButton boton[];
    double op1=0,op2=0;
    String operacion="";
    boolean nueva=true;
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==boton[4])
        {
         
        }
    }

    public ventcon(){
        
        setTitle("conversor pesos a dolar");
        
        setSize(400,400);
        
        setResizable(false);
        
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        init();
        
        setVisible(true);
    }
    
    private void init()
    {
        
     panel_principal = new JPanel();
     panel_principal.setLayout(new BorderLayout());
     
     caja = new JTextField();
     panel_principal.add("North",caja);
     
     panel_botones = new JPanel();
     
     panel_botones.setLayout(new GridLayout(5,4,8,8));
     
     agregarBotones();
     
     panel_principal.add("Center",panel_botones);
    
     getContentPane().add(panel_principal);



    }

   
private void agregarBotones() {
        
        boton = new JButton[20];
        
        boton[0]=new JButton("CE");
        boton[1]=new JButton("=");
        boton[2]=new JButton("");
        boton[3]=new JButton("");
        boton[4]=new JButton("7");
        boton[5]=new JButton("8");
        boton[6]=new JButton("9");
        boton[7]=new JButton("");
        boton[8]=new JButton("4");
        boton[9]=new JButton("5");
        boton[10]=new JButton("6");
        boton[11]=new JButton("");
        boton[12]=new JButton("1");
        boton[13]=new JButton("2");
        boton[14]=new JButton("3");
        boton[15]=new JButton("");
        boton[16]=new JButton("0");
        boton[17]=new JButton(".");
        boton[18]=new JButton("");
        boton[19]=new JButton("");
        //AGREAMOS LOS BOTONES AL PANEL BOTONES
        for(int i=0;i<20;i++){
            panel_botones.add(boton[i]);
        }
         boton[4].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"7");
            }
        });
          boton[5].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"8");
            }
        });
        boton[6].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"9");
            }
        });
        boton[8].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"4");
            }
        });
        boton[9].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"5");
            }
        });
        boton[10].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"6");
            }
        });
        boton[12].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"1");
            }
        });
        boton[13].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"2");
            }
        });
        boton[14].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"3");
            }
        });
        boton[16].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"0");
            }
        });
        boton[17].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+".");
            }
        });
         boton[0].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                caja.setText("");
                op1=op2=0;
                operacion="";
            }
        });
         boton[1].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    
                    op1=Double.parseDouble(caja.getText());
                    operacion="division";
                    caja.setText(String.valueOf(op1/19.78));
                }catch(Exception error){}
            }
        });
    }
    

    
}
   
       

