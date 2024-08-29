# circe-refined

[![Build](https://github.com/circe/circe-refined/workflows/Continuous%20Integration/badge.svg)](https://github.com/circe/circe-refined/actions)
[![Coverage status](https://img.shields.io/codecov/c/github/circe/circe-refined/main.svg)](https://codecov.io/github/circe/circe-refined)
[![Maven Central](https://img.shields.io/maven-central/v/io.circe/circe-refined_2.13.svg)](https://maven-badges.herokuapp.com/maven-central/io.circe/circe-refined_2.13)

This project provides tools for working with JSON values using [circe][circe] and
[Refined][refined]. It was included in the main circe repository until the 0.14.9 release, when
it was promoted to its own project in order to decouple its releases (and the Scala versions it
is cross-published for) from the main circe modules.

## Versioning

This library releases at a different cadence than [Circe], any apparent relationship between the [Circe] version numbers
and circe-refined version numbers are a coincidence and NOT intentional.  
Please use the following table for determining capability with the corresponding [Circe] versions.

| Circe Refined Version | Circe  | Refined | Scala 2.12 | Scala 2.13 | Scala 3 | Scala JVM | Scala.JS | Scala-Native |
|----------------------|--------|---------|------------|-----------|---------|-----------|----------|--------------|
| 0.15.x               | 0.14.x | 0.11.x  | ✅         | ✅        | ✅      | ✅        | ✅       | ✅           |


## Contributors and participation

This project supports the Typelevel [code of conduct][code-of-conduct] and we want
all of its channels (GitHub, etc.) to be welcoming environments for everyone.

Please see the [circe contributors' guide][contributing] for details on how to submit a pull
request.

## License

circe-refined is licensed under the **[Apache License, Version 2.0][apache]**
(the "License"); you may not use this software except in compliance with the
License.

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

[apache]: http://www.apache.org/licenses/LICENSE-2.0
[api-docs]: https://circe.github.io/circe-optics/api/io/circe/
[circe]: https://github.com/circe/circe
[code-of-conduct]: https://typelevel.org/code-of-conduct
[contributing]: https://circe.github.io/circe/contributing.html
[refined]: https://github.com/fthomas/refined
