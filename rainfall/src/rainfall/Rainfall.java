package rainfall;

import java.util.HashMap;
import java.util.Map;

public class Rainfall {

	public static double mean(String town, String strng) {
		Map<String, Double> townRainfallMeanMap = buildTownRainfallMeanMap(strng);

		return townRainfallMeanMap.getOrDefault(town, -1.0);
	}

	private static Map<String, Double> buildTownRainfallMeanMap(String strng) {
		Map<String, Double> townRainfallMeanMap = new HashMap<>();
		String[] townAndMonthRainfalls = strng.split("\n");

		for (String townAndMonthRainfall : townAndMonthRainfalls) {
			String targetTown = townAndMonthRainfall.split(":")[0];
			String[] monthRainfalls = townAndMonthRainfall.split(":")[1].split(",");
			double sumOfRecords = 0;

			for (String monthRainfall : monthRainfalls) {
				sumOfRecords += Double.parseDouble(monthRainfall.split(" ")[1]);
			}
			townRainfallMeanMap.put(targetTown, sumOfRecords / 12);
		}

		return townRainfallMeanMap;
	}

	public static double variance(String town, String strng) {
		Map<String, Double> townRainfallVarianceMap = buildTownRainfallVarianceMap(town, strng);

		return townRainfallVarianceMap.getOrDefault(town, -1.0);
	}

	private static Map<String, Double> buildTownRainfallVarianceMap(String town, String strng) {
		Map<String, Double> townRainfallVarianceMap = new HashMap<>();
		double mean = mean(town, strng);
		String[] townAndMonthRainfalls = strng.split("\n");

		for (String townAndMonthRainfall : townAndMonthRainfalls) {
			String targetTown = townAndMonthRainfall.split(":")[0];
			String[] monthRainfalls = townAndMonthRainfall.split(":")[1].split(",");
			double sumOfRecords = 0;

			for (String monthRainfall : monthRainfalls) {
				double rainfall = Double.parseDouble(monthRainfall.split(" ")[1]);
				sumOfRecords += Math.pow((rainfall - mean), 2);
			}
			townRainfallVarianceMap.put(targetTown, sumOfRecords / 12);
		}

		return townRainfallVarianceMap;
	}
}