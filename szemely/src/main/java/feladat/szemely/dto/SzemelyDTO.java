package feladat.szemely.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SzemelyDTO implements Serializable {


	
	 public String getVisNev() {
	        return visNev;
	    }

	    public void setVisNev(String visNev) {
	        this.visNev = visNev;
	    }

	 
	    public String getSzulNev() {
	        return szulNev;
	    }

	  
	    public void setSzulNev(String szulNev) {
	        this.szulNev = szulNev;
	    }

	
	    public String getaNev() {
	        return aNev;
	    }

	    public void setaNev(String aNev) {
	        this.aNev = aNev;
	    }

	  
	    public Date getSzulDat() {
	        return szulDat;
	    }

	
	    public void setSzulDat(Date szulDat) {
	        this.szulDat = szulDat;
	    }


	    public String getNeme() {
	        return neme;
	    }

	    public void setNeme(String neme) {
	        this.neme = neme;
	    }

	
	    public String getAllampKod() {
	        return allampKod;
	    }

	 
	    public void setAllampKod(String allampKod) {
	        this.allampKod = allampKod;
	    }

	
	    public String getAllampDekod() {
	        return allampDekod;
	    }

	
	    public void setAllampDekod(String allampDekod) {
	        this.allampDekod = allampDekod;
	    }

	
	/*    public ArrayList<OkmanyDTO> getOkmLista() {
	        return okmLista;
	    }

	 
	    public void setOkmLista(ArrayList<OkmanyDTO> okmLista) {
	        this.okmLista = okmLista;
	    } */
	    
		private static final long serialVersionUID = 4L;
	    
	    private String visNev;
	    
	    private String szulNev;
	    
	    private String aNev;
	    
	    private Date szulDat;
	    
	    private String neme;
	    
	    private String allampKod;
	    
	    private String allampDekod;
	    
	   // private ArrayList<OkmanyDTO> okmLista;
}
