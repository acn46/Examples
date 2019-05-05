package edu.drexel.examples.service;

import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import edu.drexel.examples.model.Bacteria;

public class BacteriaService {

	private static final String UNKNOWN = "UNKNOWN";

	public List<Bacteria> parse(String filename) {
		List<Bacteria> list = new ArrayList<>();
	
		// Open the csv file
		// for each line in svc, create a Bacteria object
		// put Bacteria in the list.
		Reader in;
		try {
			in = new FileReader(filename);
			Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
			for (CSVRecord record : records) {
				Bacteria bacteria = new Bacteria();
				
				String name = record.get("Name");
				String taxId = record.get("TaxID");
				String lineage = record.get("Lineage");
				String bacteriaCount = record.get("Count");
				String proportionAll = record.get("Proportion_All(%)");
				String proportionClassified = record.get("Proportion_Classified(%)");
				
				if (taxId.equals(UNKNOWN)) {
					continue;
				} 
				
				bacteria.setName(name);
				bacteria.setTaxId(Integer.parseInt(taxId));
				bacteria.setLineage(lineage);
				bacteria.setBacteriaCount(Integer.parseInt(bacteriaCount));
				bacteria.setProportionAll(Double.parseDouble(proportionAll));
				bacteria.setProportionClassified(Double.parseDouble(proportionClassified));
				
				list.add(bacteria);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
		return list;
	}
	
}
