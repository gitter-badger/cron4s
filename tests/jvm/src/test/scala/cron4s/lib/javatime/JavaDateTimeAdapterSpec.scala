/*
 * Copyright 2017 Antonio Alonso Dominguez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cron4s.lib.javatime

import java.time.{LocalDate, LocalDateTime, LocalTime, ZonedDateTime}

import cron4s.testkit.DateTimeAdapterTestKit

/**
  * Created by alonsodomin on 29/08/2016.
  */
class JavaLocalDateAdapterSpec extends DateTimeAdapterTestKit[LocalDate]("JavaLocalDate") with JavaLocalDateTestBase
class JavaLocalTimeAdapterSpec extends DateTimeAdapterTestKit[LocalTime]("JavaLocalTime") with JavaLocalTimeTestBase
class JavaLocalDateTimeAdapterSpec extends DateTimeAdapterTestKit[LocalDateTime]("JavaLocalDateTime") with JavaLocalDateTimeTestBase
class JavaZonedDateTimeAdapterSpec extends DateTimeAdapterTestKit[ZonedDateTime]("JavaZonedDateTime") with JavaZonedDateTimeTestBase
