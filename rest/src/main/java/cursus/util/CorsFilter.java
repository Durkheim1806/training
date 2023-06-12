/*
 *
 *  ---------------------------------------------------------------------------------------------------------
 *              Titel: CorsFilter.java
 *             Auteur: bresd00
 *    Creatietijdstip: 12/06/2023 14:31
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
package cursus.util;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.ext.Provider;

import java.io.IOException;
import java.util.List;

/**
 * TODO: bresd00: beschrijf deze klasse !
 *
 * @author bresd00
 */

@Provider
public class CorsFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        containerResponseContext.getHeaders().put("Access-Control-Allow-Origin", List.of("*"));
        containerResponseContext.getHeaders().put("Access-Control-Allow-Credentials", List.of("true"));
        containerResponseContext.getHeaders().put("Access-Control-Allow-Headers", List.of("origin, content-type, accept, authorization"));
        containerResponseContext.getHeaders().put("Access-Control-Allow-Methods", List.of("GET, POST, PUT, DELETE, OPTIONS, HEAD"));
    }
}
