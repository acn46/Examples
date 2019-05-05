package edu.drexel.examples.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import edu.drexel.examples.model.Bacteria;

public class BacteriaServiceTester {

	@Test
	public void test() {
		String filename = "/Users/user/Downloads/Reports/AE0003_pair01.fastq.out.clean.csv.hc.report.csv";
		BacteriaService service = new BacteriaService();
		List<Bacteria> list = service.parse(filename);
		System.out.println("List size = " + list.size());
	}

}
