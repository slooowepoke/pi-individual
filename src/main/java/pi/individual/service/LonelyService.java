package pi.individual.service;

import org.springframework.stereotype.Service;
import pi.individual.container.LonelyContainer;

@Service
public class LonelyService {
    public LonelyContainer getDevDay(String request) {
        try {
            Integer year = Integer.valueOf(request);
            if (year < 0 || year > 9999)
                throw new NumberFormatException();
            else if (isLeapYear(year))
                return new LonelyContainer(200, "12/09/" + String.format("%04d", year));
            else return new LonelyContainer(200, "13/09/" + String.format("%04d", year));
        }
        catch (NumberFormatException e) {
            return new LonelyContainer(400, "Неверный формат даты");
        }
    }

    private boolean isLeapYear(Integer year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
