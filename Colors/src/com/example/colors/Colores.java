package com.example.colors;

import java.util.ArrayList;

public class Colores{
	
    public ArrayList<ColoresDefinicion> agregar(ArrayList<ColoresDefinicion> colors)
    {
            colors.add(new ColoresDefinicion("negro",15,15,15));
            colors.add(new ColoresDefinicion("azul",0,0,230));
            colors.add(new ColoresDefinicion("Verde",0,230,0));
            colors.add(new ColoresDefinicion("azul marino",25,25,143));
            colors.add(new ColoresDefinicion("Morado",120,35,150));
            colors.add(new ColoresDefinicion("Verde Oliva",107,142,35));
            colors.add(new ColoresDefinicion("Verde Oscuro",40,60,40));
            colors.add(new ColoresDefinicion("Verde Lima",127,255,0));
            colors.add(new ColoresDefinicion("Gris Oscuro",120,120,120));
            colors.add(new ColoresDefinicion("Marron",150,75,0));
            colors.add(new ColoresDefinicion("Aguamarina",159,213,209));
            colors.add(new ColoresDefinicion("Plateado",192,192,192));
            colors.add(new ColoresDefinicion("Fucsia",253,62,170));
            colors.add(new ColoresDefinicion("Rojo",255,0,0));
            colors.add(new ColoresDefinicion("Amarillo",255,255,0));
            colors.add(new ColoresDefinicion("Blanco",255,255,255));
            colors.add(new ColoresDefinicion("Azul Cielo",0,255,255));
            colors.add(new ColoresDefinicion("Gris",210,210,210));
            colors.add(new ColoresDefinicion("Magenta",255,0,255));
            return colors;
    }
    
    public String encontrarColor(ArrayList<ColoresDefinicion> colors,int r,int g, int b)
    {   
        int sumargb=2000,elegido=0;
        for (int i=0;i<colors.size();i++) {
            int suma;
            suma=(r+g+b)-(colors.get(i).R+colors.get(i).G+colors.get(i).B);  
            if(colors.get(i).R<=r+30 && colors.get(i).G <= g+30 && colors.get(i).B<=b+30)
                    if(suma<sumargb)
                    {
                        sumargb=suma;                     
                        elegido=i;
                    }
            
        }
       
    return colors.get(elegido).nombre;
    } 
}
