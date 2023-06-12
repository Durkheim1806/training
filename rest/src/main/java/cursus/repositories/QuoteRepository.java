/*
 *
 *  ---------------------------------------------------------------------------------------------------------
 *              Titel: QuoteRepository.java
 *             Auteur: bresd00
 *    Creatietijdstip: 08/06/2023 14:45
 *          Copyright: (c) 2023 Belastingdienst / Centrum voor Applicatieontwikkeling en Onderhoud,
 *                     All Rights Reserved.
 *  ---------------------------------------------------------------------------------------------------------
 *                                              |   Unpublished work. This computer program includes
 *     De Belastingdienst                       |   Confidential, Properietary Information and is a
 *     Postbus 9050                             |   trade Secret of the Belastingdienst. No part of
 *     7300 GM  Apeldoorn                       |   this file may be reproduced or transmitted in any
 *     The Netherlands                          |   form or by any means, electronic or mechanical,
 *     http://belastingdienst.nl/               |   for the purpose, without the express written
 *                                              |   permission of the copyright holder.
 *  ---------------------------------------------------------------------------------------------------------
 *
 */
package cursus.repositories;

import cursus.domain.Quote;
import jakarta.ejb.Stateless;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO: bresd00: beschrijf deze klasse !
 *
 * @author bresd00
 */

@Stateless
public class QuoteRepository {

    List<Quote> quotes = new ArrayList<>(Arrays.asList(
            new Quote("The Peter Principle", "In a hierarchy, every employee tends to rise to his level of incompetence.", "https://en.wikipedia.org/wiki/Peter_principle", "assets/peter.jpeg", 1),
            new Quote("Goodhart's law", "Any observed statistical regularity will tend to collapse once pressure is placed upon it for control purposes. When a measure becomes a target, it ceases to be a good measure.", "https://en.wikipedia.org/wiki/Goodhart%27s_law", "assets/goodhart.jpeg", 2)
    ));

    public List<Quote> findAll() {
        return quotes;
    }

}
