package fr.insarouen.asi.prog.asiaventure.elements.objets;

import fr.insarouen.asi.prog.asiaventure.Monde;

/**
  * PiedDeBiche est une classe qui est un Objet qui est une Entite.
  * @see Objet
  *
  * @author Antoine Questel et Pierre-François Giraud
  * @version 1.0
  */

public class PiedDeBiche extends Objet {
  // constructeurs

  /**
    * Constructeur PiedDeBiche, crée une instance de PiedDeBiche.
    * <p>
    * Voir le contructeur de la classe Objet.
    * </p>
    *
    * @param nom Le nom du pied de biche
    * @param monde Le monde du pied de biche
    *
    * @see Objet#Objet(String, Monde)
    * @see Objet#nom
    * @see Objet#monde
    * 
    * @throws NomDEntiteDejaUtiliseDansLeMondeException S'il existe déjà une Entite portant le même nom que celle que l'on veut ajouter dans le Monde.
    */

  public PiedDeBiche(String nom, Monde monde){
    super(nom, monde);
  }
// methodes

  /**
    * Retourne si un pied de biche est déplacable.
    *
    * @return si un pied de biche est déplacable sous forme de booléen.
    */


  public boolean estDeplacable(){
    return true;
  }
}
