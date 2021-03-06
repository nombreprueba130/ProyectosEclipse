package Fechas;

import java.util.Arrays;
import java.util.Iterator;

public class Fecha {
	private int dia;
	private int mes;
	private int ano;
	
	public Fecha(){
		this.dia=0;
		this.mes=0;
		this.ano=0;	
	}
	
	public Fecha(int dia,int mes,int a?o){
		this.dia=dia;
		this.mes=mes;
		this.ano=a?o;	
	}
	
	public void setDia(int dia) {
		this.dia=dia;
	}
	public void setMes(int mes) {
		this.mes=dia;
	}
	public void setAno(int ano) {
		this.ano=ano;
	}
	
	public int getDia() {
		return this.dia;
	}
	public int getMes() {
		return this.dia;
	}
	public int getAno() {
		return this.dia;
	}
	private boolean esBisiesto() {
		boolean resultado;
		if(this.ano%4==0) {
			resultado=true;
		}else resultado =false;
		return resultado;
	}
	public boolean fechaCorrecta() {
		boolean validaAno;
		boolean validaDia=false;
		boolean validaMes;
		boolean resultado;
		//Comprobando a?o
		if(this.ano>=0) {
			validaAno= true;
		}else validaAno = false;
		//Comproban si el mes es correcto
		switch(this.mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			validaMes=true;
			if((this.dia<=31) && (this.dia>=1)) {
				validaDia=true;
			}else validaDia=false;
			
		break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			validaMes=true;
			if((this.dia<=30) && (this.dia>=1)) {
				validaDia=true;
			}else validaDia=false;
			
		break;
		
		case 2:
			validaMes=true;
			if(esBisiesto()==true) {
				if((this.dia<=29) && (this.dia>=1)) {
					validaDia=true;
				}else validaDia=false;

			}else if((this.dia<=29) && (this.dia>=1)) {
					validaDia=true;
				}else validaDia=false;
		break;
		default:
			validaMes=false;
		break;	
		}
		
		if(validaAno==true && validaDia==true && validaMes==true) {
			System.out.println("\tLa fecha es correcta");
			resultado=true;
		}else { 
				resultado=false;
				if(validaAno==false) {
					System.out.println("El a?o es mala");
				}
				if(validaMes==false) {
					System.out.println("El mes es incorrecto");
				}
				if(validaDia==false) {
					System.out.println("El dia es incorrecto");
				}
		}
		return resultado;
	}
	public void diaSiguiente() {
		
		int fecha[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		if(esBisiesto()==true) {
			fecha[1]=29;
		}
		
		//Cambiar mes y dia en caso de que estos al final del mes
		if(fecha[this.mes-1]<this.dia) {
			dia++;
		}else if(fecha[this.mes-1]==this.dia) {//Se puede quitar el condicional pero lo dejamos para que se explique
				this.mes++;
				this.dia=1;
				if(this.mes>12) {
					this.mes=1;
					this.ano++;
				}
		}
			
	}
	/*
	public int fechaUnicoNumero() {
		String dia=Integer.toString(this.dia);
		String mes=Integer.toString(this.mes);
		String ano=Integer.toString(this.ano);
		if((mes.length()==1)) {
			mes="0"+mes;
		}
		if((ano.length()==1)) {
			ano="0"+ano;
		}
		
		String numeroString= dia+mes+ano;
		System.out.println(numeroString);
		int numero=Integer.parseInt(numeroString);
		return numero;
	}*/
	
	public String toString() {
		
		String cadena= Integer.toString(dia)+"-"+Integer.toString(mes)+"-"+Integer.toString(ano);
		return cadena;
	}
}
