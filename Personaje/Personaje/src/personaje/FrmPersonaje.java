
//https://htmlcolorcodes.com/es/nombres-de-los-colores/   pagina donde se pueden ver todos los códigos de colores

//Se utilizan las flechas y la barra espaciadora para mover el personaje



package personaje;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


 
public class FrmPersonaje extends javax.swing.JFrame implements KeyListener {
    
    int filas,columnas;
    int escala=4;
    int velocidad=6;
    int iniciox=200;
    int inicioy=200;
    int trans=1;
    int con=3;

    
    
    //Paleta RGB en google, jeden Nummer hängt von der Color an, es gibt verschiedene Nümmer für jeden color
    public static int x = new Color (0,0,0).getRGB(); // color negro // color amarillo: (255,255,0) //negro (0,0,0) // azul (176,196,222) // blanco (255x3)
    public static int a = new Color(255,228,181).getRGB(); // color piel // piel clara(255,228,181) //color steven (160,82,45)
    public static int d = new Color(255,255,255).getRGB(); // color blanco ojos
    public static int o = new Color(255,255,255).getRGB(); // color del fondo 
    public static int c = new Color(255,165,0).getRGB(); // color naranja ropa
    public static int b = new Color(0,0,205).getRGB(); // color azul broches
    public static int p = new Color(0,0,0).getRGB(); // color pelo 
    public static int l = new Color(255,255,255).getRGB(); // color pelo contorno
    public static int n = new Color(0,0,0).getRGB(); // color ojos //celeste (64,224,208)
    public static int r = new Color(255,215,0).getRGB(); // color rayos dorado 
    public static int w = new Color(255,0,0).getRGB(); // color rojo (255,0,0)
    
    
    Timer temporizador = new Timer(100, new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                repaint();
            }
        });
    
    
 
    
    public void keyTyped(KeyEvent e) {} //tecla de función son las f
    public void keyReleased(KeyEvent e) {} //Cuando soltamos la tecla
    public void keyPressed(KeyEvent e){
        
        if (e.getKeyCode()==39) //derecha
       {
           iniciox+=velocidad;
           con=1;
           trans=1;
           p = new Color(255,255,0).getRGB();
           l = new Color(0,0,0).getRGB();
           n = new Color(64,224,208).getRGB();
       }
       else if (e.getKeyCode()==37) //Izquierda
       {
           iniciox-=velocidad;
           con=-1;
           trans=1;
           p = new Color(255,255,0).getRGB();
           l = new Color(0,0,0).getRGB();
           n = new Color(64,224,208).getRGB();
       }
        
        if (e.getKeyCode()==38)  //arriba
        {
            inicioy-=velocidad;
            con=2;
           p = new Color(255,255,0).getRGB();
           l = new Color(0,0,0).getRGB();
           n = new Color(64,224,208).getRGB();
        }
        else if (e.getKeyCode()==40) //abajo
        {
            inicioy+=velocidad;
            con=-2;
        }
        
        if (e.getKeyCode ()== 32)
        {
            con=3;
            p = new Color(0,0,0).getRGB(); // color pelo 
            l = new Color(255,255,255).getRGB(); // color pelo contorno
            n = new Color(0,0,0).getRGB();
            
        }
       
       
       System.out.println(e.getKeyCode());
        
    }
    

    

    public void paint(Graphics g)
    {
       
        int [][] gokuder={         {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,l,l,l,l,o,o,o,o,o,o,o,o,o,o}, 
                                   {o,o,o,o,o,o,o,o,o,o,o,o,o,l,l,l,p,p,p,l,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,o,l,l,l,p,p,p,p,l,l,l,l,l,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,l,l,p,p,p,p,p,l,l,p,p,p,p,l,o,o,o,o,o},
                                   {o,o,o,o,o,l,l,l,l,l,l,p,p,p,p,p,p,p,p,p,p,p,l,o,o,o,o,o,o},
                                   {o,o,o,o,o,l,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,l,l,l,o,o,o,o},
                                   {o,o,o,o,o,o,l,l,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,l,o,o,o},
                                   {o,o,o,l,l,l,l,l,l,p,p,p,p,a,p,p,a,p,p,a,p,p,p,p,l,o,o,o,o},
                                   {o,o,o,l,p,p,p,p,p,p,p,p,a,a,p,a,a,a,p,a,a,p,p,l,o,o,o,o,o},
                                   {o,o,o,o,l,l,p,p,a,a,p,a,a,a,d,d,d,a,d,d,p,p,l,o,o,o,o,o,o},
                                   {o,o,o,o,o,l,l,p,a,a,a,a,a,a,d,n,n,a,n,d,p,p,p,l,o,o,o,o,o},
                                   {o,o,o,o,l,p,p,p,p,p,a,a,a,d,d,n,n,a,n,d,p,p,p,p,l,o,o,o,o},
                                   {o,o,o,o,o,l,l,p,p,p,a,a,a,a,d,d,d,a,d,a,p,p,l,l,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,x,x,a,a,a,x,x,x,x,x,a,a,p,p,o,o,o,o,o,o,o}, // hasta aqui pelo
                                   {o,o,o,o,o,x,x,b,b,c,x,a,a,a,a,a,a,a,a,x,x,x,x,o,o,o,o,o,o},
                                   {o,o,o,o,o,x,a,b,b,c,c,x,x,x,x,x,x,x,x,b,a,a,x,o,o,o,o,o,o},
                                   {o,o,o,o,o,x,a,a,b,c,c,b,b,b,b,b,b,c,c,b,a,a,x,o,o,o,o,o,o},
                                   {o,o,o,o,x,a,a,a,a,a,x,c,c,b,b,b,b,c,c,a,a,a,a,x,o,o,o,o,o},
                                   {o,o,o,o,x,b,b,b,x,x,x,c,c,c,c,c,c,c,x,x,x,x,b,b,x,o,o,o,o},
                                   {o,o,o,o,x,a,a,a,x,x,x,c,c,c,c,c,c,c,x,x,a,a,a,a,x,o,o,o,o},
                                   {o,o,o,x,a,a,a,a,x,x,x,c,c,c,c,c,c,c,x,x,a,a,a,a,x,o,o,o,o},
                                   {o,o,o,x,a,a,a,x,o,o,x,b,b,b,b,b,b,b,x,o,x,a,a,a,x,o,o,o,o},
                                   {o,o,o,o,x,x,x,o,o,x,c,c,c,c,c,c,c,c,c,x,o,x,x,x,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,x,c,c,c,c,c,c,c,c,c,c,c,x,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,x,c,c,c,c,c,x,x,x,c,c,c,c,c,x,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,x,x,c,c,c,c,c,x,x,o,x,x,x,c,c,c,c,x,x,o,o,o,o,o},
                                   {o,o,o,o,x,b,b,b,b,b,x,x,x,o,o,o,x,x,b,b,b,b,b,b,x,o,o,o,o},
                                   {o,o,o,o,x,b,b,b,b,b,x,o,o,o,o,o,o,x,b,b,b,b,b,b,x,o,o,o,o},
                                   {o,o,o,o,x,x,x,x,x,x,x,o,o,o,o,o,o,x,x,x,x,x,x,x,x,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},};
        
        int [][] gokucam={         {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,l,l,l,l,o,o,o,o,o,o,o,o,o,o}, 
                                   {o,o,o,o,o,o,o,o,o,o,o,o,o,l,l,l,p,p,p,l,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,o,l,l,l,p,p,p,p,l,l,l,l,l,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,l,l,p,p,p,p,p,l,l,p,p,p,p,l,o,o,o,o,o},
                                   {o,o,o,o,o,l,l,l,l,l,l,p,p,p,p,p,p,p,p,p,p,p,l,o,o,o,o,o,o},
                                   {o,o,o,o,o,l,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,l,l,l,o,o,o,o},
                                   {o,o,o,o,o,o,l,l,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,l,o,o,o},
                                   {o,o,o,l,l,l,l,l,l,p,p,p,p,a,p,p,a,p,p,a,p,p,p,p,l,o,o,o,o},
                                   {o,o,o,l,p,p,p,p,p,p,p,p,a,a,p,a,a,a,p,a,a,p,p,l,o,o,o,o,o},
                                   {o,o,o,o,l,l,p,p,a,a,p,a,a,a,d,d,d,a,d,d,p,p,l,o,o,o,o,o,o},
                                   {o,o,o,o,o,l,l,p,a,a,a,a,a,a,d,n,n,a,n,d,p,p,p,l,o,o,o,o,o},
                                   {o,o,o,o,l,p,p,p,p,p,a,a,a,d,d,n,n,a,n,d,p,p,p,p,l,o,o,o,o},
                                   {o,o,o,o,o,l,l,p,p,p,a,a,a,a,d,d,d,a,d,a,p,p,l,l,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,x,x,a,a,a,x,x,x,x,x,a,a,p,p,o,o,o,o,o,o,o}, // hasta aqui pelo
                                   {o,o,o,o,o,x,x,b,b,c,x,a,a,a,a,a,a,a,a,x,x,x,x,o,o,o,o,o,o},
                                   {o,o,o,o,o,x,a,b,b,c,c,x,x,x,x,x,x,x,x,b,a,a,x,o,o,o,o,o,o},
                                   {o,o,o,o,o,x,a,a,b,c,c,b,b,b,b,b,b,c,c,x,a,a,x,o,o,o,o,o,o},
                                   {o,o,o,o,o,x,a,a,a,a,a,b,a,a,x,b,b,c,c,x,a,a,x,x,o,o,o,o,o},
                                   {o,o,o,o,o,o,x,a,a,a,a,b,a,a,x,c,c,c,x,a,a,a,x,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,x,a,a,a,b,a,a,x,c,c,c,x,a,a,a,x,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,x,x,x,x,x,x,x,c,c,c,x,a,a,x,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,x,b,b,b,b,b,b,b,x,x,x,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,x,c,c,c,c,c,c,c,c,c,x,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,x,c,c,c,c,c,c,c,c,c,c,c,x,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,x,c,c,c,c,c,x,x,x,c,c,c,c,c,x,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,x,x,c,c,c,c,c,x,x,o,x,x,x,c,c,c,c,x,x,o,o,o,o,o},
                                   {o,o,o,o,x,b,b,b,b,b,x,x,x,o,o,o,x,x,b,b,b,b,b,b,x,o,o,o,o},
                                   {o,o,o,o,x,b,b,b,b,b,x,o,o,o,o,o,o,x,b,b,b,b,b,b,x,o,o,o,o},
                                   {o,o,o,o,x,x,x,x,x,x,x,o,o,o,o,o,o,x,x,x,x,x,x,x,x,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},};
        
        
        int [][] gokuarriba= {     {o,o,o,o,o,l,l,l,l,l,o,o,o,l,l,l,o,o,l,l,l,l,o,o,o,o,o,o,o}, 
                                   {o,o,o,o,o,l,p,p,p,p,l,l,o,l,p,p,o,o,l,p,p,p,l,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,l,l,p,p,p,p,l,p,p,l,l,l,p,p,p,l,l,l,o,o,o,o,o},
                                   {o,o,o,o,l,l,l,l,l,p,p,p,p,p,p,l,p,p,p,p,l,l,p,p,l,o,o,o,o},
                                   {o,o,o,l,p,p,p,p,l,p,p,p,p,p,p,p,p,p,p,p,l,p,p,p,l,o,o,o,o},
                                   {o,o,o,o,l,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,l,o,o,o,o,o},
                                   {o,o,o,o,o,l,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,l,o,o,o},
                                   {o,o,o,o,o,o,l,p,p,p,p,p,p,a,p,p,a,p,p,a,p,p,p,p,l,o,o,r,o},
                                   {o,o,o,o,l,p,p,p,p,p,p,p,a,a,p,a,a,a,p,a,a,p,p,l,o,o,r,r,o},
                                   {o,o,o,l,p,p,p,p,a,a,p,n,n,n,a,a,n,n,n,a,p,p,l,o,o,r,r,o,o},
                                   {o,o,o,o,o,l,l,p,a,a,a,n,n,n,a,a,n,n,n,a,p,p,p,l,o,r,o,o,o},
                                   {o,o,o,o,l,p,p,p,p,p,a,d,d,d,a,a,d,d,d,a,p,p,p,p,l,o,o,o,o},
                                   {o,o,o,r,o,l,l,p,p,p,a,d,d,d,a,a,d,d,d,a,p,p,l,l,o,o,o,o,o},
                                   {o,o,r,n,o,o,o,o,x,x,a,a,a,x,x,x,a,a,a,a,p,p,l,o,o,o,o,o,o}, // hasta aqui pelo
                                   {o,r,r,n,o,x,x,b,b,c,x,a,a,a,a,a,a,a,a,x,x,x,x,o,r,o,o,o,o},
                                   {o,r,n,r,o,x,a,b,b,c,c,x,x,x,x,x,x,x,x,b,a,a,x,o,r,r,o,o,o},
                                   {r,r,r,r,o,x,a,a,b,c,c,b,b,b,b,b,b,c,c,b,a,a,x,o,n,r,r,o,o},
                                   {o,n,r,n,o,x,a,a,a,a,x,c,c,b,b,b,b,c,c,a,a,a,a,x,o,n,r,r,o},
                                   {o,r,n,o,o,x,b,b,x,x,x,c,c,c,c,c,c,c,x,x,x,x,b,x,o,o,n,n,o},
                                   {n,n,o,o,o,x,a,a,a,x,x,c,c,c,c,c,c,c,x,x,a,a,a,x,o,o,o,o,o},
                                   {o,o,o,o,o,x,a,a,a,x,x,c,c,c,c,c,c,c,x,x,a,a,a,x,o,o,o,o,o},
                                   {o,o,o,o,o,x,a,a,a,x,x,b,b,b,b,b,b,b,x,x,a,a,a,x,o,o,o,o,o},
                                   {o,o,o,o,o,x,x,x,x,x,x,c,c,c,c,c,c,c,x,x,x,x,x,x,o,o,o,o,o},
                                   {o,o,o,o,o,w,w,w,w,w,x,c,c,c,c,c,c,c,x,w,w,w,w,w,o,o,o,o,o},
                                   {o,o,r,o,o,p,w,w,w,p,x,c,c,c,x,c,c,c,x,p,w,w,w,p,o,o,o,o,o},
                                   {o,o,n,r,o,o,p,p,p,o,x,c,c,c,x,c,c,c,x,o,p,p,p,o,o,o,o,o,o},
                                   {o,o,n,r,r,o,o,p,o,o,x,b,b,b,x,b,b,b,x,o,o,p,o,o,o,n,n,o,o},
                                   {o,o,o,n,r,r,o,o,o,o,x,b,b,b,x,b,b,b,x,o,o,o,o,o,r,r,n,o,o},
                                   {o,o,o,o,n,r,o,o,o,o,x,x,x,x,x,x,x,x,x,o,o,o,o,r,r,n,o,o,o},
                                   {o,o,o,o,o,n,n,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,r,r,n,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,r,n,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,n,n,o,o,o,o,o,o},};
        
        
        
        int [][] gokuparado= {     {o,o,o,o,o,o,o,l,l,l,o,o,o,l,l,l,o,o,o,o,o,o,o,o,o,o,o,o,o}, 
                                   {o,o,o,o,o,o,o,l,p,p,l,l,o,l,p,p,o,o,l,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,l,l,p,p,p,p,l,p,p,l,l,l,p,l,o,o,o,l,o,o,o,o,o},
                                   {o,o,o,o,l,l,o,o,o,p,p,p,p,p,p,l,p,p,p,l,o,l,p,p,l,o,o,o,o},
                                   {o,o,o,l,p,p,p,l,o,p,p,p,p,p,p,p,p,p,p,l,l,p,p,p,l,o,o,o,o},
                                   {o,o,o,o,l,p,p,p,l,p,p,p,p,p,p,p,p,p,p,p,p,p,p,l,o,o,o,o,o},
                                   {o,o,o,o,o,l,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,l,o,o,o},
                                   {o,o,o,o,o,o,l,p,p,p,p,p,p,a,p,p,a,p,p,a,p,p,p,p,l,o,o,o,o},
                                   {o,o,o,o,l,p,p,p,p,a,p,p,a,a,p,a,a,a,p,a,p,p,p,l,o,o,o,o,o},
                                   {o,o,o,l,p,p,p,p,a,a,a,n,n,n,a,a,n,n,n,a,p,p,l,o,o,o,o,o,o},
                                   {o,o,o,o,o,l,l,p,a,a,a,n,n,n,a,a,n,n,n,a,p,p,p,l,o,o,o,o,o},
                                   {o,o,o,o,l,p,p,p,p,a,a,d,d,d,a,a,d,d,d,a,a,p,p,l,o,o,o,o,o},
                                   {o,o,o,o,o,l,l,p,p,a,a,d,d,d,a,a,d,d,d,a,p,p,l,l,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,p,p,x,a,a,a,x,x,x,a,a,a,a,p,p,l,o,o,o,o,o,o}, // hasta aqui pelo
                                   {o,o,o,o,o,x,x,b,b,c,x,a,a,a,a,a,a,a,a,x,x,x,x,o,o,o,o,o,o},
                                   {a,b,a,a,a,x,a,b,b,c,c,x,x,x,x,x,x,x,x,b,a,a,x,a,a,b,a,o,o},
                                   {a,b,a,a,a,x,a,a,b,c,c,b,b,b,b,b,b,c,c,b,a,a,x,a,a,b,a,o,o},
                                   {a,b,a,a,a,x,a,a,a,a,x,c,c,b,b,b,b,c,c,a,a,a,x,a,a,b,a,o,o},
                                   {o,o,o,o,o,o,o,o,x,x,x,c,c,c,c,c,c,c,x,x,x,x,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,x,x,c,c,c,c,c,c,c,x,x,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,x,x,c,c,c,c,c,c,c,x,x,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,x,x,b,b,b,b,b,b,b,x,x,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,x,x,c,c,c,c,c,c,c,x,x,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,x,c,c,c,c,c,c,c,x,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,x,c,c,c,x,c,c,c,x,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,x,c,c,c,x,c,c,c,x,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,x,b,b,b,x,b,b,b,x,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,x,b,b,b,x,b,b,b,x,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,x,x,x,x,x,x,x,x,x,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},
                                   {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},};
        
        
        super.paint(g);
        
        if (con==1)
        {
            if (trans==1)
            {
            
            for(filas=0;filas<29*escala;filas++) // ese por cuatro le puse para: escalar la imagen, aqui por 4

            {
                for(columnas=0;columnas<26*escala;columnas++)
            
                {
                    g.setColor(new Color(gokuder[filas/escala][columnas/escala]));   //y aqui dividimos para 4, para seguir la escala
                    g.drawRect(iniciox+columnas,inicioy+filas,1,1);  //Cuando resto el 200 de columnas ahi sale alrevez la imagen
                    trans=-1;
               
                }
            }
            }
            
            if (trans==-1)
            {
                for(filas=0;filas<29*escala;filas++) // ese por cuatro le puse para: escalar la imagen, aqui por 4

            {
                for(columnas=0;columnas<26*escala;columnas++)
            
                {
                    g.setColor(new Color(gokucam[filas/escala][columnas/escala]));   
                    g.drawRect(iniciox+columnas,inicioy+filas,1,1);
                    trans=-1;
                }
            }
            }
        }
        
        if (con==-1)
        {
            if (trans==1)
            {
            
            for(filas=0;filas<29*escala;filas++) // ese por cuatro le puse para: escalar la imagen, aqui por 4

            {
                for(columnas=0;columnas<26*escala;columnas++)
            
                {
                    g.setColor(new Color(gokuder[filas/escala][columnas/escala]));   //y aqui dividimos para 4, para seguir la escala
                    g.drawRect(iniciox-columnas,inicioy+filas,1,1);  //Cuando resto el 200 de columnas ahi sale alrevez la imagen
                    trans=-1;
               
                }
            }
            }
            
            if (trans==-1)
            {
                for(filas=0;filas<29*escala;filas++) // ese por cuatro le puse para: escalar la imagen, aqui por 4

            {
                for(columnas=0;columnas<26*escala;columnas++)
            
                {
                    g.setColor(new Color(gokucam[filas/escala][columnas/escala]));   
                    g.drawRect(iniciox-columnas,inicioy+filas,1,1);
                    trans=-1;
                }
            }
            }
        }
        
        if (con==2)
        {
            for(filas=0;filas<29*escala;filas++) 
            {
                for(columnas=0;columnas<26*escala;columnas++)
                {             
                    g.setColor(new Color(gokuarriba[filas/escala][columnas/escala])); 
                    g.drawRect(iniciox+columnas,inicioy+filas,1,1);                   
                }
            }    
        }
        
        if (con==-2)
        {
            for(filas=0;filas<29*escala;filas++) 
            {
                for(columnas=0;columnas<26*escala;columnas++)
                {             
                    g.setColor(new Color(gokuarriba[filas/escala][columnas/escala])); 
                    g.drawRect(iniciox+columnas,inicioy-filas,1,1);  
                    
                }
            }    
        }
        
        if (con==3)
        {
            for(filas=0;filas<29*escala;filas++) 
            {
                for(columnas=0;columnas<26*escala;columnas++)
                {             
                    g.setColor(new Color(gokuparado[filas/escala][columnas/escala])); 
                    g.drawRect(iniciox+columnas,inicioy+filas,1,1);  
                    
                }
            } 
        }
        
        
        
    }

    
    
    
    
    public FrmPersonaje() {
        
        
        
        initComponents();
        addKeyListener(this);
        this.getContentPane().setBackground(Color.white);
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        temporizador.start();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPersonaje().setVisible(true);
            }
        });
    }

//    @Override
//    public void keyTyped(KeyEvent ke) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void keyPressed(KeyEvent ke) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void keyReleased(KeyEvent ke) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
