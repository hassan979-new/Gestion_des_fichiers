package com.example.tp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {
	public static List<Record> readCsv(String path) throws IOException {
		List<Record> records = new ArrayList<Record>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			br.readLine();
			String line;
			while ((line = br.readLine()) != null) {
				String[] p = line.split(",");
				records.add(new Record(Integer.parseInt(p[0].trim()), p[1].trim(), Double.parseDouble(p[2].trim())));
			}
		}
		return records;
	}

	public static void writeCsv(List<Record> records, String path) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			bw.write("id,nom,score\n");
			for (Record r : records) {
				bw.write(r.toString() + "\n");
			}
		}
	}
}
