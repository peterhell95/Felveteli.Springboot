package feladat.okmany.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OkmanyDTO implements Serializable {

	
    public String getOkmTipus() {
        return okmTipus;
    }


    public void setOkmTipus(String okmTipus) {
        this.okmTipus = okmTipus;
    }

  
    public String getOkmanySzam() {
        return okmanySzam;
    }


    public void setOkmanySzam(String okmanySzam) {
        this.okmanySzam = okmanySzam;
    }

  
    public byte[] getOkmanyKep() {
        return okmanyKep;
    }

   
    public void setOkmanyKep(byte[] okmanyKep) {
        this.okmanyKep = okmanyKep;
    }


    public Date getLejarDat() {
        return lejarDat;
    }

 
    public void setLejarDat(Date lejarDat) {
        this.lejarDat = lejarDat;
    }

  
    public boolean isErvenyes() {
        return ervenyes;
    }

   
    public void setErvenyes() {
        Date lejarat = getLejarDat();
        Date today = Calendar.getInstance().getTime();
        	
        		if(lejarat.after(today)) 
        			this.ervenyes = true;
        		else 
        			this.ervenyes = false;
    }
    
    private static final long serialVersionUID = 1L;
    
    private String okmTipus;
    
    private String okmanySzam;
    
    private byte[] okmanyKep;
    
    private Date lejarDat;
    
    private boolean ervenyes;
    
}

