package fr.insarouen.asi.prog.asiaventure.elements.structure;

import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.Monde;


/**
  * ElementStructurel est une classe qui est une Entite.
  * @see Entite
  *
  * @author Antoine Questel et Pierre-François Giraud
  * @version 3.0
  */

public class ElementStructurel extends Entite {
// constructeurs

  /**
    * Constructeur ElementStructurel, crée une nouvelle instance de ElementStructurel.
    * <p>
    * Voir le contructeur de la classe Entite.
    * </p>
    *
    * @param nom Le nom de l'element structurel
    * @param monde Le monde de l'element structurel
    *
    * @see Entite#Entite(String, Monde)
    * @see Entite#nom
    * @see Entite#monde
    *
    * @throws NomDEntiteDejaUtiliseDansLeMondeException S'il existe déjà une Entite portant le même nom que celle que l'on veut ajouter dans le Monde.
    */

  public ElementStructurel(String nom, Monde monde){
    super(nom, monde);
  }
}
