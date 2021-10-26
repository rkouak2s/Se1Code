package org.hbrs.se1.ws21.uebung3.persistence;

import org.hbrs.se1.ws21.uebung2.Member;
import java.util.LinkedList;

public class MemberView {
    public void dump(LinkedList<Member> containerMember){
        for(Member member : containerMember){
            System.out.println(member.toString());
        }
    }
}
