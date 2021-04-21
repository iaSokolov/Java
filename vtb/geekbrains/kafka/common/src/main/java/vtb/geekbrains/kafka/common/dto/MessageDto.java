package vtb.geekbrains.kafka.common.dto;

import lombok.Data;

@Data
public class MessageDto {
    private String message;
    private Integer age;

    public MessageDto() {
    }

    public MessageDto(String message, Integer age) {
        this.message = message;
        this.age = age;
    }
}
