package com.booking.payload;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;
@Data
@NoArgsConstructor
public class ScheduleDTO {
    private Long id;
    private Long busId;
    private Long routeId;
    @NotNull(message = "Departure time cannot be empty")
    @FutureOrPresent(message = "Departure time must be in the future or present")
    private Date departureTime;
    @NotNull(message = "Arrival time cannot be empty")
    @FutureOrPresent(message = "Arrival time must be in the future or present")
    private Date arrivalTime;
    @NotNull(message = "Price cannot be empty")
    @Min(value = 0, message = "Price must be greater than or equal to 0")

    private Double price;
}