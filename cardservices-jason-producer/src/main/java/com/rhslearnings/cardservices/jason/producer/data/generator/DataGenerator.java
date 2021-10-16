package com.rhslearnings.cardservices.jason.producer.data.generator;

import java.io.File;
import java.util.Random;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.finserv.data.model.CardV11;
import com.rhslearnings.kafka.json.producer.data.model.CardInfo;

public class DataGenerator {

	private static final DataGenerator ourInstance = new DataGenerator();
	private final Random random;

	//private CardInfo[] cardInfo;
	private CardV11[] cardInfo;

	private int getIndex() {
		return random.nextInt(3);
	}

	public static DataGenerator getInstance() {
		return ourInstance;
	}

	private DataGenerator() {
		final String DATAFILE = "src/main/resources/data/FINSERV-DATA.json"; //"src/main/resources/data/EPOC-DATA.json";
		final ObjectMapper mapper;
		random = new Random();
		mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		try {
		//	cardInfo = mapper.readValue(new File(DATAFILE), CardInfo[].class);
			cardInfo = mapper.readValue(new File(DATAFILE), CardV11[].class);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public CardV11 getNextInfo() {
		return cardInfo[getIndex()];
	}

	/*
	 * public static void main(String[] args) { long num1, num2, num3; // 3 numbers
	 * in area code int set2, set3; // sequence 2 and 3 of the phone number
	 * 
	 * Random generator = new Random();
	 * 
	 * for (int i = 0; i <= 99; i++) { num1 = generator.nextInt(7) + 1; num2 =
	 * generator.nextInt(8); num3 = generator.nextInt(8); set2 =
	 * generator.nextInt(643) + 100; set3 = generator.nextInt(8999) + 1000;
	 * System.out.println("{\"EventType\":\""+CardServicesEventTypes.CARDINFO.
	 * toString()+"\",\"CustomerId\":"+Long.valueOf(num1 + "" + num3 + set2 +
	 * set3)+",\"Email\":\"demo" + i + "@test.com\",\n" + "\"ContactNumber\":" +
	 * Long.valueOf(num1 + "" + num2 + "" + num3 + set2 + set3) + "},\n");
	 * 
	 * }
	 * 
	 * }
	 */
}
