package feladat.szemely.allamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Allampolgarsag implements Serializable {
	

		public String getKod() {
			return kod;
		}
		
		public void setKod(String kod) {
			this.kod = kod;
		}
		
		public String getAllampolgarsag() {
			return allampolgarsag;
		}
		
		public void setAllampolgarsag(String allampolgarsag) {
			this.allampolgarsag = allampolgarsag;
		}
		
		public String getOrszag() {
		return orszag;
		}
		
		public void setOrszag(String orszag) {
			this.orszag = orszag;
		}
		
		public String getSchengen() {
		return schengen;
		}
		
		public void setSchengen(String schengen) {
			this.schengen = schengen;
		}
		
		public String getSis1_orsz() {
			return sis1_orsz;
		}
		
		public void setSis1_orsz(String sis1_orsz) {
			this.sis1_orsz = sis1_orsz;
		}
		
		public String getSis1_orsz_hun() {
			return sis1_orsz_hun;
		}
		
		public void setSis1_orsz_hun(String sis1_orsz_hun) {
			this.sis1_orsz_hun = sis1_orsz_hun;
		}
	
		private static final long serialVersionUID = 1L;
		
		private String kod;
		
		private String allampolgarsag;
		
		private String orszag;
		
		private String schengen;
		
		private String sis1_orsz;
		
		private String sis1_orsz_hun;
		
}
