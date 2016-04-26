/**
 * @(#)totito.java
 *
 *
 * @author 
 * @version 1.00 2009/4/23
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import javax.swing.JOptionPane;  






public class totito {
		JFrame marco =new JFrame();
		JFrame marcoPrincipal =new JFrame();
		JPanel tablero = new JPanel();
		JPanel principal = new JPanel();
		GridLayout grid = new GridLayout(3,3, 5,5);
		GridLayout gridPrincipal = new GridLayout(1,1, 5,5);
		String play1 = "Jugador1"; boolean turno1 = false;
		String play2 = "Jugador2"; boolean turno2 = true; int cont = 0;
		// botones de las casillas
		JButton boton1 =new JButton();
		JButton boton2 =new JButton(); 
		JButton boton3 =new JButton(); 
		JButton boton4 =new JButton(); 
		JButton boton5 =new JButton(); 
		JButton boton6 =new JButton(); 
		JButton boton7 =new JButton(); 
		JButton boton8 =new JButton(); 
		JButton boton9 =new JButton();
                
	
		
		
		public totito(){
			
			
			principal.setLayout(gridPrincipal);
                        

			marcoPrincipal.getContentPane().add(principal);
			marcoPrincipal.setBounds(100,100,200,200);
			marcoPrincipal.setVisible(true);
			
                        JButton buttonP = new JButton("Play");
			buttonP.setPreferredSize(new Dimension(75,75));
                        
                        principal.add(buttonP);
			
			// pedimos los nombres de los jugadores
			try{
			play1 = JOptionPane.showInputDialog("Ingrese su nombre Jugador 1");
			} catch(Exception e){System.out.println("no ingrese nombre");}
			try{
			play2 = JOptionPane.showInputDialog("Ingrese su nombre Jugador 2");
			} catch(Exception e){System.out.println("no ingrese nombre");}
			
			
			// para hacer funcionar el boton al presionarlo, 
			buttonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonPMousePressed(evt); // metodo que funciona al presionar el boton
            }
        	});
        	

                        
			marcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	}
		
		
		
		public void CrearTablero(){
			marcoPrincipal.setVisible(false);	
			tablero.setLayout(grid);
			marco.getContentPane().add(tablero);
			marco.setBounds(0,0,300,200);
			marco.setVisible(true);
			marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.DarEventoTablero();
			tablero.add(boton1); tablero.add(boton2);
			tablero.add(boton3); tablero.add(boton4);
			tablero.add(boton5); tablero.add(boton6);
			tablero.add(boton7); tablero.add(boton8);
			tablero.add(boton9);
		}
		
		public void DarEventoTablero(){ // Funcion que le asigna eventos al tablero al presionarlos
			boton1.addMouseListener(new java.awt.event.MouseAdapter() {public void mousePressed(java.awt.event.MouseEvent evt) {
                MarcaXO(evt,boton1);
            }});
            boton2.addMouseListener(new java.awt.event.MouseAdapter() {public void mousePressed(java.awt.event.MouseEvent evt) {
                MarcaXO(evt,boton2);
            }});
            boton3.addMouseListener(new java.awt.event.MouseAdapter() {public void mousePressed(java.awt.event.MouseEvent evt) {
                MarcaXO(evt,boton3);
            }});
            boton4.addMouseListener(new java.awt.event.MouseAdapter() {public void mousePressed(java.awt.event.MouseEvent evt) {
                MarcaXO(evt,boton4);
            }});
            boton5.addMouseListener(new java.awt.event.MouseAdapter() {public void mousePressed(java.awt.event.MouseEvent evt) {
                MarcaXO(evt,boton5);
            }});
            boton6.addMouseListener(new java.awt.event.MouseAdapter() {public void mousePressed(java.awt.event.MouseEvent evt) {
                MarcaXO(evt,boton6);
            }});
            boton7.addMouseListener(new java.awt.event.MouseAdapter() {public void mousePressed(java.awt.event.MouseEvent evt) {
                MarcaXO(evt,boton7);
            }});
            boton8.addMouseListener(new java.awt.event.MouseAdapter() {public void mousePressed(java.awt.event.MouseEvent evt) {
                MarcaXO(evt,boton8);
            }});
            boton9.addMouseListener(new java.awt.event.MouseAdapter() {public void mousePressed(java.awt.event.MouseEvent evt) {
                MarcaXO(evt,boton9);
            }});
		}
			
		
		 private void buttonPMousePressed(java.awt.event.MouseEvent evt) {
			
			  	marcoPrincipal.setVisible(false);
			  	this.CrearTablero();
		  }
		  
		  
		  // metodo marca las casillas
		  private void MarcaXO (java.awt.event.MouseEvent evt,JButton boton){
		  		System.out.println(boton.getText());
		  		if (!(boton.getText().trim().equals("O")) && !(boton.getText().trim().equals("X"))) {
		  			if (turno1 == false){
		  				turno1 =true; turno2 =false;
		  				boton.setLabel("X");

		  				cont++;
		  				VerTotitoJug1();
		  			}
		  			else {
		 		  		turno1 = false; turno2= true;
		  				boton.setLabel("O");
		  				cont++;
		  				VerTotitoJug2();
		  			}
		 		}
		  		
		}
		
		// verifica si ganar jugador 1
		public void VerTotitoJug1(){
			if(boton1.getText().equals("X")&& boton2.getText().equals("X")&& boton3.getText().equals("X")){
				System.out.println("Totito Jugador1-1"); JOptionPane.showMessageDialog(null,"Gano " + play1); Limpiar();
			}
			else if(boton4.getText().equals("X")&& boton5.getText().equals("X")&& boton6.getText().equals("X")){
				System.out.println("Totito Jugador1-2"); JOptionPane.showMessageDialog(null,"Gano " + play1); Limpiar();
			}
			else if(boton7.getText().equals("X")&& boton8.getText().equals("X")&& boton9.getText().equals("X")){
				System.out.println("Totito Jugador1-3"); JOptionPane.showMessageDialog(null,"Gano " + play1); Limpiar();
			}
			else if(boton1.getText().equals("X")&& boton4.getText().equals("X")&& boton7.getText().equals("X")){
				System.out.println("Totito Jugador1-4"); JOptionPane.showMessageDialog(null,"Gano " + play1); Limpiar();
			}
			else if(boton2.getText().equals("X")&& boton5.getText().equals("X")&& boton8.getText().equals("X")){
				System.out.println("Totito Jugador1-5"); JOptionPane.showMessageDialog(null,"Gano " + play1); Limpiar();
			}
			else if(boton3.getText().equals("X")&& boton6.getText().equals("X")&& boton9.getText().equals("X")){
				System.out.println("Totito Jugador1-6"); JOptionPane.showMessageDialog(null,"Gano " + play1); Limpiar();
			}
			else if(boton1.getText().equals("X")&& boton5.getText().equals("X")&& boton9.getText().equals("X")){
				System.out.println("Totito Jugador1-7"); JOptionPane.showMessageDialog(null,"Gano " + play1); Limpiar();
			}
			else if(boton3.getText().equals("X")&& boton5.getText().equals("X")&& boton7.getText().equals("X")){
				System.out.println("Totito Jugador1-8"); JOptionPane.showMessageDialog(null,"Gano " + play1); Limpiar();
			}
			else if (cont == 9){
				System.out.println("Juego Empatado-9"); JOptionPane.showMessageDialog(null,"Juego Empatado"); Limpiar();
			}
		}
		
		// verifica si ganar jugador 2
			public void VerTotitoJug2(){
			if(boton1.getText().equals("O")&& boton2.getText().equals("O")&& boton3.getText().equals("O")){
				System.out.println("Totito Jugador2-1"); JOptionPane.showMessageDialog(null,"Gano " + play2); Limpiar();
			}
			else if(boton4.getText().equals("O")&& boton5.getText().equals("O")&& boton6.getText().equals("O")){
				System.out.println("Totito Jugador2-2"); JOptionPane.showMessageDialog(null,"Gano " + play2); Limpiar();
			}
			else if(boton7.getText().equals("O")&& boton8.getText().equals("O")&& boton9.getText().equals("O")){
				System.out.println("Totito Jugador2-3"); JOptionPane.showMessageDialog(null,"Gano " + play2); Limpiar();
			}
			else if(boton1.getText().equals("O")&& boton4.getText().equals("O")&& boton7.getText().equals("O")){
				System.out.println("Totito Jugador2-4"); JOptionPane.showMessageDialog(null,"Gano " + play2); Limpiar();
			}
			else if(boton2.getText().equals("O")&& boton5.getText().equals("O")&& boton8.getText().equals("O")){
				System.out.println("Totito Jugador2-5"); JOptionPane.showMessageDialog(null,"Gano " + play2); Limpiar();
			}
			else if(boton3.getText().equals("O")&& boton6.getText().equals("O")&& boton9.getText().equals("O")){
				System.out.println("Totito Jugador2-6"); JOptionPane.showMessageDialog(null,"Gano " + play2); Limpiar();
			}
			else if(boton1.getText().equals("O")&& boton5.getText().equals("O")&& boton9.getText().equals("O")){
				System.out.println("Totito Jugador2-7"); JOptionPane.showMessageDialog(null,"Gano " + play2); Limpiar();
			}
			else if(boton3.getText().equals("O")&& boton5.getText().equals("O")&& boton7.getText().equals("O")){
				System.out.println("Totito Jugador2-8"); JOptionPane.showMessageDialog(null,"Gano " + play2); Limpiar();
			}
			else if (cont == 9){
				System.out.println("Juego Empatado-9"); JOptionPane.showMessageDialog(null,"Juego Empatado"); Limpiar();
			}
		}
		
		// Limpia el tablero al finalizar el juego
		public void Limpiar(){
			boton1.setLabel("");boton2.setLabel("");boton3.setLabel("");boton4.setLabel("");
			boton5.setLabel("");boton6.setLabel("");boton7.setLabel("");boton8.setLabel("");
			boton9.setLabel("");
			turno1 = false; turno2 = true; cont =0;
		}
		  
    	

		
        
        
	public static void main(String[] args){
    	totito a = new totito();
    	
    	
    }    
    

}