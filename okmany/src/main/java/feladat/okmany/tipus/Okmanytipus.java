package feladat.okmany.tipus;

import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.NoArgsConstructor;
import java.io.Serializable;
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Okmanytipus implements Serializable {
	
	
	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getErtek() {
		return ertek;
	}

	public void setErtek(String ertek) {
		this.ertek = ertek;
	}

		private static final long serialVersionUID = 1L;
		
		private String kod;
		
		private String ertek;
		
	
}
