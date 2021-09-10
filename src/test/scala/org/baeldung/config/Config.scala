package org.baeldung.config

object Config {

    val app_url = "http://computer-database.gatling.io"

    val users = Integer.getInteger("users", 10).toInt
    val duration = Integer.getInteger("duration", 60).toInt

}
