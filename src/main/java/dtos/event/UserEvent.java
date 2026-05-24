package dtos.event;


import dtos.UserEventDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEvent {
    private String messgae;
    private String status;
    private UserEventDto user;
}
