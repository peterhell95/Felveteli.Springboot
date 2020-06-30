package feladat.okmany.checker;

import org.springframework.stereotype.Service;

import feladat.okmany.dto.OkmanyDTO;

@Service
public class OkmanyCheckerImpl implements OkmanyChecker {


	public boolean incorrectOkmTipus(OkmanyDTO okmany) {
		return true;
	}

	public boolean incorrectOkmanySzam(OkmanyDTO okmany) {
		return true;
	}

	public boolean incorrectOkmanyKep(OkmanyDTO okmany) {
		return true;
	}

	public boolean incorrectLejarDat(OkmanyDTO okmany) {
		return true;
	}

	public boolean incorrectErvenyes(OkmanyDTO okmany) {
		return true;
	}


}