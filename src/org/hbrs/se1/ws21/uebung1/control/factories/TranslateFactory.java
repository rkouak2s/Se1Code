package org.hbrs.se1.ws21.uebung1.control.factories;

import org.hbrs.se1.ws21.uebung1.control.*;
import org.hbrs.se1.ws21.uebung1.control.GermanTranslator;

public class TranslateFactory {

    public static Translator createGermanTranslator(){
        return new GermanTranslator();
    }
}
