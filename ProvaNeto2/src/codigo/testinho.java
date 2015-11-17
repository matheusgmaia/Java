package codigo;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class testinho {

	@Test
	public void test() {
		String mensagem = ("sdjasdnasdn #OLA OLAAa #AZUL ola");
		Pattern p = Pattern.compile("(#\\w*\\s)(?<ai>\\w*).");
		Matcher m = p.matcher(mensagem);
		while(m.find()){
			System.out.println(m.group("ai"));
		}
			System.out.println(mensagem.matches("(#\\w*)(?=[$|\\s#])"));
	}
}
