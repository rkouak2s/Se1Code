package org.hbrs.se1.ws21.uebung2.exception;

import org.hbrs.se1.ws21.uebung2.Member;

public class ContainerException extends Exception {

    public ContainerException(Member member){
        super("Das Member-Objekt mit der ID " + member.getID() + " ist bereits vorhanden!");
    }
}
