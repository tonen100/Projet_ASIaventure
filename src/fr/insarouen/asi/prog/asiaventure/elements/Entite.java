package fr.insarouen.asi.prog.asiaventure.elements;

import fr.insarouen.asi.prog.asiaventure.Monde;
import java.util.Collection;

/**
  * Entite est la classe représentant une entité.
  * <p>
  * Une entité est caractérisée par :
  * <ul>
  * <li> Un nom </li>
  * <li> Un monde. </li>
  * </ul>
  * </p>
  * @author Antoine Questel et Pierre-François Giraud
  * @version 1.0
  */


public class  Entite {
/**
    * Le monde de l'entité.
    * @see Monde
    * @see Entite#getMonde()
    */

  private Monde monde;
 /**
    * Le nom de l'entité.
    * @see Entite#getNom()
    */

  private String nom;

 // constructeurs

  /**
    * Constructeur Entite, crée une nouvelle instance de Entite.
    * <p>
    * À la construction d'une entité, le nom est fixée à nom et le monde est fixé à monde.
    * Il est nécessaire d'ajouter cette entité au monde associé.
    * </p>
    *
    * @param nom Le nom de l'entité
    * @param monde Le monde de l'entité
    *
    * @see Entite#nom
    * @see Entite#monde
    *
    * @throws NomDEntiteDejaUtiliseDansLeMondeException S'il existe déjà une Entite portant le même nom que celle que l'on veut ajouter dans le Monde.
    */

  public Entite(String nom, Monde monde){
    this.nom = nom;
    this.monde = monde;
    this.monde.ajouter(this);
  }


  // methodes

  /**
    * Retourne le nom de l'entité.
    *
    * @return Le nom de l'entité.
    *
    * @see Entite#nom
    */

  public String getNom(){
    return this.nom;
  }

 /**
    * Retourne le monde de l'entité.
    *
    * @return Le monde de l'entité.
    *
    * @see Entite#monde
    */

  public Monde getMonde(){
    return this.monde;
  }

  /**
    * Retourne si un objet et une entité sont identiques.
    *
    * @return si un objet et une entité sont identiques sous forme de booléen.
    */

  public boolean equals(Object o){
    if (this == o){
      return true;
    }
    else if (o == null || this.getClass() != o.getClass()){
      return false;
    }
    else{
      return this.nom.equals(((Entite)o).nom) && this.monde == ((Entite)o).monde;
    }
  }


  /**
    * Retourne le hashCode d'une entité.
    *
    * @return le hashCode d'une entité sous forme d'entier.
    */

  public int hashCode(){
    return 2 * this.monde.hashCode() + 3 * this.nom.hashCode();
  }

  public String toString(){
    return this.nom + " du monde " + this.monde.getNom();
  }
}
