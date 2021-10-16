package ai.ecma.appticketserver.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BronTariffResDto {

    private UUID id;

    private int lifetime;

    private double percent;

    private boolean disabled;

}
