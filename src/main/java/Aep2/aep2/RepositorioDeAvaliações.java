package Aep2.aep2;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAvaliações {



private List<Avaliação> avaliações = new ArrayList<Avaliação>();
    
	public void addAv(Avaliação avaliação) {
		this.avaliações.add(avaliação);
	}

	public List<Avaliação> getAvaliações() {
		return avaliações ;
	}
	


}
