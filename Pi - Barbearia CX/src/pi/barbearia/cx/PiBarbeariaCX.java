
package pi.barbearia.cx;

import Entities.Conexao;
import Entities.TelaLogin;

public class PiBarbeariaCX {

    public static void main(String[] args) {
       TelaLogin tl = new TelaLogin();
       Conexao con = new Conexao();
       tl.setVisible(true);
    }
    
}
