package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import java.util.Map;

/**
  * Monde est la classe représentant un monde.
  * Un monde est caractérisé par :
  * <p>
  * <ul>
  * <li> Un nom </li>
  * <li> Un tableau d'entités. </li>
  * </ul>
  * </p>
  * @author Antoine Questel et Pierre-François Giraud
  * @version 1.0
  */

public class Monde {
/**
    * Le nom du monde.
    * @see Monde#getNom()
    */


  private String nom;
/**
    * Le tableau d'entités.
    * @see Entite
    * @see Monde#getEntite()
    */


  private Entite[] entites;


// constructeurs

/**
   * Constructeur Monde, crée une nouvelle instance de Monde.
   * <p>
   * À la construction d'un monde, le nom est fixé à nomDuMonde et le tableau entites est fixé à 0.
   *</p>
   *
   * @param  nomDuMonde
   * @see Monde#nom
   */

  public Monde(String nom){
    this.nom = nom;
    this.entites = new Entite[0];
  }


  // methodes

  /**
   * Ajoute une entité au tableau d'entités.
   *
   * @param entite L'entité à ajouter
   * @see  Entite
   *
   * @throws NomDEntiteDejaUtiliseDansLeMondeException S'il existe déjà une Entite portant le même nom que celle que l'on veut ajouter dans le Monde.
   * @throws EntiteDejaDansUnAutreMondeException Si l'Entite que l'on veut ajouter existe déjà dans un autre Monde.
   */


  public void ajouter(Entite entite){
    reallouertabEntites(entites.length + 1);
    entites[entites.length - 1] = entite;
  }

  private void reallouertabEntites(int newTaille){
    Entite[] entitesTemp = new Entite[newTaille];
    for(int i = 0; i < java.lang.Math.min(newTaille, entites.length); i ++)
    {
      entitesTemp[i] = entites[i];
    }
    entites = entitesTemp;
  }

/**
   * Retourne une entité grâce à son nom.
   *
   * @param  nomEntite Le nom de l'entité
   * @return L'entité du tableau de type Entite
   * @see  Entite#nom
   */


  public Entite getEntite(String nomEntite){
    for(int i = 0; i < entites.length; i++){
      if(entites[i].getNom() == nomEntite){
        return this.entites[i];
      }
    }
    return null;
  }


/**
   * Retourne le nom du Monde.
   * @return Le nom du Monde
   */


  public String getNom(){
    return this.nom;
  }

  /**
   * Retourne l'ensemble des informations du monde.
   * @return L'ensemble des informations du monde sous forme d'une chaîne de caractères.
   */


  public String toString(){
    StringBuilder str = new StringBuilder("Monde " + this.nom + "\n Entites : \n");
    for(int i = 0; i < entites.length; i++)
    {
      str.append(this.entites[i].getNom());
      str.append("\n");
    }
    return str.toString();
  }

}
