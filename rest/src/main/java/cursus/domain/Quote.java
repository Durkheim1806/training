package cursus.domain;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: bresd00: beschrijf deze klasse !
 *
 * @author bresd00
 */

@XmlRootElement
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Quote {

    String title;
    String text;
    String link;
    String picture;
    long id;

}
