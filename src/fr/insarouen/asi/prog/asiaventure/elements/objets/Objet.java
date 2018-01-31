package fr.insarouen.asi.prog.asiaventure.elements.objets;

import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.Monde;

/**
  * Objet est une classe qui est une Entite.
  * @see Entite
  *
  * @author Antoine Questel et Pierre-François Giraud
  * @version 1.0
  */

public class Objet extends Entite {


  // constructeurs

  /**
    * Constructeur Objet, crée une nouvelle instance de Objet.
    * <p>
    * Voir le contructeur de la classe Entite.
    * </p>
    *
    * @param nom Le nom de l'objet
    * @param monde Le monde de l'objet
    *
    * @see Entite#Entite(String, Monde)
    * @see Entite#nom
    * @see Entite#monde
    *
    * @throws NomDEntiteDejaUtiliseDansLeMondeException S'il existe déjà une Entite portant le même nom que celle que l'on veut ajouter dans le Monde.
    */

  public Objet(String nom, Monde monde){
    super(nom, monde);
  }


  // methodes

  /**
    * Retourne si un objet est déplacable.
    *
    * @return si un objet est déplacable sous forme de booléen.
    */

  public boolean estDeplacable(){
    return false;
  }
}
