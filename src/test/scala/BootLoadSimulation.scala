import io.gatling.core.Predef._
import io.gatling.http.Predef._

class BootLoadSimulation extends Simulation {

  private val baseUrl = "http://localhost:8080"
  private val endpoint = "/companies?searchType=bizNum&bizNum=111-11-11111"
  private val contentType = "application/json"
  private val requestCount = 4

  private val simUsers = System.getProperty("SIM_USERS", "1").toInt

  private val httpConf = http
    .baseURL(baseUrl)
    .acceptHeader("application/json;charset=UTF-8")

  private val getCompanyTest = repeat(requestCount) {
    exec(http("get-company-test")
      .get(endpoint)
      .header("Content-Type", contentType)
      .check(status.is(200)))
  }

  private val scn = scenario("BootLoadSimulation")
    .exec(getCompanyTest)

  setUp(scn.inject(atOnceUsers(simUsers))).protocols(httpConf)
}