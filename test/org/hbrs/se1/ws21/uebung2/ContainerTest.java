package org.hbrs.se1.ws21.uebung2;

import org.hbrs.se1.ws21.uebung2.exception.ContainerException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    Container container = Container.getContainerInstance();
        Member m1 = new MemberItem(11);
        Member m2 = new MemberItem(22);
        Member m3 = new MemberItem(33);
        Member m4 = new MemberItem(44);

    @Test
    void containerTest() throws ContainerException {
        assertEquals(0, container.size());

        container.addMember(m1);
        container.addMember(m2);
        container.addMember(m3);
        container.addMember(m4);
        assertEquals(4, container.size());

        assertEquals("ID nicht vorhanden", container.deleteMember(77));
        assertEquals("Member mit ID 22 würde gelöscht", container.deleteMember(22));
        assertEquals("Member mit ID 33 würde gelöscht", container.deleteMember(33));
        assertEquals(2, container.size());
        assertThrows(ContainerException.class, ()->{container.addMember(new MemberItem(44));});
    }
}