package org.hbrs.se1.ws21.uebung3.persistence;

import org.hbrs.se1.ws21.uebung2.Container;
import org.hbrs.se1.ws21.uebung2.Member;
import org.hbrs.se1.ws21.uebung2.MemberItem;
import org.hbrs.se1.ws21.uebung2.exception.ContainerException;

import java.util.LinkedList;

//Strategy Design Pattern (GoF) würde hier verwendet

public class Client {

    public static void main(String[] args) throws ContainerException {
        Container container = Container.getContainerInstance();
        Member m1 = new MemberItem(11);
        Member m2 = new MemberItem(22);
        Member m3 = new MemberItem(33);
        container.addMember(m1);
        container.addMember(m2);
        container.addMember(m3);

        LinkedList<Member> member = new LinkedList<>();
        member.add(m1);
        member.add(m2);
        member.add(m3);

        MemberView memberView = new MemberView();

        memberView.dump(member);

    }

}
