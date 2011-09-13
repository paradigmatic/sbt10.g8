package $name$

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class StubSpec extends FlatSpec with ShouldMatchers {

  "This spec" should "pass soon or later" in {
    pending
  }

}
