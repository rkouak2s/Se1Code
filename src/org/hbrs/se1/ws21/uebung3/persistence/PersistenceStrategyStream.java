package org.hbrs.se1.ws21.uebung3.persistence;

import java.io.*;

import java.util.List;

public class PersistenceStrategyStream<Member> implements PersistenceStrategy<Member> {

    // URL of file, in which the objects are stored
    private String location = "objects.ser";

    // Backdoor method used only for testing purposes, if the location should be changed in a Unit-Test
    // Example: Location is a directory (Streams do not like directories, so try this out ;-)!
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    /**
     * Method for opening the connection to a stream (here: Input- and Output-Stream)
     * In case of having problems while opening the streams, leave the code in methods load
     * and save
     */
    public void openConnection() throws PersistenceException {
        throw new PersistenceException(PersistenceException.ExceptionType.ImplementationNotAvailable, "Not implemented!");
    }

    @Override
    /**
     * Method for closing the connections to a stream
     */
    public void closeConnection() throws PersistenceException {
        throw new PersistenceException(PersistenceException.ExceptionType.ImplementationNotAvailable, "Not implemented!");
    }

    @Override
    /**
     * Method for saving a list of Member-objects to a disk (HDD)
     */
    public void save(List<Member> member) throws PersistenceException  {
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
        try {
            openConnection();
            fos = new FileOutputStream(this.location);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(member);

        } catch (IOException | PersistenceException e){
            e.printStackTrace();
            throw new PersistenceException(PersistenceException.ExceptionType.ConnectionNotAvailable, "Not connected!");
        }finally {
            closeConnection();
        }
    }

    @Override
    /**
     * Method for loading a list of Member-objects from a disk (HDD)
     * Some coding examples come for free :-)
     * Take also a look at the import statements above ;-!
     */
    public List<Member> load() throws PersistenceException  {
        // Some Coding hints ;-)
         ObjectInputStream ois = null;
         FileInputStream fis = null;
         List<Member> newListe =  null;

        // Initiating the Stream (can also be moved to method openConnection()... ;-)
        try{
            openConnection();
             fis = new FileInputStream( this.location );
             ois = new ObjectInputStream(fis);

             //Reading and extracting the list (try .. catch ommitted here)
             Object obj = ois.readObject();

             if (obj instanceof List<?>) {
                 newListe = (List<Member>) obj;
                 return newListe;
             }
            // and finally close the streams (guess where this could be...?)
        } catch (ClassNotFoundException | PersistenceException | IOException e) {
            e.printStackTrace();
            throw new PersistenceException(PersistenceException.ExceptionType.ConnectionNotAvailable, "Not connected!");
        }finally {
            closeConnection();
        }
        return null;
    }
}
