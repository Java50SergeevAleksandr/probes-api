package telran.probes.dto;

import jakarta.validation.constraints.NotNull;
import static telran.probes.messages.ErrorMessages.*;

import java.util.Arrays;
import java.util.Objects;

public record SensorEmails(@NotNull(message = MISSING_SENSOR_ID) long id,
		@NotNull(message = MISSING_EMAILS) String[] mails) {

	@Override
	public String toString() {
		return Arrays.toString(mails);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(mails);
		result = prime * result + Objects.hash(id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SensorEmails other = (SensorEmails) obj;
		return id == other.id && Arrays.equals(mails, other.mails);
	}

}