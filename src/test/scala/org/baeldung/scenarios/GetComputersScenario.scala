package org.baeldung.scenarios

import io.gatling.core.Predef.scenario
import org.baeldung.requests.{GetComputersRequest}

object GetComputersScenario {

    val getComputersScenario = scenario("Get Computers Scenario")
        .exec(GetComputersRequest.get_computers)

}
