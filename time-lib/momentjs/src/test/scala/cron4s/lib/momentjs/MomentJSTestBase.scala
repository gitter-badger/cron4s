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

package cron4s.lib.momentjs

import cron4s.testkit.DateTimeTestKitBase
import moment.{Date, Moment}

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.{Date => JsDate}

/**
  * Created by alonsodomin on 11/04/2017.
  */
trait MomentJSTestBase extends DateTimeTestKitBase[Date] {

  protected def createDateTime(seconds: Int, minutes: Int, hours: Int, dayOfMonth: Int, month: Int, year: Int): Date =
    Moment(new JsDate(year, month - 1, dayOfMonth, hours, minutes, seconds, ms = 0))

}
