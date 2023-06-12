/*
 *
 *  ---------------------------------------------------------------------------------------------------------
 *              Titel: QuotesResource.java
 *             Auteur: bresd00
 *    Creatietijdstip: 06/06/2023 15:46
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
package cursus.resources;

import cursus.repositories.QuoteRepository;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.Response;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;
import static jakarta.ws.rs.core.MediaType.APPLICATION_XML;

/**
 * TODO: bresd00: beschrijf deze klasse !
 *
 * @author bresd00
 */

@Dependent
@Path("quotes")
public class QuotesResource {

    @Inject
    QuoteRepository quoteRepository;

/*    List<Quote> list = List.of(new Quote("The Peter Principle", "In a hierarchy, every employee tends to rise to his level of incompetence.", "https://en.wikipedia.org/wiki/Peter_principle", "assets/peter.jpeg", 1), new Quote("Goodhart's law", "Any observed statistical regularity will tend to collapse once pressure is placed upon it for control purposes. When a measure becomes a target, it ceases to be a good measure.", "https://en.wikipedia.org/wiki/Goodhart%27s_law", "assets/goodhart.jpeg", 2));
    GenericEntity<List<Quote>> entity = new GenericEntity<List<Quote>>(list) {
    };*/

    @Produces({APPLICATION_JSON, APPLICATION_XML})
    @GET
    public Response get(@Context HttpHeaders headers) {
        if (headers.getHeaderString(HttpHeaders.ACCEPT).contains(APPLICATION_JSON)) {
            return Response
                    .status(200)
                    .entity(quoteRepository.findAll())
//                    .entity(Collections.singletonMap("quotes", entity.getEntity()))  // dit is voor de valide json
                    .build();
        } else {
            return Response
                    .status(200)
                    .entity(quoteRepository.findAll())
                    .build();
        }
    }

}
