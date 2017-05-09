
package negocio;

import com.avaliacao.entidade.Voo;
import java.util.List;

public interface IVoo {
    boolean criar (Voo Voo);
    List<Voo> consultar();
}
