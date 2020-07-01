package feladat.okmany.checker;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import org.springframework.stereotype.Service;

import feladat.okmany.dto.OkmanyDTO;
import feladat.okmany.tipus.Okmanytipus;

@Service
public class OkmanyCheckerImpl implements OkmanyChecker {


	public boolean incorrectOkmTipus(OkmanyDTO okmany, List<Okmanytipus> okmanytipus ) {
		
		if(okmany.getOkmTipus().length() != 1)
    		return false;
		
		for (Okmanytipus i : okmanytipus) {	
   		 if(i.getKod().equals(okmany.getOkmTipus()))
   			 return true;    	
	    }
    	return false;
	}

	public boolean incorrectOkmanySzam(OkmanyDTO okmany) {
		String okmanySzam = okmany.getOkmanySzam();
		String okmanyTipus = okmany.getOkmTipus();
		int okmanySzamLength = okmany.getOkmanySzam().length();
		
		switch (okmanyTipus) {
		  case "1":
			if(okmanySzamLength != 8)
				return false;
		    for(int i = 0; i < 6 ; i++){
		    	if(!Character.isDigit(okmanySzam.charAt(i)))
		    		return false;
		    }
		    if(!Character.isLetter(okmanySzam.charAt(6)) || !Character.isLetter(okmanySzam.charAt(7)))
	    		return false;
		    break;
		  case "2":
			  if(okmanySzamLength != 9)
					return false;
			    for(int i = 2; i < 9 ; i++){
			    	if(!Character.isDigit(okmanySzam.charAt(i)))
			    		return false;
			    }
			    if(!Character.isLetter(okmanySzam.charAt(0)) || !Character.isLetter(okmanySzam.charAt(1)))
		    		return false;
		    break;
		  case "3":
		    
		    break;
		  case "4":
		    
		    break;
		  case "5":
		    
		    break;
		  case "6":
		    
		    break;
		}
		return true;
	}

	public boolean incorrectOkmanyKep(OkmanyDTO okmany) throws Exception {
		
		byte[] picture = okmany.getOkmanyKep();
	    InputStream in = new ByteArrayInputStream(picture);
	    BufferedImage buf = ImageIO.read(in);
	    
	    if(buf.getHeight() != 1063 || buf.getWidth() != 827)
				return false;
	        
		ImageInputStream iis = ImageIO.createImageInputStream(new ByteArrayInputStream(picture));

		Iterator<ImageReader> readers = ImageIO.getImageReaders(iis);
		while (readers.hasNext()) {
		    ImageReader read = readers.next();
		    if( read.getFormatName().equals("jpeg"))
				return true;
		}
		
		return false;
	}

	public boolean incorrectLejarDat(OkmanyDTO okmany) {
		
		if(okmany.getLejarDat() == null)
			return false;
		
		return true;
	}

	public boolean incorrectErvenyes(OkmanyDTO okmany) {
		//Date lejarat = okmany.getLejarDat();
		//Date today = Calendar.getInstance().getTime();
		Boolean tmp = okmany.isErvenyes();
		
		if(tmp != null )
			return false;
	
		/*if(lejarat.before(today))  innen at kell rakni
		{
			okmany.setErvenyes(true);
		}*/

		return true;
	}


}