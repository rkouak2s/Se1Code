package org.hbrs.se1.ws21.uebung1.control.test;

import org.hbrs.se1.ws21.uebung1.control.Translator;
import org.hbrs.se1.ws21.uebung1.control.factories.TranslateFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    @Test
    void translateNumberTest() {

        Translator translator = TranslateFactory.createGermanTranslator();
        assertEquals("vier", translator.translateNumber(4));
        assertEquals("eins", translator.translateNumber(1));
        assertEquals("Übersetzung der Zahl " + -2 + " nicht möglich (" + translator.version + ")", translator.translateNumber(-2));
        assertEquals("Übersetzung der Zahl " + 0 + " nicht möglich (" + translator.version + ")", translator.translateNumber(0));
        assertEquals("Übersetzung der Zahl " + 15 + " nicht möglich (" + translator.version + ")", translator.translateNumber(15));
    }
}