package octopus;
import octopus.communication.*;

/**
 * The Playable Interface indicates that a class that realises it can be "playable" by a <code> Musician </code>.
 * 
 * @see Musician
 * @author lcostalonga
 *
 */
public interface Playable {

  public MusicalEventSequence getMusicalEventSequence();

  //public Map getPlayableAttributes();
	
  public String toString();	

}