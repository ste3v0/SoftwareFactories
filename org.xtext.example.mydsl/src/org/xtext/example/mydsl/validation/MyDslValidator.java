package org.xtext.example.mydsl.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Nutzen;
import org.xtext.example.mydsl.myDsl.Title;
import org.xtext.example.mydsl.myDsl.Ziel_Wunsch;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class MyDslValidator extends AbstractMyDslValidator {
	
	@Check
	public void checkNutzenVerb(Nutzen nutzen) {
		String my_verb = nutzen.getVerb();
		String restOfString;
		
		if (!my_verb.contains("zuzu")) {
			error("Es muss 'zuzu' im Vorkommen.", MyDslPackage.Literals.NUTZEN__VERB);
		} else {
			restOfString = my_verb.substring(my_verb.indexOf("zuzu")+4);
			String beforeString = my_verb.substring(0, my_verb.indexOf("zuzu"));
			if (restOfString.contains("zu")){							// insgesamt mehr als 3 zu im Wort
				error("Zu viel 'zu'!", MyDslPackage.Literals.NUTZEN__VERB);
			} else if(beforeString.contains("zu")) {
				error("Es liegt am beforeString", MyDslPackage.Literals.NUTZEN__VERB);
			}
		}
		
		if (!checkInfinitiv(my_verb))															// Endung auf "n"
			error("Infinitive enden auf '-en', '-ern', '-eln', also auf 'n'!", MyDslPackage.Literals.NUTZEN__VERB);		
	}
	@Check
	public boolean checkInfinitiv(String infinitiv) {
		String my_word = infinitiv;
		if (!my_word.endsWith("n"))	{
			return false;
		} else {
			return true;
		}
	}
	
	@Check
	public void checkTitle(Title title) {
		String inf = title.getInfinitiv();
		if (!(checkInfinitiv(inf))) {
			error("Infinitive enden auf '-en', '-ern', '-eln', also auf 'n'!", MyDslPackage.Literals.TITLE__INFINITIV);
		}
	}
	
	@Check
	public void checkZiel (Ziel_Wunsch ziel) {
		String inf = ziel.getInfinitiv();
		if (!(checkInfinitiv(inf))) {
			error("Infinitive enden auf '-en', '-ern', '-eln', also auf 'n'!", MyDslPackage.Literals.ZIEL_WUNSCH__INFINITIV);
		}
	}

}