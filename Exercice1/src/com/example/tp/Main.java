package com.example.tp;

import java.io.IOException;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		try {
			// sample ecrire et lire
			TextReader.readLines("input.txt");
			TextWriter.copyWithSummary("input.txt", "output.txt");

			// lire un fichier .csv et le afficher
			List<Record> records = CsvParser.readCsv("data.csv");
			for (Record r : records) {
				System.out.println(r);
			}

			// filtrer les note dans nouvelle record et le ecriver dans fichier.csv
			List<Record> passed = records.stream().filter(r -> r.getScore() >= 10).toList();
			CsvParser.writeCsv(passed, "passed.csv");

			// serializer et deserializer les objet dans data.csv
			ObjectSerializer.serialize(records, "dataSerializer.dat");
			List<Record> objsDeserializer = ObjectSerializer.deserialize("dataSerializer.dat");
			for (Record r : objsDeserializer) {
				System.out.println(r);
			}

		} catch (IOException e) {
			System.err.println("Ereur: " + e.getMessage());

		} catch (ClassNotFoundException e) {
			System.err.println("Ereur: " + e.getMessage());
		}
	}
}
