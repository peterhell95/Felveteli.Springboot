package feladat.okmany.tipus;

import java.util.List;


public class OkmanytipusJSON {

	private String dictname;
	private List<Okmanytipus> rows;
	
	public String getDictname() {
		return dictname;
	}
	public void setDictname(String dictname) {
		this.dictname = dictname;
	}
	public List<Okmanytipus> getRows() {
		return rows;
	}
	public void setRows(List<Okmanytipus> rows) {
		this.rows = rows;
	}

}
