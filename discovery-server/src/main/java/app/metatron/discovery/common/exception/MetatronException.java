/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.metatron.discovery.common.exception;

import com.google.common.base.Preconditions;

public class MetatronException extends RuntimeException {

  public static String DEFAULT_GLOBAL_MESSAGE = "Ooops!";

  ErrorCodes code;

  public MetatronException(ErrorCodes code, String message) {
    this(code, message, null);
  }

  public MetatronException(ErrorCodes code, Throwable cause) {
    this(code, cause.getMessage(), cause);
  }

  public MetatronException(ErrorCodes code, String message, Throwable cause) {
    super(message, cause);
    this.code = Preconditions.checkNotNull(code);
  }

  public MetatronException(String message) {
    super(message);
  }

  public MetatronException(String message, Throwable cause) {
    super(message, cause);
  }

  public MetatronException(Throwable cause) {
    super(cause);
  }

  public ErrorCodes getCode() {
    return code;
  }
}
