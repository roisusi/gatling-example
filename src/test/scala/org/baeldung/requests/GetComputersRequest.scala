package org.baeldung.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import org.baeldung.config.Config._


object GetComputersRequest {

    val get_computers = exec(http("Get Computers")
        .get(app_url + "/computers")
        .check(status is 200))
}
