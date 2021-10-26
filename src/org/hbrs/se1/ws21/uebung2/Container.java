package org.hbrs.se1.ws21.uebung2;

import org.hbrs.se1.ws21.uebung2.exception.ContainerException;
import org.hbrs.se1.ws21.uebung3.persistence.PersistenceException;
import org.hbrs.se1.ws21.uebung3.persistence.PersistenceStrategyStream;

import java.util.LinkedList;
import java.util.List;

public class Container{

    PersistenceStrategyStream<Member> pss = new PersistenceStrategyStream<>();
    private static final Container containerInstance = new Container();

    private Container(){}

    public static Container getContainerInstance(){
        return containerInstance;
    }

    LinkedList<Member> containerMember = new LinkedList<>();

    public void addMember(Member member) throws ContainerException {
        for(Member memb : containerMember){
            if (member.getID().equals(memb.getID())){
                throw new ContainerException(member);
            }
        }
        containerMember.add(member);
    }

    public String deleteMember(Integer id){
        for(Member member: containerMember) {
            if (id.equals(member.getID())) {
                containerMember.remove(member);
                return "Member mit ID " + member.getID() + " würde gelöscht";
            }
        }
            return "ID nicht vorhanden";
    }

    public int size(){
        return containerMember.size();
    }

    public void store() throws PersistenceException {
        pss.save(containerMember);
    }

    public List<Member> getCurrentList(){
        return containerMember;
    }
}
