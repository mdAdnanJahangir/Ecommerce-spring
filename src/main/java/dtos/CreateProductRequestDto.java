package dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequestDto {

    private String title ;

    private String description;

    private BigDecimal price ;

    private String  image ;

    private String category;

    private String rating;

}
