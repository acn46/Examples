package edu.drexel.examples.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import edu.drexel.examples.model.Bacteria;

@ComponentScan("edu.drexel.examples")
@RunWith(SpringRunner.class)
@SpringBootTest
public class BacteriaServiceTester {

	@Autowired
	private BacteriaService service;
	
	@Test
	public void test() {
		String filename = "/Users/user/Downloads/Reports/AE0003_pair01.fastq.out.clean.csv.hc.report.csv";
		
		//BacteriaService service = new BacteriaService();
		List<Bacteria> list = service.parse(filename);
		System.out.println("List size = " + list.size());
		//service.load(list);
		
		Bacteria bt1 = service.findByTaxId(32002);
		System.out.println("bt1 = " + bt1);
	}

}
