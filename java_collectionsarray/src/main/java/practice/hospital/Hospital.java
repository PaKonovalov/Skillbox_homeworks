package practice.hospital;

import java.text.DecimalFormat;

public class Hospital {
    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patientsTemperatures = new float[patientsCount];
        for (int i = 0; i < patientsTemperatures.length; i++) {
            patientsTemperatures[i] = (float) ((Math.random() * ((39 - 32) + 1)) + 32);
            patientsTemperatures[i] = (float) Math.round(patientsTemperatures[i] * 10) / 10;
        }
        return patientsTemperatures;
    }

    public static String getReport(float[] temperatureData) {
        StringBuilder allTempPatients = new StringBuilder();
        float healthyPatients = 1;
        float averageTempHospital = 0;
        String resultAverage = "";

        for (int i = 0; i <= temperatureData.length - 1; i++) {
            averageTempHospital += temperatureData[i] / temperatureData.length;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            resultAverage = decimalFormat.format(averageTempHospital);
            if (i < temperatureData.length - 1) {
                allTempPatients.append(temperatureData[i]).append(" ");
            }

            if (i == temperatureData.length - 1) {
                allTempPatients.append(temperatureData[i]);
            }

            if (temperatureData[i] <= 36.9 && temperatureData[i] >= 36.2) {
                healthyPatients++;
            }
        }
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */
        String report =
                "Температуры пациентов: " + allTempPatients +
                        "\nСредняя температура: " + resultAverage +
                        "\nКоличество здоровых: " + Math.round(healthyPatients);
        return report;
    }
}
