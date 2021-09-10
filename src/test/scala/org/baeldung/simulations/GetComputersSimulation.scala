package org.baeldung.simulations

import io.gatling.core.Predef.constantUsersPerSec
import org.baeldung.scenarios.GetComputersScenario
import io.gatling.core.Predef.{Simulation, _}
import org.baeldung.config.Config._


class GetComputersSimulation extends Simulation {

    val getComputersExec = GetComputersScenario.getComputersScenario
        .inject(constantUsersPerSec(users) during (duration))

    setUp(getComputersExec)
}
