package codigo;


import org.junit.*;
import static org.junit.Assert.assertFalse;

public class maintete2 {
	@Test
	public static void main(String[] args) {
		String mensagem = ("sdjasdnasdn #OLA AZUL");
		assertFalse(mensagem.matches("#\\w*$| #"));
	}
}
