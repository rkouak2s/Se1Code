package org.hbrs.se1.ws21.uebung2;

import org.hbrs.se1.ws21.uebung2.exception.ContainerException;

import java.util.LinkedList;

public class Container{

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

    public void dump(){
        for(Member member : containerMember){
            System.out.println(member.toString());
        }
    }

    public int size(){
        return containerMember.size();
    }
}
