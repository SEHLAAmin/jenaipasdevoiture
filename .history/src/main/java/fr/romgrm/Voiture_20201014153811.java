package fr.romgrm;

// CREATE CLASS
public class Voiture {
    // CREATE FIELDS / PROPRIETES
   String marque; 
   String color; 
   int niveauEssence;
   boolean reservoirVide; 
   boolean reservee; 

   // CREATE CONSTRUCTOR
   public Voiture(String marque, String color){
        this.color = color;
        this.marque = marque; 
   }

   // RETURN INSTANCES 
   public String getChaine(){
       return "marque : " + this.marque + " " + "color : "+ this.color; 
   }
}
